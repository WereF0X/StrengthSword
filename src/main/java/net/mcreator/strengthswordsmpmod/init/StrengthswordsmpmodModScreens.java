
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.strengthswordsmpmod.client.gui.RecipesScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StrengthswordsmpmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StrengthswordsmpmodModMenus.RECIPES.get(), RecipesScreen::new);
		});
	}
}
