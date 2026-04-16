package com.davigj.frame_changer.core.registry;

import com.davigj.frame_changer.common.block.CryingRotatedPillarBlock;
import com.davigj.frame_changer.common.block.CryingSlabBlock;
import com.davigj.frame_changer.common.block.CryingWallBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

import java.util.List;
import java.util.function.Supplier;

import static com.davigj.frame_changer.core.FrameChanger.MOD_ID;

public class FCBlocks {

    public static final Supplier<Block> OBSIDIAN_BRICKS = createBlock("obsidian_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));

    public static final Supplier<Block> OBSIDIAN_BRICK_SLAB = createSlab("obsidian_brick_slab", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> OBSIDIAN_BRICK_STAIRS = createStairs("obsidian_brick_stairs", OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> OBSIDIAN_BRICK_WALL = createWall("obsidian_brick_wall", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));

    public static final Supplier<Block> CRYING_OBSIDIAN_BRICKS = createBlock("crying_obsidian_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_SLAB = createBlock("crying_obsidian_brick_slab", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_STAIRS = createStairs("crying_obsidian_brick_stairs", CRYING_OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CRYING_OBSIDIAN_BRICK_WALL = createCryingWall("crying_obsidian_brick_wall", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));

    public static final Supplier<Block> POLISHED_OBSIDIAN = createBlock("polished_obsidian", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> POLISHED_OBSIDIAN_SLAB = createBlock("polished_obsidian_slab", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> POLISHED_OBSIDIAN_STAIRS = createStairs("polished_obsidian_stairs", POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> POLISHED_OBSIDIAN_WALL = createBlock("polished_obsidian_wall", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));

    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN = createCryingBlock("crying_polished_obsidian", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_SLAB = createCryingSlab("crying_polished_obsidian_slab", (BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;})));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_STAIRS = createCryingStairs("crying_polished_obsidian_stairs", CRYING_POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CRYING_POLISHED_OBSIDIAN_WALL = createCryingWall("crying_polished_obsidian_wall", (BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> 10)));

    public static final Supplier<Block> OBSIDIAN_PILLAR = createRotatedPillarBlock("obsidian_pillar", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F));
    public static final Supplier<Block> CRYING_OBSIDIAN_PILLAR = createCryingRotatedPillarBlock("crying_obsidian_pillar", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));
    public static final Supplier<Block> CHISELED_OBSIDIAN = createBlock("chiseled_obsidian", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(35.0F, 1200.0F));
    public static final Supplier<Block> CRYING_CHISELED_OBSIDIAN = createCryingBlock("crying_chiseled_obsidian", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(22.5F, 600.0F).lightLevel((p_152651_) -> {return 10;}));

    public static Supplier<Block> createBlock(String id, Supplier<Block> blockSupplier) {
        Block block = Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, id), blockSupplier.get());
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, id), new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, id)))));
        return ()->block;
    }

    private static ResourceKey<Block> key(String id) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, id));
    }

    private static Supplier<Block> createBlock(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new Block(properties.setId(key(id))));
    }

    private static Supplier<Block> createSlab(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new SlabBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createStairs(String id, BlockState block, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new StairBlock(block, properties.setId(key(id))));
    }

    private static Supplier<Block> createWall(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new WallBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createCryingBlock(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new CryingObsidianBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createRotatedPillarBlock(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new RotatedPillarBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createCryingRotatedPillarBlock(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new CryingRotatedPillarBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createCryingSlab(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new CryingSlabBlock(properties.setId(key(id))));
    }

    private static Supplier<Block> createCryingStairs(String id, BlockState block, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new StairBlock(block, properties.setId(key(id))));
    }

    private static Supplier<Block> createCryingWall(String id, BlockBehaviour.Properties properties) {
        return createBlock(id, ()->new CryingWallBlock(properties.setId(key(id))));
    }

    public static void buildCreativeTabContents() {
        var items = List.of(OBSIDIAN_BRICKS, OBSIDIAN_BRICK_STAIRS, OBSIDIAN_BRICK_SLAB, OBSIDIAN_BRICK_WALL,
                POLISHED_OBSIDIAN, POLISHED_OBSIDIAN_STAIRS, POLISHED_OBSIDIAN_SLAB, POLISHED_OBSIDIAN_WALL,
                CHISELED_OBSIDIAN, OBSIDIAN_PILLAR,
                CRYING_OBSIDIAN_BRICKS, CRYING_OBSIDIAN_BRICK_STAIRS, CRYING_OBSIDIAN_BRICK_SLAB, CRYING_OBSIDIAN_BRICK_WALL,
                CRYING_POLISHED_OBSIDIAN, CRYING_POLISHED_OBSIDIAN_STAIRS, CRYING_POLISHED_OBSIDIAN_SLAB, CRYING_POLISHED_OBSIDIAN_WALL,
                CRYING_CHISELED_OBSIDIAN, CRYING_OBSIDIAN_PILLAR);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register((groupEntries -> {
            for (Supplier<Block> item : items) {
                groupEntries.accept(item.get());
            }
        }));
    }

    public static void touch() {}
}