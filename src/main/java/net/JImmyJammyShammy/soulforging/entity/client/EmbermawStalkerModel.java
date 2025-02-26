package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.EmbermawStalker;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

import java.util.function.Supplier;


public class EmbermawStalkerModel extends GeoModel<EmbermawStalker> {
  

    @Override
    public ResourceLocation getModelResource(EmbermawStalker embermawStalker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/embermaw_stalker.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmbermawStalker embermawStalker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/embermawstalker_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmbermawStalker embermawStalker) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/embermaw_stalker.animation.json");
    }

    @Override
    public void setCustomAnimations(EmbermawStalker animatable, long instanceId, AnimationState<EmbermawStalker> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }


}
