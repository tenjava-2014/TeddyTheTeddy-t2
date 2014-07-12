package com.tenjava.entries.TeddyTheTeddy.t2;

import com.tenjava.entries.TeddyTheTeddy.t2.listeners.RightClickListeners;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class TenJava extends JavaPlugin {

    private Map<Material, Material> blockFromTo = null;

    @Override
    public void onEnable(){

        this.getServer().getPluginManager().registerEvents(new RightClickListeners(this), this);

        populateBlockFromToMap();
    }

    /**
     * Populates the Block From To Block Map, to allow transmutations to work.
     */
    private void populateBlockFromToMap(){
        if(blockFromTo == null){
            getLogger().log(Level.INFO, "Block Transmutations are being registered!");
            blockFromTo = new HashMap<Material, Material>();

            blockFromTo.put(Material.COAL_BLOCK, Material.IRON_BLOCK);
            blockFromTo.put(Material.IRON_BLOCK, Material.GOLD_BLOCK);
            blockFromTo.put(Material.GOLD_BLOCK, Material.DIAMOND_BLOCK);
            blockFromTo.put(Material.DIAMOND_BLOCK, Material.EMERALD_BLOCK);
        } else{
            getLogger().log(Level.INFO, "Block Transmutations are being registered from another place!");
        }
    }

    /**
     * Retrieves the Block From To Map
     * @return Block from To Map
     */
    public Map<Material, Material> getBlockFromTo() {
        return blockFromTo;
    }
}
