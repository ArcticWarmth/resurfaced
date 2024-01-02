package net.arcticwarmth.resurfaced;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.Ingredient;


public class ScubaGearMaterial implements ArmorMaterial {

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        //return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
        return 520;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return 1;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(MinecartItem.byId(504));
    }

    @Override
    public String getName() {
        return "scuba_gear";
    }

    @Override
    public float getToughness() {
        return 1.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }


}

