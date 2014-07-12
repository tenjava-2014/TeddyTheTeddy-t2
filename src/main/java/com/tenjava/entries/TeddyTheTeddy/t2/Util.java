package com.tenjava.entries.TeddyTheTeddy.t2;

import org.bukkit.Location;
import org.bukkit.Material;

/**
 * Created by Thomas on 12/07/2014.
 */
public class Util {

    /**
     * Checks if the Structure is correct
     * @param mainBlock The transmuted block
     * @return Is structure correct?
     */
    public static boolean checkStructure(Location mainBlock){
        Location l = mainBlock.add(0, -1, 0);

        if(l.clone().add(1,0,0).getBlock().getType() == Material.GLOWSTONE){
            if(l.clone().add(0,0,1).getBlock().getType() == Material.GLOWSTONE){
                if(l.clone().add(1,0,1).getBlock().getType() == Material.GLOWSTONE){
                    if(l.clone().add(-1,0,0).getBlock().getType() == Material.GLOWSTONE){
                        if(l.clone().add(0,0,-1).getBlock().getType() == Material.GLOWSTONE){
                            if(l.clone().add(-1,0,-1).getBlock().getType() == Material.GLOWSTONE){
                                if(l.clone().add(1,0,-1).getBlock().getType() == Material.GLOWSTONE){
                                    if(l.clone().add(-1,0,1).getBlock().getType() == Material.GLOWSTONE){
                                        return true;
                                    } else{
                                        return false;
                                    }
                                } else{
                                    return false;
                                }
                            } else{
                                return false;
                            }
                        } else{
                            return false;
                        }
                    } else{
                        return false;
                    }
                } else{
                    return false;
                }
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
}
