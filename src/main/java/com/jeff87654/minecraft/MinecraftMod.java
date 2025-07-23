package com.jeff87654.minecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Imports for registering the crib block and its corresponding item.
import com.jeff87654.minecraft.block.CribBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Main class for the Minecraft mod.  This class is instantiated by the
 * Fabric loader and used to initialize the mod.  It registers the new
 * {@code CribBlock} and its item so that they are available in game and
 * can be crafted via the JSON recipe.
 */
public class MinecraftMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftmod");

    /**
     * The crib block instance.  It is created once here and then registered
     * during initialization.  Keeping it as a static field ensures it is
     * accessible from other parts of the mod if needed.
     */
    public static final Block CRIB = new CribBlock();

    @Override
    public void onInitialize() {
        // Log a friendly greeting when the mod is loaded.
        LOGGER.info("Hello Fabric world!");

        // Register the crib block under the mod's namespace.  The identifier
        // consists of the mod ID (minecraftmod) and the path (crib).  This
        // makes the full identifier "minecraftmod:crib".
        Registry.register(Registries.BLOCK, new Identifier("minecraftmod", "crib"), CRIB);

        // Register the corresponding block item so that players can obtain
        // and place the crib in the world.  Without registering an item the
        // block would exist in the registry but could not be held in an
        // inventory.
        Registry.register(Registries.ITEM, new Identifier("minecraftmod", "crib"), new BlockItem(CRIB, new Item.Settings()));
    }
}
