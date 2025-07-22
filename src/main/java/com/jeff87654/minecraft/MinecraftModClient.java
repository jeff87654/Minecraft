package com.jeff87654.minecraft;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftModClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftmod");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric client world!");
    }
}
