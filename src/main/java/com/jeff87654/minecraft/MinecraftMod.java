package com.jeff87654.minecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftmod");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
