
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.strengthswordsmpmod.entity.StrengthBossEntity;
import net.mcreator.strengthswordsmpmod.StrengthswordsmpmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StrengthswordsmpmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StrengthswordsmpmodMod.MODID);
	public static final RegistryObject<EntityType<StrengthBossEntity>> STRENGTH_BOSS = register("strength_boss", EntityType.Builder.<StrengthBossEntity>of(StrengthBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(StrengthBossEntity::new).fireImmune().sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			StrengthBossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STRENGTH_BOSS.get(), StrengthBossEntity.createAttributes().build());
	}
}
