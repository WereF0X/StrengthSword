
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.strengthswordsmpmod.item.StrengthSyrumItem;
import net.mcreator.strengthswordsmpmod.item.StrengthSwordItem;
import net.mcreator.strengthswordsmpmod.StrengthswordsmpmodMod;

public class StrengthswordsmpmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StrengthswordsmpmodMod.MODID);
	public static final RegistryObject<Item> STRENGTH_SWORD = REGISTRY.register("strength_sword", () -> new StrengthSwordItem());
	public static final RegistryObject<Item> STRENGTH_SYRUM = REGISTRY.register("strength_syrum", () -> new StrengthSyrumItem());
	public static final RegistryObject<Item> STRENGTH_BOSS_SPAWN_EGG = REGISTRY.register("strength_boss_spawn_egg", () -> new ForgeSpawnEggItem(StrengthswordsmpmodModEntities.STRENGTH_BOSS, -6750208, -16777216, new Item.Properties()));
}
