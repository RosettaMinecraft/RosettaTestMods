package io.github.farlandercraft.testmod;

import io.github.farlandercraft.testmod.worldevents.ExplodeCommand;
import net.fabricmc.api.ModInitializer;


public class ExampleMod implements ModInitializer {

	ExplodeCommand explodeCommand = new ExplodeCommand();

	@Override
	public void onInitialize() {
		explodeCommand.RSCommand("explode", "rstest.commands.explode", ExplodeCommand.explodeCommand);
	}
}
