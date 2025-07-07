package com.davigj.frame_changer.core.mixin;

import com.davigj.frame_changer.core.FCConfig;
import com.davigj.frame_changer.core.FrameChanger;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.portal.PortalShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.davigj.frame_changer.core.other.FCConstants.OBBY_MAP;
import static com.davigj.frame_changer.core.other.FCConstants.spelunkeryCryingPortals;

@Mixin(NetherPortalBlock.class)
public class NetherPortalBlockMixin {
    @Inject(method = "updateShape", at = @At("HEAD"))
    private void updateObby(BlockState state, LevelReader level, ScheduledTickAccess scheduledTickAccess, BlockPos pos, Direction direction, BlockPos blockPos2, BlockState blockState2, RandomSource randomSource, CallbackInfoReturnable<BlockState> cir) {
        if (!level.isClientSide()) {
            if (FabricLoader.getInstance().isModLoaded("spelunkery")) {
                if (spelunkeryCryingPortals) {
                    framechanger$fluidSpread(state, (Level) level, pos, 0.33D);
                }
            } else if (FCConfig.COMMON.contagiousMisery.get()) {
                framechanger$fluidSpread(state, (Level) level, pos, FCConfig.COMMON.convertChance.get());
            }
        }

    }

    @Unique
    private void framechanger$fluidSpread (BlockState state, Level level, BlockPos pos, double cryChance) {
        Direction.Axis axis2 = state.getValue(NetherPortalBlock.AXIS);
        RandomSource random = level.getRandom();
        for (Direction cryDir : Direction.values()) {
            BlockState cryState = level.getBlockState(pos.relative(cryDir));
            if (random.nextDouble() < cryChance && OBBY_MAP.containsKey(cryState.getBlock()) && !(PortalShape.findAnyShape(level, pos, axis2)).isComplete()) {
                BlockState convertedState = FrameChanger.transferAllBlockStates(cryState, OBBY_MAP.get(cryState.getBlock()).defaultBlockState());
                if (FabricLoader.getInstance().isModLoaded("spelunkery")) {
                    if (!(spelunkeryCryingPortals && cryState.is(Blocks.OBSIDIAN))) {
                        level.setBlock(pos.relative(cryDir), convertedState, 3);
                    }
                } else {
                    level.setBlock(pos.relative(cryDir), convertedState, 3);
                }
            }
        }
    }
}
