package net.JImmyJammyShammy.soulforging.item;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Soul_ForgingMod.MODID);

    public static final RegistryObject<Item> PASSIVE_SOUL_SHARD = ITEMS.register("passive_soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOSTILE_SOUL_SHARD = ITEMS.register("hostile_soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PASSIVE_SOUL = ITEMS.register("passive_soul",
            () -> new ForgeSpawnEggItem(ModEntities.EMBERMAW_STALKER, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> HOSTILE_SOUL = ITEMS.register("hostile_soul",
            () -> new ForgeSpawnEggItem(ModEntities.FORSAKEN_THRALL, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> BOSS_SOUL = ITEMS.register("boss_soul",
            () -> new ForgeSpawnEggItem(ModEntities.MALGORTH_FERAL_WARDEN, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> TAINTED_HOSTILE_SOUL = ITEMS.register("tainted_hostile_soul",
            () -> new ForgeSpawnEggItem(ModEntities.WRATHBOUND_BERSERKER, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> TAINTED_PASSIVE_SOUL = ITEMS.register("tainted_passive_soul",
            () -> new ForgeSpawnEggItem(ModEntities.THORNCLAW_RAVAGER, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> TAINTED_BOSS_SOUL = ITEMS.register("tainted_boss_soul",
            () -> new ForgeSpawnEggItem(ModEntities.VORTHRAL_ENDLESS_HUNGER, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> PURE_PASSIVE_SOUL = ITEMS.register("pure_passive_soul",
            () -> new ForgeSpawnEggItem(ModEntities.FLUFFKIP, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> PURE_HOSTILE_SOUL = ITEMS.register("pure_hostile_soul",
            () -> new ForgeSpawnEggItem(ModEntities.OATHBREAKER_KNIGHT, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> PURE_BOSS_SOUL = ITEMS.register("pure_boss_soul",
            () -> new ForgeSpawnEggItem(ModEntities.ARCANIS_IRONWING, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
