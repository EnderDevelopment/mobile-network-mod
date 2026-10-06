package com.nikolairusskih167.mobilenetworkmod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public
class ModBlocks {
    public static Block cellularTower;
    public static Block operatorServer;
    public static Block paymentTerminal;

    public static void init() {
        cellularTower = new BlockCellularTower().setUnlocalizedName("cellular_tower").setRegistryName("cellular_tower");
        GameRegistry.register(cellularTower);
        GameRegistry.register(new ItemBlock(cellularTower).setRegistryName(cellularTower.getRegistryName()));

        operatorServer = new BlockOperatorServer().setUnlocalizedName("operator_server").setRegistryName("operator_server");
        GameRegistry.register(operatorServer);
        GameRegistry.register(new ItemBlock(operatorServer).setRegistryName(operatorServer.getRegistryName()));

        paymentTerminal = new BlockPaymentTerminal().setUnlocalizedName("payment_terminal").setRegistryName("payment_terminal");
        GameRegistry.register(paymentTerminal);
        GameRegistry.register(new ItemBlock(paymentTerminal).setRegistryName(paymentTerminal.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(cellularTower), 0, new ModelResourceLocation(cellularTower.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(operatorServer), 0, new ModelResourceLocation(operatorServer.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(paymentTerminal), 0, new ModelResourceLocation(paymentTerminal.getRegistryName(), "inventory"));
    }
}
