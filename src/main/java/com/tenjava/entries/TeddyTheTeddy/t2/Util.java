package com.tenjava.entries.TeddyTheTeddy.t2;

import org.bukkit.Location;
import org.bukkit.Material;

/**
 * Created by Thomas on 12/07/2014.
 */
public class Util {

    /**
     * Checks if the Structure is correct
     *
     * @param mainBlock The transmuted block
     * @return Is structure correct?
     */
    public static boolean checkStructure(Location mainBlock) {
        Location l = mainBlock.add(0, -1, 0);

        if (l.clone().add(1, 0, 0).getBlock().getType() == Material.PACKED_ICE) {
            if (l.clone().add(0, 0, 1).getBlock().getType() == Material.PACKED_ICE) {
                if (l.clone().add(1, 0, 1).getBlock().getType() == Material.PACKED_ICE) {
                    if (l.clone().add(-1, 0, 0).getBlock().getType() == Material.PACKED_ICE) {
                        if (l.clone().add(0, 0, -1).getBlock().getType() == Material.PACKED_ICE) {
                            if (l.clone().add(-1, 0, -1).getBlock().getType() == Material.PACKED_ICE) {
                                if (l.clone().add(1, 0, -1).getBlock().getType() == Material.PACKED_ICE) {
                                    if (l.clone().add(-1, 0, 1).getBlock().getType() == Material.PACKED_ICE) {
                                        if (l.clone().add(2, 0, 0).getBlock().getType() == Material.QUARTZ_BLOCK) {
                                            if (l.clone().add(0, 0, 2).getBlock().getType() == Material.QUARTZ_BLOCK) {
                                                if (l.clone().add(-2, 0, 0).getBlock().getType() == Material.QUARTZ_BLOCK) {
                                                    if (l.clone().add(0, 0, -2).getBlock().getType() == Material.QUARTZ_BLOCK) {
                                                        if (l.clone().add(2, 0, 2).getBlock().getType() == Material.GLOWSTONE) {
                                                            if (l.clone().add(-2, 0, 2).getBlock().getType() == Material.GLOWSTONE) {
                                                                if (l.clone().add(2, 0, -2).getBlock().getType() == Material.GLOWSTONE) {
                                                                    if (l.clone().add(-2, 0, -2).getBlock().getType() == Material.GLOWSTONE) {
                                                                        if (l.clone().add(-2, 3, -2).getBlock().getType() == Material.DAYLIGHT_DETECTOR) {
                                                                            if (l.clone().add(2, 3, -2).getBlock().getType() == Material.DAYLIGHT_DETECTOR) {
                                                                                if (l.clone().add(-2, 3, 2).getBlock().getType() == Material.DAYLIGHT_DETECTOR) {
                                                                                    if (l.clone().add(2, 3, 2).getBlock().getType() == Material.DAYLIGHT_DETECTOR) {
                                                                                        return true;
                                                                                    } else {
                                                                                        return false;
                                                                                    }
                                                                                } else {
                                                                                    return false;
                                                                                }
                                                                            } else {
                                                                                return false;
                                                                            }
                                                                        } else {
                                                                            return false;
                                                                        }
                                                                    } else {
                                                                        return false;
                                                                    }
                                                                } else {
                                                                    return false;
                                                                }
                                                            } else {
                                                                return false;
                                                            }
                                                        } else {
                                                            return false;
                                                        }
                                                    } else {
                                                        return false;
                                                    }
                                                } else {
                                                    return false;
                                                }
                                            } else {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean checkLight(Location mainBlock){
        Location l = mainBlock.add(0, 2, 0);
        if(l.clone().add(2, 0, 2).getBlock().getBlockPower() <= 4){
            System.out.println("Block +2 +2");
            return false;
        } else{
            if(l.clone().add(-2, 0, 2).getBlock().getBlockPower() <= 4){
                System.out.println("Block -2 +2");
                return false;
            } else{
                if(l.clone().add(2, 0, -2).getBlock().getBlockPower() <= 4){
                    System.out.println("Block +2 -2");
                    return false;
                } else{
                    if(l.clone().add(-2, 0, -2).getBlock().getBlockPower() <= 4){
                        System.out.println("Block -2 -2");
                        return false;
                    } else{
                        return true;
                    }
                }
            }
        }
    }
}
