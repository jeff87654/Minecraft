package com.jeff87654.minecraft.mixin;

import net.minecraft.server.MinecraftServer;
import com.jeff87654.minecraft.MinecraftMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftMixin {
    @Inject(method = "loadWorld", at = @At("HEAD"))
    private void onLoadWorld(CallbackInfo ci) {
        MinecraftMod.LOGGER.info("This line is printed by the Minecraft mod mixin!");
    }
}
