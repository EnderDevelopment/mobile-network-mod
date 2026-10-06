package com.nikolairusskih167.mobilenetworkmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public
class BlockCellularTower extends Block {
    public BlockCellularTower() {
        super(Material.IRON);
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("pickaxe", 2);
    }
}
