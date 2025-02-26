package net.JImmyJammyShammy.soulforging.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.WrathboundBerserker;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WrathboundBerserkerRenderer extends GeoEntityRenderer<WrathboundBerserker> {
    public WrathboundBerserkerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WrathboundBerserkerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(WrathboundBerserker animatable) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/wrathboundberserker_tex.png");
    }

    @Override
    public void render(WrathboundBerserker entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
