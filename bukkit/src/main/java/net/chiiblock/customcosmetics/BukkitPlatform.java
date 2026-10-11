package net.chiiblock.customcosmetics;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlatform extends JavaPlugin implements Platform {
    private CustomCosmetics plugin;

    @Override
    public String platform() {
        return "Bukkit";
    }

    @Override
    public void onLoad() {
        this.plugin = new BukkitCustomCosmetics();
        this.plugin.load();
    }

    @Override
    public void onEnable() {
        this.plugin.enable();
    }

    @Override
    public void onDisable() {
        this.plugin.onDisable();
    }
}
