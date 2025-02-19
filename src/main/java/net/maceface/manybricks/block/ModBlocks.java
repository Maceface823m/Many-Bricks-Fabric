package net.maceface.manybricks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.manybricks.ManyBricks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
        });

    }
}
