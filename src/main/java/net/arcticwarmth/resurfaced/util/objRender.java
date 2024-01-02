package net.arcticwarmth.resurfaced.util;

import com.mojang.blaze3d.vertex.PoseStack;
import net.arcticwarmth.resurfaced.model.ScubaHat;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.model.HumanoidModel;

import net.minecraft.client.renderer.MultiBufferSource;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.texture.OverlayTexture;

import static net.arcticwarmth.resurfaced.util.itemRegister.SCUBA_HELMET;

public class objRender implements ArmorRenderer {
    private static final ScubaHat MODEL = new ScubaHat(ScubaHat.createBodyLayer().bakeRoot());
    private static final ResourceLocation TEXTURE = new ResourceLocation("resurfaced", "textures/entity/scuba_helmet.png");

    public objRender() {

    }


    @Override
    public void render(PoseStack matrices, MultiBufferSource vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, HumanoidModel<LivingEntity> contextModel) {
        MODEL.setupAnim(entity, 0, 0, 0, 0, 0);
        MODEL.renderToBuffer(matrices, vertexConsumers.getBuffer(MODEL.renderType(TEXTURE)), light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);

    }
}