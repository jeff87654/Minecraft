package com.jeff87654.minecraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

/**
 * Simple block implementation used by the example mod.  Using a dedicated class
 * avoids class loading failures when Fabric attempts to instantiate the block
 * referenced from {@link com.jeff87654.minecraft.MinecraftMod}.
 */
public class CribBlock extends Block {
    public CribBlock() {
        super(AbstractBlock.Settings.create()
                .strength(2.0f, 3.0f)
                .sounds(BlockSoundGroup.WOOD));
    }
}
