package net.chiiblock.customcosmetics;

public abstract class CustomCosmetics {
    private static CustomCosmetics instance;

    public void load() {

    }

    public void enable() {
        // check plugin update
    }

    public void onDisable() {

    }

    public static CustomCosmetics getInstance() {
        return instance;
    }
}
