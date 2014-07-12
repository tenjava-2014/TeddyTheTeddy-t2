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

    /**
     * Checks to see if the structure has the correct amount of light
     *
     * @param mainBlock Main structure block
     * @return Is light acceptable
     */
    public static boolean checkLight(Location mainBlock) {
        Location l = mainBlock.add(0, 2, 0);

        if (l.getWorld().getTime() >= 0 && l.getWorld().getTime() <= 12500 && !l.getWorld().isThundering()) {
            for (int i = l.getBlockY() + 1; i < 256; i++) {
                Location l1 = mainBlock.clone();
                l1.setY(i);

                if (l1.clone().add(2, 0, 2).getBlock().getType() != Material.AIR) {
                    return false;
                } else {
                    if (l1.clone().add(-2, 0, 2).getBlock().getType() != Material.AIR) {
                        return false;
                    } else {
                        if (l1.clone().add(2, 0, -2).getBlock().getType() != Material.AIR) {
                            return false;
                        } else {
                            if (l1.clone().add(-2, 0, -2).getBlock().getType() != Material.AIR) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
