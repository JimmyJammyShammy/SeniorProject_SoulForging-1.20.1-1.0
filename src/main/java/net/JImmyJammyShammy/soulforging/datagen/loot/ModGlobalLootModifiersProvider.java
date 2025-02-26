package net.JImmyJammyShammy.soulforging.datagen.loot;

import net.JImmyJammyShammy.soulforging.Soul_ForgingMod;
import net.JImmyJammyShammy.soulforging.item.ModItems;
import net.JImmyJammyShammy.soulforging.loot.AddLootModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Soul_ForgingMod.MODID);
    }

    @Override
    protected void start() {
        add("passive_soul_shard_from_cow", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/cow")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_chicken", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/chicken")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_cod", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/cod")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_cat", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/cat")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_donkey", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/donkey")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_fox", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/fox")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_frog", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build(),
                LootItemRandomChanceCondition.randomChance(0.60f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_squid", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/squid")).build(),
                LootItemRandomChanceCondition.randomChance(0.60f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_horse", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/horse")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_mooshroom", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/mooshroom")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_parrot", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/parrot")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_pig", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/pig")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_rabbit", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/rabbit")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_salmon", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/salmon")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_sheep", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/sheep")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_sniffer", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/sniffer")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_strider", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/strider")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_turtle", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/turtle")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_villager", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/villager")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_wandering_trader", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wandering_trader")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_bee", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/bee")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_dolphin", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/dolphin")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_goat", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/goat")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_llama", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/llama")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("passive_soul_shard_from_panda", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/panda")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()},
                ModItems.PASSIVE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_blaze", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/blaze")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_creeper", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_drowned", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/drowned")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_endermite", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/endermite")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_evoker", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/evoker")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_ghast", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ghast")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_guardian", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_hoglin", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/hoglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_husk", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/husk")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_phantom", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/phantom")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_piglin", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_piglin_brute", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin_brute")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_pillager", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/pillager")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_ravager", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ravager")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_spider", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_shulker", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/shulker")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_silverfish", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/silverfish")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_skeleton", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_slime", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/slime")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_stray", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/stray")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_vex", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vex")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_vindicator", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vindicator")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_witch", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/witch")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_wither_skeleton", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_cave_spider", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/cave_spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_zombie", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("hostile_soul_shard_from_zombie_villager", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie_villager")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.HOSTILE_SOUL_SHARD.get()));
        add("boss_soul_from_warden", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.BOSS_SOUL.get()));
        add("boss_soul_from_ender_dragon", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()},
                ModItems.BOSS_SOUL.get()));
        add("boss_soul_from_wither", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()},
                ModItems.BOSS_SOUL.get()));
        add("boss_soul_from_elder_guardian", new AddLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()},
                ModItems.BOSS_SOUL.get()));

    }





}

