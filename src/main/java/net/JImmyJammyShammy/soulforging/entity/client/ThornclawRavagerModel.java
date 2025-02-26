package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.ThornclawRavager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ThornclawRavagerModel extends GeoModel<ThornclawRavager> {
    @Override
    public ResourceLocation getModelResource(ThornclawRavager thornclawRavager) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/thornclaw_ravager.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ThornclawRavager thornclawRavager) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/thornclawravager_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ThornclawRavager thornclawRavager) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/thornclaw_ravager.animation.json");
    }

    @Override
    public void setCustomAnimations(ThornclawRavager animatable, long instanceId, AnimationState<ThornclawRavager> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
