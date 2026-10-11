package net.chiiblock.customcosmetics;

public record CustomCosmeticsAPI(CustomCosmetics plugin) {
    private static CustomCosmeticsAPI instance;

    public CustomCosmeticsAPI(CustomCosmetics plugin) {
        this.plugin = plugin;
        instance = this;
    }

    public static CustomCosmeticsAPI getInstance() {
        if (instance == null) {
            throw new RuntimeException("CustomCosmetics API has not been initialized yet.");
        }
        return instance;
    }
}