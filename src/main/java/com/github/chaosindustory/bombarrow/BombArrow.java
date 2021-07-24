package com.github.chaosindustory.bombarrow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BombArrow extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Arrow(), this);
        Bukkit.getLogger().info("BarbedWire becomes valid!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("BarbedWire becomes invalid!");
    }
}
