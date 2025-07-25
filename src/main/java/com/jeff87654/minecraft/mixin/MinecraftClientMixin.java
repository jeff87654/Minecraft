package com.jeff87654.minecraft.mixin;

import net.minecraft.client.MinecraftClient;
import com.jeff87654.minecraft.MinecraftMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(method = "run", at = @At("HEAD"))
    private void onRun(CallbackInfo ci) {
        MinecraftMod.LOGGER.info("This line is printed by the Minecraft mod client mixin!");
    }
}
