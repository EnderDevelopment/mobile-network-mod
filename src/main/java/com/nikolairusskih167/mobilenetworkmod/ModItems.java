package com.nikolairusskih167.mobilenetworkmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public
class ModItems {
    public static Item smartphone;

    public static void init() {
        smartphone = new ItemSmartphone().setUnlocalizedName("smartphone").setRegistryName("smartphone");
        GameRegistry.register(smartphone);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(smartphone, 0, new ModelResourceLocation(smartphone.getRegistryName(), "inventory"));
    }
}
