package net.JImmyJammyShammy.soulforging.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.ArcanisIronwing;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ArcanisIronwingRenderer extends GeoEntityRenderer<ArcanisIronwing> {
    public ArcanisIronwingRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ArcanisIronwingModel());


    }

    @Override
    public ResourceLocation getTextureLocation(ArcanisIronwing animatable) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/arcanisironwing_tex.png");
    }

    @Override
    public void render(ArcanisIronwing entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
