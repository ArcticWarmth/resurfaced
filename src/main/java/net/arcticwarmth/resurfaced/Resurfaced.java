package net.arcticwarmth.resurfaced;

import net.arcticwarmth.resurfaced.item.Tank;
import net.arcticwarmth.resurfaced.util.itemRegister;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import net.minecraft.server.MinecraftServer;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.LevelStem;

public class Resurfaced implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {

        ServerTickEvents.END_SERVER_TICK.register(this::onEndTick);

        itemRegister.register();
    }

    private void onEndTick(MinecraftServer server) {
        //Apply freeze damage to players in cold water
        for (Player player : server.getPlayerList().getPlayers()) {
            //Prob big lag causer right here, yes sir thats him
            if(player.isInWater() && player.canFreeze() && (getBiomeTempFromPlayer(player) < 0.1)) {
                player.setTicksFrozen(200);
                player.hurt(server.getLevel(Level.OVERWORLD).damageSources().freeze(), 0.5F);
            }
            if(!player.isUnderWater()) {
                for (ItemStack itemStack : player.getInventory().items) {
                    if (itemStack.getItem() instanceof Tank) {
                        Tank.setAir(itemStack, Math.min(Tank.getAir(itemStack) + 1, Tank.MAX_AIR));
                    }
                }
            }
            //player.setYHeadRot(0);
        }

    }

    public float getBiomeTempFromPlayer(Player player) {
        return player.level().getBiome(player.blockPosition()).value().getBaseTemperature();
    }
}
