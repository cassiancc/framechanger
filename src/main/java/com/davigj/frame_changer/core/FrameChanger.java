package com.davigj.frame_changer.core;

import com.davigj.frame_changer.core.other.FCEvents;
import com.davigj.frame_changer.core.registry.FCBlocks;
import fuzs.forgeconfigapiport.fabric.api.v5.ConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.fml.config.ModConfig;

import static com.davigj.frame_changer.core.other.FCConstants.*;

public class FrameChanger implements ModInitializer {
    public static final String MOD_ID = "frame_changer";

    public void onInitialize() {
        FCBlocks.touch();
        initializeObbyMap();
        determineChiselMap();
        portalFluidMap();
        ConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, FCConfig.COMMON_SPEC);
        UseBlockCallback.EVENT.register(FCEvents::onPlayerRightClickBlock);
    }

    public static BlockState transferAllBlockStates(BlockState initial, BlockState after) {
        BlockState block = after;
        for (Property property : initial.getBlock().getStateDefinition().getProperties()) {
            if (after.hasProperty(property) && initial.getValue(property) != null) {
                block = block.setValue(property, initial.getValue(property));
            }
        }
        return block;
    }
}