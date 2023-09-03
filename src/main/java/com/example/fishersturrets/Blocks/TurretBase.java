package com.example.fishersturrets.Blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

/*
    The base block of the turret. A Turret Base must be placed to place down a turret gun (on top)
 */

public class TurretBase<T extends TurretBaseEntity<T>> extends Block {

    public TurretBase() {
        super(Properties.of(Material.HEAVY_METAL, MaterialColor.METAL)
                .strength(3.0f));
    }
}
