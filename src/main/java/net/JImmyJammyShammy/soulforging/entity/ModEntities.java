package net.JImmyJammyShammy.soulforging.entity;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.custom.*;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Soul_ForgingMod.MODID);


    public static final RegistryObject<EntityType<EmbermawStalker>> EMBERMAW_STALKER =
            ENTITY_TYPES.register("embermaw_stalker",
                    () -> EntityType.Builder.of(EmbermawStalker::new, MobCategory.CREATURE)
                            .sized(1, 0.5f)
                    .build(new ResourceLocation(Soul_ForgingMod.MODID, "embermaw_stalker")
                            .toString()))  ;

    public static final RegistryObject<EntityType<Fluffkip>> FLUFFKIP =
            ENTITY_TYPES.register("fluffkip",
                    () -> EntityType.Builder.of(Fluffkip::new, MobCategory.CREATURE)
                            .sized(1, 1f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "fluffkip")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<ThornclawRavager>> THORNCLAW_RAVAGER =
            ENTITY_TYPES.register("thornclaw_ravager",
                    () -> EntityType.Builder.of(ThornclawRavager::new, MobCategory.CREATURE)
                            .sized(1, 1.2f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "thornclaw_ravager")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<ForsakenThrall>> FORSAKEN_THRALL =
            ENTITY_TYPES.register("forsaken_thrall",
                    () -> EntityType.Builder.of(ForsakenThrall::new, MobCategory.CREATURE)
                            .sized(1, 2f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "forsaken_thrall")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<OathbreakerKnight>> OATHBREAKER_KNIGHT =
            ENTITY_TYPES.register("oathbreaker_knight",
                    () -> EntityType.Builder.of(OathbreakerKnight::new, MobCategory.CREATURE)
                            .sized(1, 2.5f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "oathbreaker_knight")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<WrathboundBerserker>> WRATHBOUND_BERSERKER =
            ENTITY_TYPES.register("wrathbound_berserker",
                    () -> EntityType.Builder.of(WrathboundBerserker::new, MobCategory.CREATURE)
                            .sized(1, 2.5f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "wrathbound_berserker")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<MalgorthFeralWarden>> MALGORTH_FERAL_WARDEN =
            ENTITY_TYPES.register("malgorth_the_feral_warden",
                    () -> EntityType.Builder.of(MalgorthFeralWarden::new, MobCategory.CREATURE)
                            .sized(1, 3f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "malgorth_the_feral_warden")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<ArcanisIronwing>> ARCANIS_IRONWING =
            ENTITY_TYPES.register("arcanis_the_ironwing",
                    () -> EntityType.Builder.of(ArcanisIronwing::new, MobCategory.CREATURE)
                            .sized(1, 3f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "arcanis_the_ironwing")
                                    .toString()))  ;

    public static final RegistryObject<EntityType<VorthralEndlessHunger>> VORTHRAL_ENDLESS_HUNGER =
            ENTITY_TYPES.register("vorthral_the_endless_hunger",
                    () -> EntityType.Builder.of(VorthralEndlessHunger::new, MobCategory.CREATURE)
                            .sized(1, 3f)
                            .build(new ResourceLocation(Soul_ForgingMod.MODID, "vorthral_the_endless_hunger")
                                    .toString()))  ;

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
