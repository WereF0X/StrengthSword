package net.mcreator.strengthswordsmpmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level.getServer(), _ent),
						"/tellraw @a [\"\",{\"text\":\"Strength\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"Sword \",\"bold\":true,\"color\":\"red\"},{\"text\":\"SMP\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"\\n\"},{\"text\":\"FEATURES:\",\"color\":\"aqua\"},{\"text\":\"\\n\"},{\"text\":\"- StrengthSword (3D Model)\\n- Strength Serum (3D Model)\\n- Buff and Debuff Potions (Creative Mode Only)\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"- StrengthBiome (OLD)\\n- StrengthSword Protector (OLD) (/summon Only)\",\"color\":\"dark_green\"},{\"text\":\"\\n\"},{\"text\":\"PRESS Y TO SEE ALL THE RECIPES!\",\"bold\":true,\"color\":\"light_purple\"}]");
			}
		}
	}
}
