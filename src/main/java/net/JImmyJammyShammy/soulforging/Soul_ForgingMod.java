package net.JImmyJammyShammy.soulforging;

import com.mojang.logging.LogUtils;
import net.JImmyJammyShammy.soulforging.entity.ModEntities;
import net.JImmyJammyShammy.soulforging.entity.client.*;
import net.JImmyJammyShammy.soulforging.entity.custom.ForsakenThrall;
import net.JImmyJammyShammy.soulforging.item.ModCreativeModeTabs;
import net.JImmyJammyShammy.soulforging.item.ModItems;
import net.JImmyJammyShammy.soulforging.loot.ModLootModifiers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Soul_ForgingMod.MODID)
public class Soul_ForgingMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "soul_forging";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Soul_ForgingMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        ModItems.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ;
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.EMBERMAW_STALKER.get(), EmbermawStalkerRenderer::new);
            EntityRenderers.register(ModEntities.FLUFFKIP.get(), FluffkipRenderer::new);
            EntityRenderers.register(ModEntities.THORNCLAW_RAVAGER.get(), ThornclawRavagerRenderer::new);
            EntityRenderers.register(ModEntities.FORSAKEN_THRALL.get(), ForsakenThrallRenderer::new);
            EntityRenderers.register(ModEntities.OATHBREAKER_KNIGHT.get(), OathbreakerKnightRenderer::new);
            EntityRenderers.register(ModEntities.WRATHBOUND_BERSERKER.get(), WrathboundBerserkerRenderer::new);
            EntityRenderers.register(ModEntities.MALGORTH_FERAL_WARDEN.get(), MalgorthFeralWardenRenderer::new);
            EntityRenderers.register(ModEntities.ARCANIS_IRONWING.get(), ArcanisIronwingRenderer::new);
            EntityRenderers.register(ModEntities.VORTHRAL_ENDLESS_HUNGER.get(), VorthralEndlessHungerRenderer::new);
        }
    }
}
