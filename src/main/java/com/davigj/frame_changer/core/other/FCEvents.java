package com.davigj.frame_changer.core.other;

import com.davigj.frame_changer.core.FrameChanger;
import com.ordana.spelunkery.reg.ModItems;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import static com.davigj.frame_changer.core.other.FCConstants.PORTAL_FLUID_MAP;

public class FCEvents {

    public static InteractionResult onPlayerRightClickBlock(Player player, Level level, InteractionHand hand, BlockHitResult blockHitResult) {
        if (!FabricLoader.getInstance().isModLoaded("spelunkery")) {
            return InteractionResult.PASS;
        }
        ItemStack heldItem = player.getItemInHand(hand);
        BlockState clickedBlockState = level.getBlockState(blockHitResult.getBlockPos());
        if (PORTAL_FLUID_MAP.containsKey(clickedBlockState.getBlock()) && heldItem.is(Items.GLASS_BOTTLE)) {
            BlockState convertedState = FrameChanger.transferAllBlockStates(clickedBlockState, PORTAL_FLUID_MAP.get(clickedBlockState.getBlock()).defaultBlockState());
            level.setBlock(blockHitResult.getBlockPos(), convertedState, 3);
            player.swing(hand);
            ItemStack portalFluid = new ItemStack(ModItems.PORTAL_FLUID_BOTTLE.get());
            level.playSound(player, blockHitResult.getBlockPos(), SoundEvents.RESPAWN_ANCHOR_DEPLETE.value(), SoundSource.BLOCKS, 1.0f, 1.0f);
            ParticleUtils.spawnParticlesOnBlockFaces(player.level(), blockHitResult.getBlockPos(), ParticleTypes.FALLING_OBSIDIAN_TEAR, UniformInt.of(3, 5));
            if (!player.getAbilities().instabuild) {
                heldItem.shrink(1);
                if (!player.getInventory().add(portalFluid)) {
                    player.drop(portalFluid, false);
                }
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}