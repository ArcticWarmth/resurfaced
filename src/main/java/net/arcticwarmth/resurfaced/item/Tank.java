package net.arcticwarmth.resurfaced.item;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import net.minecraft.network.chat.contents.TranslatableContents;

import java.util.List;

public class Tank extends Item {
    public static final int MAX_AIR = 300;


    public Tank(Item.Properties settings) {
        super(settings.stacksTo(1));
    }

    public static void setAir(ItemStack stack, int air) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putInt("air", air);
    }

    public static int getAir(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        if(!tag.contains("air")) {
            tag.putInt("air", 300);
        }
        return tag.getInt("air");
    }


    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.resurfaced.air_tank.tooltip.remaining", getAir(itemStack)));

    }

    @Override
    public InteractionResultHolder<ItemStack> use(net.minecraft.world.level.Level world, net.minecraft.world.entity.player.Player player, net.minecraft.world.InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (player.isUnderWater()) {

            int maxPlayerAir = player.getMaxAirSupply(); // Get max air for player
            int maxTankAir = getAir(stack); // Get max air for tank
            int airRequired = maxPlayerAir - player.getAirSupply(); // Calculate how much air to add
            int newPlayerAir = Math.min(airRequired, maxTankAir); // Calculate how much air to add
            System.out.println("Air Required: " + airRequired); // Debug
            System.out.println("New Player Air: " + newPlayerAir); // Debug
            setAir(stack, maxTankAir - newPlayerAir); // Increase air by 300 for each tank
            player.setAirSupply(player.getAirSupply() + newPlayerAir); // Increase player air by 300 for each tank
            System.out.println("Air: " + player.getAirSupply()); // Debug
            System.out.println("Max Air: " + player.getMaxAirSupply()); // Debug
            System.out.println("Tank Air: " + getAir(stack)); // Debug

            //Play use sound

            player.getCooldowns().addCooldown(this, 20); // Should be 400 ticks, but 20 for testing
            world.playSound(player, player.getOnPos(), SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, 3.0F, 1.0F);
        }
        return super.use(world, player, hand);
    }


}
