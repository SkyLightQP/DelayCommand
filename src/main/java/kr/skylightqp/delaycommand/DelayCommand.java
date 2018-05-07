package kr.skylightqp.delaycommand;

import org.bukkit.plugin.java.JavaPlugin;

public class DelayCommand extends JavaPlugin {
    private static DelayCommand plugin;

    public void onEnable(){
        plugin = this;
        getCommand("delaycommand").setExecutor(new MainComamnd());
        getLogger().info("Enable Plugin!");
    }

    public static DelayCommand getPlugin(){
        return plugin;
    }

    public void onDisable(){
        getLogger().info("Disable Plugin!");
    }
}
