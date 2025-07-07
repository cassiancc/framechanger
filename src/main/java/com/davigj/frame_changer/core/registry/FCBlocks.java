package com.davigj.frame_changer.core.registry;

import com.davigj.frame_changer.common.block.CryingRotatedPillarBlock;
import com.davigj.frame_changer.common.block.CryingSlabBlock;
import com.davigj.frame_changer.common.block.CryingWallBlock;
import dev.architectury.registry.registries.DeferredRegister;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.List;
import java.util.function.Supplier;

import static com.davigj.frame_changer.core.FrameChanger.MOD_ID;

public class FCBlocks {

    public static final Supplier<Block> OBSIDIAN_BRICKS = createBlock("obsidian_bricks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> OBSIDIAN_BRICK_SLAB = createBlock("obsidian_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> OBSIDIAN_BRICK_STAIRS = createBlock("obsidian_brick_stairs", () -> new StairBlock(OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> OBSIDIAN_BRICK_WALL = createBlock("obsidian_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));

    public static final Supplier<Block> CRYING_OBSIDIAN_BRICKS = createBlock("crying_obsidian_bricks", () -> new CryingObsidianBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_SLAB = createBlock("crying_obsidian_brick_slab", () -> new CryingSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_STAIRS = createBlock("crying_obsidian_brick_stairs", () -> new StairBlock(CRYING_OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_WALL = createBlock("crying_obsidian_brick_wall", () -> new CryingWallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));

    public static final Supplier<Block> POLISHED_OBSIDIAN = createBlock("polished_obsidian", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> POLISHED_OBSIDIAN_SLAB = createBlock("polished_obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> POLISHED_OBSIDIAN_STAIRS = createBlock("polished_obsidian_stairs", () -> new StairBlock(POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> POLISHED_OBSIDIAN_WALL = createBlock("polished_obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));

    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN = createBlock("crying_polished_obsidian", () -> new CryingObsidianBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_SLAB = createBlock("crying_polished_obsidian_slab", () -> new CryingSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_STAIRS = createBlock("crying_polished_obsidian_stairs", () -> new StairBlock(CRYING_POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_WALL = createBlock("crying_polished_obsidian_wall", () -> new CryingWallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> 10)));

    public static final Supplier<Block> OBSIDIAN_PILLAR = createBlock("obsidian_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F)));
    public static final Supplier<Block> CRYING_OBSIDIAN_PILLAR = createBlock("crying_obsidian_pillar", () -> new CryingRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CHISELED_OBSIDIAN = createBlock("chiseled_obsidian", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(35.0F, 1200.0F)));
    public static final Supplier<Block> CRYING_CHISELED_OBSIDIAN = createBlock("crying_chiseled_obsidian", () -> new CryingObsidianBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));

    public static Supplier<Block> createBlock(String id, Supplier<Block> blockSupplier) {
        Block block = Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, id), blockSupplier.get());
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, id), new BlockItem(block, new Item.Properties()));
        return ()->block;
    }

    public static void buildCreativeTabContents() {
        var items = List.of(OBSIDIAN_BRICKS, OBSIDIAN_BRICK_STAIRS, OBSIDIAN_BRICK_SLAB, OBSIDIAN_BRICK_WALL,
                POLISHED_OBSIDIAN, POLISHED_OBSIDIAN_STAIRS, POLISHED_OBSIDIAN_SLAB, POLISHED_OBSIDIAN_WALL,
                CHISELED_OBSIDIAN, OBSIDIAN_PILLAR,
                CRYING_OBSIDIAN_BRICKS, CRYING_OBSIDIAN_BRICK_STAIRS, CRYING_OBSIDIAN_BRICK_SLAB, CRYING_OBSIDIAN_BRICK_WALL,
                CRYING_POLISHED_OBSIDIAN, CRYING_POLISHED_OBSIDIAN_STAIRS, CRYING_POLISHED_OBSIDIAN_SLAB, CRYING_POLISHED_OBSIDIAN_WALL,
                CRYING_CHISELED_OBSIDIAN, CRYING_OBSIDIAN_PILLAR);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((groupEntries -> {
            for (Supplier<Block> item : items) {
                groupEntries.accept(item.get());
            }
        }));
    }

    public static void touch() {}
}