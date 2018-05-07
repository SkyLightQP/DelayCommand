package kr.skylightqp.delaycommand;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class MainComamnd implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player p = (Player) sender;
        if(args.length > 0){
            String name = String.join(" ", Arrays.copyOfRange(args, 0, args.length));
            Bukkit.getScheduler().scheduleSyncDelayedTask(DelayCommand.getPlugin(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.dispatchCommand(sender,name);
                }
            },10L);
        }
        else p.sendMessage("§c[DelayCommand] /delaycommand <명령어> - 0.5 초 후 실행");
        return false;
    }
}
