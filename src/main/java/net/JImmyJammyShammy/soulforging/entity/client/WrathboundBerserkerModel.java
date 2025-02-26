package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.WrathboundBerserker;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class WrathboundBerserkerModel extends GeoModel<WrathboundBerserker> {
    @Override
    public ResourceLocation getModelResource(WrathboundBerserker wrathboundBerserker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/wrathbound_berserker.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WrathboundBerserker wrathboundBerserker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/wrathboundberserker_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WrathboundBerserker wrathboundBerserker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/wrathbound_berserker.animation.json");
    }

    @Override
    public void setCustomAnimations(WrathboundBerserker animatable, long instanceId, AnimationState<WrathboundBerserker> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
