
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StrengthswordsmpmodModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("strengthswordsmpmod", "strength_sword_smp"),
				builder -> builder.title(Component.translatable("item_group.strengthswordsmpmod.strength_sword_smp")).icon(() -> new ItemStack(Items.BLAZE_POWDER)).displayItems((parameters, tabData) -> {
					tabData.accept(StrengthswordsmpmodModItems.STRENGTH_SWORD.get());
					tabData.accept(StrengthswordsmpmodModItems.STRENGTH_BOSS_SPAWN_EGG.get());
				})

		);
	}
}
