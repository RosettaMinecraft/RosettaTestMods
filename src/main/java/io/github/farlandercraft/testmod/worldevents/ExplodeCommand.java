package io.github.farlandercraft.testmod.worldevents;

import io.github.farlandercraft.rosettafabric.api.commands.RSAbstractCommand;
import io.github.farlandercraft.rosettafabric.api.commands.RSCommandFactory;
import io.github.farlandercraft.rosettafabric.api.commands.RSCommandSource;
import io.github.farlandercraft.rosettafabric.api.event.minecraft.WorldEvents;

public class ExplodeCommand extends RSCommandFactory {
    public static RSAbstractCommand explodeCommand = new RSAbstractCommand("explode", "rosettatest.commands.explode", new String[0]) {
        @Override
        public void executeFunc(RSCommandSource commandSource) {
            WorldEvents.RosettaExplode(commandSource.getWorld(), commandSource.getEntity(), commandSource.getEntity().getX(), commandSource.getEntity().getY(), commandSource.getEntity().getZ(), 100.0f, true, false);
        }
    };

    @Override
    public void RSCommand(String name, String translation, RSAbstractCommand command) {
        super.RSCommand(name, translation, command);
        super.register(explodeCommand, RSCommandSide.COMMON);
    }
}
