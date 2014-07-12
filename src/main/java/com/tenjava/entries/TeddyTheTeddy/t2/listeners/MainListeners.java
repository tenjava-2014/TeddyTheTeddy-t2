package com.tenjava.entries.TeddyTheTeddy.t2.listeners;

import com.tenjava.entries.TeddyTheTeddy.t2.TenJava;
import com.tenjava.entries.TeddyTheTeddy.t2.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Random;

/**
 * Created by Thomas on 12/07/2014.
 */
public class MainListeners implements Listener {

    private final TenJava pl;
    private final Random random;

    public MainListeners(TenJava pl) {
        this.pl = pl;
        random = new Random();
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        if(pl.getLoadedTransmutationStructures().containsKey(event.getBlock().getLocation())){
            pl.getLoadedTransmutationStructures().remove(event.getBlock().getLocation());
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.isCancelled()) {
            return;
        }

        if (event.getPlayer().getWorld().getEnvironment() != World.Environment.NORMAL) {
            return;
        }

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getPlayer().getItemInHand().getType() == Material.NETHER_STAR) {
                if (pl.getBlockFromTo().containsKey(event.getClickedBlock().getType())) {
                    if (pl.getBlockFromTo().get(event.getClickedBlock().getType()) == event.getClickedBlock().getLocation().add(0, -1, 0).getBlock().getType()) {
                        if (event.getPlayer().hasPermission("transmutation.do")) {
                            if (pl.getLoadedTransmutationStructures().containsKey(event.getClickedBlock().getLocation())) {
                                event.getPlayer().sendMessage(ChatColor.RED + "Structure is already transmuting!");
                            } else {
                                if (Util.checkStructure(event.getClickedBlock().getLocation())) {
                                    event.getPlayer().sendMessage(ChatColor.GREEN + "Transmutation has started!");
                                    pl.getLoadedTransmutationStructures().put(event.getClickedBlock().getLocation(), random.nextInt(10)+1);
                                } else {
                                    event.getPlayer().sendMessage(ChatColor.RED + "Invalid Transmutation Structure");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
