package net.arcticwarmth.resurfaced.client;

import net.arcticwarmth.resurfaced.util.itemRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.arcticwarmth.resurfaced.util.objRender;

public class ResurfacedClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        System.out.println("Attempting to register armor model");
        ArmorRenderer.register(new objRender(), itemRegister.SCUBA_HELMET);
        System.out.println("Registered armor renderer");
    }
}
