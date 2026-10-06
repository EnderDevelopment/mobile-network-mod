package com.nikolairusskih167.mobilenetworkmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MobileNetworkMod.MODID, name = MobileNetworkMod.NAME, version = MobileNetworkMod.VERSION)
public
class MobileNetworkMod {
    public static final String MODID = "mobilenetworkmod";
    public static final String NAME = "Mobile Network Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        ModItems.init();
        ModBlocks.init();
        ModEntities.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", net.minecraft.block.Block.getBlockFromName("minecraft:dirt").getRegistryName());
    }
}
