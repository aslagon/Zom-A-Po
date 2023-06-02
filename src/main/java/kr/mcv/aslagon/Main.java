package kr.mcv.aslagon;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("zom a po plugin has started");
        getServer().getPluginManager().registerEvents(new FallEvent(), this);
        getServer().getPluginManager().registerEvents(new ZombieEvent(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("zom a po plugin has stopped");
    }
}