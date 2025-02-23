package net.maceface.manybricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maceface.manybricks.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BRICK_TILES);
        addDrop(ModBlocks.ENGLISH_BOND_BRICKS);
        addDrop(ModBlocks.FLEMMISH_BOND_BRICKS);
        addDrop(ModBlocks.HERRINGBONE_BRICKS);
        addDrop(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS);
        addDrop(ModBlocks.STACKED_BOND_BRICKS);
        addDrop(ModBlocks.SOLDIER_COURSE_BRICKS);
        addDrop(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS);

        addDrop(ModBlocks.BRICK_TILE_SLAB);
        addDrop(ModBlocks.ENGLISH_BOND_BRICK_SLAB);
        addDrop(ModBlocks.FLEMMISH_BOND_BRICK_SLAB);
        addDrop(ModBlocks.HERRINGBONE_BRICK_SLAB);
        addDrop(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_SLAB);
        addDrop(ModBlocks.STACKED_BOND_BRICK_SLAB);
        addDrop(ModBlocks.SOLDIER_COURSE_BRICK_SLAB);
        addDrop(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_SLAB);

        addDrop(ModBlocks.BRICK_TILE_STAIRS);
        addDrop(ModBlocks.ENGLISH_BOND_BRICK_STAIRS);
        addDrop(ModBlocks.FLEMMISH_BOND_BRICK_STAIRS);
        addDrop(ModBlocks.HERRINGBONE_BRICK_STAIRS);
        addDrop(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_STAIRS);
        addDrop(ModBlocks.STACKED_BOND_BRICK_STAIRS);
        addDrop(ModBlocks.SOLDIER_COURSE_BRICK_STAIRS);
        addDrop(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS);

        addDrop(ModBlocks.BRICK_TILE_WALL);
        addDrop(ModBlocks.ENGLISH_BOND_BRICK_WALL);
        addDrop(ModBlocks.FLEMMISH_BOND_BRICK_WALL);
        addDrop(ModBlocks.HERRINGBONE_BRICK_WALL);
        addDrop(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_WALL);
        addDrop(ModBlocks.STACKED_BOND_BRICK_WALL);
        addDrop(ModBlocks.SOLDIER_COURSE_BRICK_WALL);
        addDrop(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_WALL);
    }
}
