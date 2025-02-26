package net.JImmyJammyShammy.soulforging.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.EmbermawStalker;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EmbermawStalkerRenderer extends GeoEntityRenderer<EmbermawStalker> {
    public EmbermawStalkerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EmbermawStalkerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(EmbermawStalker animatable) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/embermawstalker_tex.png");
    }

    @Override
    public void render(EmbermawStalker entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
