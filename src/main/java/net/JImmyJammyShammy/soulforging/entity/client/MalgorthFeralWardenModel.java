package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.MalgorthFeralWarden;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class MalgorthFeralWardenModel extends GeoModel<MalgorthFeralWarden> {
    @Override
    public ResourceLocation getModelResource(MalgorthFeralWarden malgorthFeralWarden) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/malgorth_feral_warden.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MalgorthFeralWarden malgorthFeralWarden) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/malgorthferalwarden_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MalgorthFeralWarden malgorthFeralWarden) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/malgorth_feral_warden.animation.json");
    }

    @Override
    public void setCustomAnimations(MalgorthFeralWarden animatable, long instanceId, AnimationState<MalgorthFeralWarden> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
