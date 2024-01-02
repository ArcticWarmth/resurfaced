package net.arcticwarmth.resurfaced.util;

import net.arcticwarmth.resurfaced.ScubaGearMaterial;
import net.arcticwarmth.resurfaced.item.Tank;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import net.minecraft.world.item.*;
import net.minecraft.resources.ResourceLocation;

public class itemRegister {
    public static final ArmorMaterial SCUBA_GEAR = new ScubaGearMaterial();

    public static final Item SCUBA_HELMET = new ArmorItem(SCUBA_GEAR, ArmorItem.Type.HELMET, new Item.Properties());
    //TODO: readd to creative tab
    public static final Item AIR_TANK = new Tank(new Item.Properties());

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("resurfaced", "scuba_helmet"), SCUBA_HELMET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("resurfaced", "air_tank"), AIR_TANK);

    }



}
