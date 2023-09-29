
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.strengthswordsmpmod.StrengthswordsmpmodMod;

public class StrengthswordsmpmodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, StrengthswordsmpmodMod.MODID);
	public static final RegistryObject<Potion> BUFF = REGISTRY.register("buff", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800, 0, false, false), new MobEffectInstance(MobEffects.DIG_SPEED, 800, 0, false, false),
			new MobEffectInstance(MobEffects.HEAL, 300, 1, false, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 0, false, false)));
	public static final RegistryObject<Potion> DEBUFF = REGISTRY.register("debuff",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0, false, false), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 600, 0, false, false), new MobEffectInstance(MobEffects.WEAKNESS, 600, 0, false, false)));
}
