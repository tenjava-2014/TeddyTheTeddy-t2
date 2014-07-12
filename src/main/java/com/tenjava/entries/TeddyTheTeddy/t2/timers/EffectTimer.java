package com.tenjava.entries.TeddyTheTeddy.t2.timers;

import com.tenjava.entries.TeddyTheTeddy.t2.TenJava;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Thomas on 12/07/2014.
 */
public class EffectTimer extends BukkitRunnable {

    private final TenJava pl;

    public EffectTimer(TenJava pl){
        this.pl = pl;
    }

    @Override
    public void run() {
        for(Location l : pl.getLoadedTransmutationStructures().keySet()){
            l.getWorld().playEffect(l, Effect.SMOKE, 5);
        }
    }
}
