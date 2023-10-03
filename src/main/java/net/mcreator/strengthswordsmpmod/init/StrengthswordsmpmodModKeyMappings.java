
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.strengthswordsmpmod.init;

import org.lwjgl.glfw.GLFW;

import org.checkerframework.checker.units.qual.K;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.strengthswordsmpmod.network.YMessage;
import net.mcreator.strengthswordsmpmod.StrengthswordsmpmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StrengthswordsmpmodModKeyMappings {
	public static final KeyMapping K = new KeyMapping("key.strengthswordsmpmod.k", GLFW.GLFW_KEY_K, "key.categories.misc");
	public static final KeyMapping Y = new KeyMapping("key.strengthswordsmpmod.y", GLFW.GLFW_KEY_Y, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StrengthswordsmpmodMod.PACKET_HANDLER.sendToServer(new YMessage(0, 0));
				YMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(K);
		event.register(Y);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				Y.consumeClick();
			}
		}
	}
}
