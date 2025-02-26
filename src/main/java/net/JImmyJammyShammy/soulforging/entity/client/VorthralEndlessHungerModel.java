package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.VorthralEndlessHunger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class VorthralEndlessHungerModel extends GeoModel<VorthralEndlessHunger> {
    @Override
    public ResourceLocation getModelResource(VorthralEndlessHunger vorthralEndlessHunger) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/vorthral_endless_hunger.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VorthralEndlessHunger vorthralEndlessHunger) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/vorthralendlesshunger_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VorthralEndlessHunger vorthralEndlessHunger) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/vorthral_endless_hunger.animation.json");
    }

    @Override
    public void setCustomAnimations(VorthralEndlessHunger animatable, long instanceId, AnimationState<VorthralEndlessHunger> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
