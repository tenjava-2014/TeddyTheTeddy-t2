package com.tenjava.entries.TeddyTheTeddy.t2.timers;

import com.tenjava.entries.TeddyTheTeddy.t2.TenJava;
import com.tenjava.entries.TeddyTheTeddy.t2.Util;
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
            if(Util.checkLight(l.clone())) {
                l.getWorld().playEffect(l.clone().add(-1, 1, -1), Effect.SMOKE, 5);
            }
        }
    }
}
