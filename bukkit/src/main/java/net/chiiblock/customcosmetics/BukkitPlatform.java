package net.chiiblock.customcosmetics;

import net.chiiblock.customcosmetics.listener.ExampleListener;
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
        this.getServer().getPluginManager().registerEvents(new ExampleListener(), this);

    }

    @Override
    public void onDisable() {
        this.plugin.onDisable();
    }
}
