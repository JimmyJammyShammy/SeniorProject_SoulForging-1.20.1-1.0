package net.JImmyJammyShammy.soulforging.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.MalgorthFeralWarden;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MalgorthFeralWardenRenderer extends GeoEntityRenderer<MalgorthFeralWarden> {
    public MalgorthFeralWardenRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MalgorthFeralWardenModel());
    }

    @Override
    public ResourceLocation getTextureLocation(MalgorthFeralWarden animatable) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/malgorthferalwarden_tex.png");
    }

    @Override
    public void render(MalgorthFeralWarden entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
