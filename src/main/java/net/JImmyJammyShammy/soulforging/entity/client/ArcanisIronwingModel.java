package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.ArcanisIronwing;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ArcanisIronwingModel extends GeoModel<ArcanisIronwing> {
    @Override
    public ResourceLocation getModelResource(ArcanisIronwing arcanisIronwing) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/arcanis_ironwing.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArcanisIronwing arcanisIronwing) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/arcanisironwing_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArcanisIronwing arcanisIronwing) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/arcanis_ironwing.animation.json");
    }

    @Override
    public void setCustomAnimations(ArcanisIronwing animatable, long instanceId, AnimationState<ArcanisIronwing> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
