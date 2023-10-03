
package net.mcreator.strengthswordsmpmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.strengthswordsmpmod.procedures.StrengthSwordRightclickedProcedure;
import net.mcreator.strengthswordsmpmod.procedures.StrengthSwordEntitySwingsItemProcedure;

import java.util.List;

public class StrengthSwordItem extends SwordItem {
	public StrengthSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 3.5f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StrengthSwordRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Abilities:"));
		list.add(Component.literal("Right click: Strength"));
		list.add(Component.literal("Left click: Lightning Bolt"));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		StrengthSwordEntitySwingsItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
