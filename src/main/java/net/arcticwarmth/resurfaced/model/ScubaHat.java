package net.arcticwarmth.resurfaced.model;// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ScubaHat<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    private final ModelPart bipedHead;


    public ScubaHat(ModelPart root) {
        this.bipedHead = root.getChild("bipedHead");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead", CubeListBuilder.create().texOffs(46, 27).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 47).addBox(4.0F, -8.0F, -4.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(39, 42).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(30, 10).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(9, 13).addBox(-4.0F, 0.0F, -4.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(9, 13).addBox(1.0F, 0.0F, -4.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(30, 26).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(33, 39).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(29, 33).addBox(-4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 1).addBox(3.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 42).addBox(1.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 31).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 31).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 23).addBox(-2.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(2.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(-3.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(-3.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(2.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(-1.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(0.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(-1.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 36).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition nConnect = bipedHead.addOrReplaceChild("nConnect", CubeListBuilder.create().texOffs(12, 7).addBox(-11.0F, 1.0F, 5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 12).addBox(-10.0F, 3.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 34).addBox(-9.0F, 4.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 4).addBox(-11.0F, 1.0F, 11.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 4).addBox(-10.0F, 3.0F, 11.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 17).addBox(-9.0F, 4.0F, 11.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, -8.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bipedHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }


}