package com.tenjava.entries.TeddyTheTeddy.t2.timers;

import com.tenjava.entries.TeddyTheTeddy.t2.TenJava;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Thomas on 12/07/2014.
 */
public class EffectTimer extends BukkitRunnable {

    private final TenJava pl;

    private int tick = 0;

    public EffectTimer(TenJava pl) {
        this.pl = pl;
    }

    @Override
    public void run() {
        tick++;
        if(tick == 2){
            tick = 0;
        }

        for(Location l : pl.getLoadedTransmutationStructures().keySet()){
            l.getWorld().playEffect(l, Effect.STEP_SOUND, 145);
            if(tick == 0){
                l.getWorld().playSound(l, Sound.ANVIL_LAND, 2, 1);
            } else {
                l.getWorld().playSound(l, Sound.ANVIL_LAND, 1, 1);
            }
        }
    }
}
