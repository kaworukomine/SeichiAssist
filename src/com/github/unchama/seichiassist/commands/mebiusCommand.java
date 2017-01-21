package com.github.unchama.seichiassist.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import com.github.unchama.seichiassist.SeichiAssist;
import com.github.unchama.seichiassist.listener.MebiusListener;

public class mebiusCommand implements TabExecutor {

	public mebiusCommand(SeichiAssist plugin) {
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		return null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 1 && args[0].equals("get")) {
			MebiusListener.give((Player) sender);
		} else if (args.length == 2 && args[0].equals("naming")) {
			if (!MebiusListener.setName((Player) sender, args[1])) {
				sender.sendMessage("命名はMEBIUSを装備して行ってください。");
			}
		}
		return true;
	}

}
