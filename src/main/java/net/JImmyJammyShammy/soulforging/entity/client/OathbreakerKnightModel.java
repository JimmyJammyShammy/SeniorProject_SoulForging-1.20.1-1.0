package net.JImmyJammyShammy.soulforging.entity.client;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.OathbreakerKnight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class OathbreakerKnightModel extends GeoModel<OathbreakerKnight> {
    @Override
    public ResourceLocation getModelResource(OathbreakerKnight oathbreakerKnight) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "geo/oathbreaker_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OathbreakerKnight oathbreakerKnight) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "textures/entity/oathbreakerknight_tex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OathbreakerKnight oathbreakerKnight) {
        return new ResourceLocation((Soul_ForgingMod.MODID), "animations/oathbreaker_knight.animation.json");
    }

    @Override
    public void setCustomAnimations(OathbreakerKnight animatable, long instanceId, AnimationState<OathbreakerKnight> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Helmet");

        if(head != null){
            EntityModelData entityData = animationState.getData((DataTickets.ENTITY_MODEL_DATA));

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
