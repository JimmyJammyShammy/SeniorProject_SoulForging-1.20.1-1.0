package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.ForsakenThrall;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ForsakenThrallModel extends GeoModel<ForsakenThrall> {
    @Override
    public ResourceLocation getModelResource(ForsakenThrall forsakenThrall) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/forsaken_thrall.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ForsakenThrall forsakenThrall) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/forsakenthrall_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ForsakenThrall forsakenThrall) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/forsaken_thrall.animation.json");
    }

    @Override
    public void setCustomAnimations(ForsakenThrall animatable, long instanceId, AnimationState<ForsakenThrall> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
