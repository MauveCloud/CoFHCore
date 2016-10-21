package cofh.core.command;

import cofh.CoFHCore;
import cofh.lib.util.helpers.StringHelper;

import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class CommandVersion implements ISubCommand {

	public static CommandVersion instance = new CommandVersion();

	/* ISubCommand */
	@Override
	public String getCommandName() {

		return "version";
	}

	@Override
	public int getPermissionLevel() {

		return -1;
	}

	@Override
	public void handleCommand(MinecraftServer server, ICommandSender sender, String[] arguments) throws CommandException {

		sender.addChatMessage(new TextComponentString(StringHelper.localize("info.cofh.command.version.0") + " " + CoFHCore.version + "."));
	}

	@Override
	public List<String> addTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args) {

		return null;
	}

}
