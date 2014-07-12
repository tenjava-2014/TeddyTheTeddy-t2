package com.tenjava.entries.TeddyTheTeddy.t2;

import com.tenjava.entries.TeddyTheTeddy.t2.listeners.MainListeners;
import com.tenjava.entries.TeddyTheTeddy.t2.timers.EffectTimer;
import com.tenjava.entries.TeddyTheTeddy.t2.timers.MainTimer;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class TenJava extends JavaPlugin {

    private Map<Material, Material> blockFromTo = null;
    private Map<Location, Integer> loadedTransmutationStructures = null;

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new MainListeners(this), this);
        this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new MainTimer(this), 20 * 20, 20 * 20);
        this.getServer().getScheduler().runTaskTimerAsynchronously(this, new EffectTimer(this), 10, 10);
        populateBlockFromToMap();
        loadTransmutationStructures();
    }

    /**
     * Populates the Block From To Block Map, to allow transmutations to work.
     */
    private void populateBlockFromToMap() {
        if (blockFromTo == null) {
            getLogger().log(Level.INFO, "Block Transmutations are being registered!");
            blockFromTo = new HashMap<Material, Material>();

            blockFromTo.put(Material.COAL_BLOCK, Material.IRON_BLOCK);
            blockFromTo.put(Material.IRON_BLOCK, Material.GOLD_BLOCK);
            blockFromTo.put(Material.GOLD_BLOCK, Material.DIAMOND_BLOCK);
            blockFromTo.put(Material.DIAMOND_BLOCK, Material.EMERALD_BLOCK);
        } else {
            getLogger().log(Level.INFO, "Block Transmutations are being registered from another place!");
        }
    }

    /**
     * Loads in all the Transmutation structures.
     * To do - Config with it
     */
    private void loadTransmutationStructures() {
        loadedTransmutationStructures = new HashMap<Location, Integer>();
    }

    /**
     * Retrieves the Block From To Map
     *
     * @return Block from To Map
     */
    public Map<Material, Material> getBlockFromTo() {
        return blockFromTo;
    }

    /**
     * Retrieves the loaded Transmutation structures
     *
     * @return Transmutation Structures list
     */
    public Map<Location, Integer> getLoadedTransmutationStructures() {
        return loadedTransmutationStructures;
    }
}
