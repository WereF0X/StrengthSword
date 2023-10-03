package net.mcreator.strengthswordsmpmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.strengthswordsmpmod.world.inventory.RecipesMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RecipesScreen extends AbstractContainerScreen<RecipesMenu> {
	private final static HashMap<String, Object> guistate = RecipesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RecipesScreen(RecipesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("strengthswordsmpmod:textures/screens/recipes.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("strengthswordsmpmod:textures/screens/sword.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 19, 0, 0, 150, 70, 150, 70);

		RenderSystem.setShaderTexture(0, new ResourceLocation("strengthswordsmpmod:textures/screens/serum.png"));
		this.blit(ms, this.leftPos + 14, this.topPos + 91, 0, 0, 150, 70, 150, 70);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.strengthswordsmpmod.recipes.label_recipes"), 65, 3, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.strengthswordsmpmod.recipes.label_strengthsword"), 5, 13, -3407872);
		this.font.draw(poseStack, Component.translatable("gui.strengthswordsmpmod.recipes.label_strength_serum"), 3, 90, -39373);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
