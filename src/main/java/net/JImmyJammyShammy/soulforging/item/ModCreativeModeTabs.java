package net.JImmyJammyShammy.soulforging.item;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Soul_ForgingMod.MODID);

    public static final RegistryObject<CreativeModeTab> SOUL_FORGING_TAB = CREATIVE_MODE_TABS.register("soul_forging",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.BOSS_SOUL.get())))
                    .title(Component.translatable("creativetab.soul_forging"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PASSIVE_SOUL_SHARD.get());
                        output.accept(ModItems.HOSTILE_SOUL_SHARD.get());
                        output.accept(ModItems.BOSS_SOUL.get());
                        output.accept(ModItems.PASSIVE_SOUL.get());
                        output.accept(ModItems.HOSTILE_SOUL.get());
                        output.accept(ModItems.PURE_PASSIVE_SOUL.get());
                        output.accept(ModItems.PURE_HOSTILE_SOUL.get());
                        output.accept(ModItems.PURE_BOSS_SOUL.get());
                        output.accept(ModItems.TAINTED_PASSIVE_SOUL.get());
                        output.accept(ModItems.TAINTED_HOSTILE_SOUL.get());
                        output.accept(ModItems.TAINTED_BOSS_SOUL.get());
            }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
