package net.maceface.manybricks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.manybricks.ManyBricks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BRICK_TILES = registerBlock("brick_tiles",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DOUBLE_BASKETWEAVE_BRICKS = registerBlock("double_basketweave_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ENGLISH_BOND_BRICKS = registerBlock("english_bond_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block FLEMMISH_BOND_BRICKS = registerBlock("flemmish_bond_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block HERRINGBONE_BRICKS = registerBlock("herringbone_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_COURSE_BRICKS = registerBlock("soldier_course_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_TOPPED_STACKED_BOND_BRICKS = registerBlock("soldier_topped_stacked_bond_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block STACKED_BOND_BRICKS = registerBlock("stacked_bond_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));


    public static final Block BRICK_TILE_STAIRS = registerBlock("brick_tile_stairs",
            new StairsBlock(ModBlocks.BRICK_TILES.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block DOUBLE_BASKETWEAVE_BRICK_STAIRS = registerBlock("double_basketweave_brick_stairs",
            new StairsBlock(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ENGLISH_BOND_BRICK_STAIRS = registerBlock("english_bond_brick_stairs",
            new StairsBlock(ModBlocks.ENGLISH_BOND_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block FLEMMISH_BOND_BRICK_STAIRS = registerBlock("flemmish_bond_brick_stairs",
            new StairsBlock(ModBlocks.FLEMMISH_BOND_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block HERRINGBONE_BRICK_STAIRS = registerBlock("herringbone_brick_stairs",
            new StairsBlock(ModBlocks.HERRINGBONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_COURSE_BRICK_STAIRS = registerBlock("soldier_course_brick_stairs",
            new StairsBlock(ModBlocks.SOLDIER_COURSE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS = registerBlock("soldier_topped_stacked_bond_brick_stairs",
            new StairsBlock(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block STACKED_BOND_BRICK_STAIRS = registerBlock("stacked_bond_brick_stairs",
            new StairsBlock(ModBlocks.STACKED_BOND_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));



    public static final Block BRICK_TILE_SLAB = registerBlock("brick_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block DOUBLE_BASKETWEAVE_BRICK_SLAB = registerBlock("double_basketweave_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ENGLISH_BOND_BRICK_SLAB = registerBlock("english_bond_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block FLEMMISH_BOND_BRICK_SLAB = registerBlock("flemmish_bond_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block HERRINGBONE_BRICK_SLAB = registerBlock("herringbone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_COURSE_BRICK_SLAB = registerBlock("soldier_course_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOLDIER_TOPPED_STACKED_BOND_BRICK_SLAB = registerBlock("soldier_topped_stacked_bond_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block STACKED_BOND_BRICK_SLAB = registerBlock("stacked_bond_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));



    public static final Block BRICK_TILE_WALL = registerBlock("brick_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block ENGLISH_BOND_BRICK_WALL = registerBlock("english_bond_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block FLEMMISH_BOND_BRICK_WALL = registerBlock("flemmish_bond_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block DOUBLE_BASKETWEAVE_BRICK_WALL = registerBlock("double_basketweave_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block HERRINGBONE_BRICK_WALL = registerBlock("herringbone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block SOLDIER_COURSE_BRICK_WALL = registerBlock("soldier_course_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block STACKED_BOND_BRICK_WALL = registerBlock("stacked_bond_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block SOLDIER_TOPPED_STACKED_BOND_BRICK_WALL = registerBlock("soldier_topped_stacked_bond_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ManyBricks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ManyBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

        ManyBricks.LOGGER.info("Registering Mod Blocks for " + ManyBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BRICK_TILES);
            entries.add(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS);
            entries.add(ModBlocks.ENGLISH_BOND_BRICKS);
            entries.add(ModBlocks.HERRINGBONE_BRICKS);
            entries.add(ModBlocks.FLEMMISH_BOND_BRICKS);
            entries.add(ModBlocks.SOLDIER_COURSE_BRICKS);
            entries.add(ModBlocks.STACKED_BOND_BRICKS);
            entries.add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS);

            entries.add(ModBlocks.BRICK_TILE_STAIRS);
            entries.add(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_STAIRS);
            entries.add(ModBlocks.ENGLISH_BOND_BRICK_STAIRS);
            entries.add(ModBlocks.HERRINGBONE_BRICK_STAIRS);
            entries.add(ModBlocks.FLEMMISH_BOND_BRICK_STAIRS);
            entries.add(ModBlocks.SOLDIER_COURSE_BRICK_STAIRS);
            entries.add(ModBlocks.STACKED_BOND_BRICK_STAIRS);
            entries.add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS);

            entries.add(ModBlocks.BRICK_TILE_SLAB);
            entries.add(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_SLAB);
            entries.add(ModBlocks.ENGLISH_BOND_BRICK_SLAB);
            entries.add(ModBlocks.HERRINGBONE_BRICK_SLAB);
            entries.add(ModBlocks.FLEMMISH_BOND_BRICK_SLAB);
            entries.add(ModBlocks.SOLDIER_COURSE_BRICK_SLAB);
            entries.add(ModBlocks.STACKED_BOND_BRICK_SLAB);
            entries.add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_SLAB);

            entries.add(ModBlocks.BRICK_TILE_WALL);
            entries.add(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_WALL);
            entries.add(ModBlocks.ENGLISH_BOND_BRICK_WALL);
            entries.add(ModBlocks.HERRINGBONE_BRICK_WALL);
            entries.add(ModBlocks.FLEMMISH_BOND_BRICK_WALL);
            entries.add(ModBlocks.SOLDIER_COURSE_BRICK_WALL);
            entries.add(ModBlocks.STACKED_BOND_BRICK_WALL);
            entries.add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_WALL);



        });

    }
}
