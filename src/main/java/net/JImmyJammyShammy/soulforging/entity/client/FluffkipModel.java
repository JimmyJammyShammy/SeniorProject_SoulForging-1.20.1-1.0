package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.Fluffkip;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class FluffkipModel extends GeoModel<Fluffkip> {
    @Override
    public ResourceLocation getModelResource(Fluffkip fluffkip) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/fluffkip.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Fluffkip fluffkip) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/fluffkip_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Fluffkip fluffkip) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/fluffkip.animation.json");
    }

    @Override
    public void setCustomAnimations(Fluffkip animatable, long instanceId, AnimationState<Fluffkip> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
