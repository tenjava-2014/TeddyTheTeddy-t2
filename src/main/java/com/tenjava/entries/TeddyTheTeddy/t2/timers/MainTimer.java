package com.tenjava.entries.TeddyTheTeddy.t2.timers;

import com.tenjava.entries.TeddyTheTeddy.t2.TenJava;
import com.tenjava.entries.TeddyTheTeddy.t2.Util;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thomas on 12/07/2014.
 */
public class MainTimer extends BukkitRunnable {

    private final TenJava pl;

    public MainTimer(TenJava pl) {
        this.pl = pl;
    }

    @Override
    public void run() {
        List<Location> toRemove = new ArrayList<Location>();
        Map<Location, Integer> toSet = new HashMap<Location, Integer>();
        for (Location l : pl.getLoadedTransmutationStructures().keySet()) {
            if (Util.checkStructure(l)) {
                if (pl.getLoadedTransmutationStructures().get(l) <= 0) {
                    toRemove.add(l);
                    if (pl.getBlockFromTo().containsKey(l.getBlock().getType())) {
                        l.getBlock().setType(pl.getBlockFromTo().get(l.getBlock().getType()));
                        l.getWorld().playSound(l, Sound.LEVEL_UP, 1, 1);
                        l.getWorld().playEffect(l, Effect.MOBSPAWNER_FLAMES, 10);
                    }
                } else {
                    toSet.put(l, pl.getLoadedTransmutationStructures().get(l) - 1);
                }
            } else {
                toRemove.add(l);
            }
        }

        for (Location l : toRemove) {
            pl.getLoadedTransmutationStructures().remove(l);
        }

        for (Location l : toSet.keySet()) {
            pl.getLoadedTransmutationStructures().put(l, toSet.get(l));
        }
    }
}
