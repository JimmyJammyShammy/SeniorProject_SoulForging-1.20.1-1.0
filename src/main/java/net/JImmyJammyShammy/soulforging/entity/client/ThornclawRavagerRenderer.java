package net.JImmyJammyShammy.soulforging.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.ThornclawRavager;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ThornclawRavagerRenderer extends GeoEntityRenderer<ThornclawRavager> {
    public ThornclawRavagerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ThornclawRavagerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ThornclawRavager animatable) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/thornclawravager_tex.png");
    }

    @Override
    public void render(ThornclawRavager entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
