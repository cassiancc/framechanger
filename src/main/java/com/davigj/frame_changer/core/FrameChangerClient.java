package com.davigj.frame_changer.core;

import com.davigj.frame_changer.core.registry.FCBlocks;
import net.fabricmc.api.ClientModInitializer;

public class FrameChangerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FCBlocks.buildCreativeTabContents();
    }
}
