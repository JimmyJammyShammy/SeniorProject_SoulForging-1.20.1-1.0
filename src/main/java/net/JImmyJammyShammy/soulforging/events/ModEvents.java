package net.JImmyJammyShammy.soulforging.events;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.ModEntities;
import net.JImmyJammyShammy.soulforging.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Soul_ForgingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntities.EMBERMAW_STALKER.get(), EmbermawStalker.setAttributes());
        event.put(ModEntities.FLUFFKIP.get(), Fluffkip.setAttributes());
        event.put(ModEntities.THORNCLAW_RAVAGER.get(), ThornclawRavager.setAttributes());
        event.put(ModEntities.FORSAKEN_THRALL.get(), ForsakenThrall.setAttributes());
        event.put(ModEntities.OATHBREAKER_KNIGHT.get(), OathbreakerKnight.setAttributes());
        event.put(ModEntities.WRATHBOUND_BERSERKER.get(), WrathboundBerserker.setAttributes());
        event.put(ModEntities.MALGORTH_FERAL_WARDEN.get(), MalgorthFeralWarden.setAttributes());
        event.put(ModEntities.ARCANIS_IRONWING.get(), ArcanisIronwing.setAttributes());
        event.put(ModEntities.VORTHRAL_ENDLESS_HUNGER.get(), VorthralEndlessHunger.setAttributes());
    }

}
