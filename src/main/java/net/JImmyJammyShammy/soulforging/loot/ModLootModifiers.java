package net.JImmyJammyShammy.soulforging.loot;

import com.mojang.serialization.Codec;
import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Soul_ForgingMod.MODID);

    public static final RegistryObject<Codec<?extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZER.register("add_item", AddLootModifier.CODEC);



    public static void register(IEventBus eventBus){
        LOOT_MODIFIER_SERIALIZER.register(eventBus);
    }



}
