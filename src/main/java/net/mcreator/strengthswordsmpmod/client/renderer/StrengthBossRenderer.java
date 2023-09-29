
package net.mcreator.strengthswordsmpmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import net.mcreator.strengthswordsmpmod.entity.StrengthBossEntity;

public class StrengthBossRenderer extends MobRenderer<StrengthBossEntity, PiglinModel<StrengthBossEntity>> {
	public StrengthBossRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StrengthBossEntity entity) {
		return new ResourceLocation("strengthswordsmpmod:textures/entities/d4fc6bcd-148c-4c1d-abaf-4628fa7768fd-15240543.png");
	}
}
