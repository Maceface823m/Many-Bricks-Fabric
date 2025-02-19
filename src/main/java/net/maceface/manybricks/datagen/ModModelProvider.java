package net.maceface.manybricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.maceface.manybricks.block.ModBlocks;
import net.minecraft.block.MossBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool brickTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICK_TILES);
        BlockStateModelGenerator.BlockTexturePool englishBondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENGLISH_BOND_BRICKS);
        BlockStateModelGenerator.BlockTexturePool flemmishBondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLEMMISH_BOND_BRICKS);
        BlockStateModelGenerator.BlockTexturePool soldierCourseBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOLDIER_COURSE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool soldierToppedStackedBondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS);
        BlockStateModelGenerator.BlockTexturePool herringboneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HERRINGBONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool doubleBasketweaveBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool stackedBondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STACKED_BOND_BRICKS);

        brickTilesPool.stairs(ModBlocks.BRICK_TILE_STAIRS);
        doubleBasketweaveBricksPool.stairs(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_STAIRS);
        englishBondBricksPool.stairs(ModBlocks.ENGLISH_BOND_BRICK_STAIRS);
        herringboneBricksPool.stairs(ModBlocks.HERRINGBONE_BRICK_STAIRS);
        flemmishBondBricksPool.stairs(ModBlocks.FLEMMISH_BOND_BRICK_STAIRS);
        soldierCourseBricksPool.stairs(ModBlocks.SOLDIER_COURSE_BRICK_STAIRS);
        stackedBondBricksPool.stairs(ModBlocks.STACKED_BOND_BRICK_STAIRS);
        soldierToppedStackedBondBricksPool.stairs(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS);

        brickTilesPool.slab(ModBlocks.BRICK_TILE_SLAB);
        doubleBasketweaveBricksPool.slab(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_SLAB);
        englishBondBricksPool.slab(ModBlocks.ENGLISH_BOND_BRICK_SLAB);
        herringboneBricksPool.slab(ModBlocks.HERRINGBONE_BRICK_SLAB);
        flemmishBondBricksPool.slab(ModBlocks.FLEMMISH_BOND_BRICK_SLAB);
        soldierCourseBricksPool.slab(ModBlocks.SOLDIER_COURSE_BRICK_SLAB);
        stackedBondBricksPool.slab(ModBlocks.STACKED_BOND_BRICK_SLAB);
        soldierToppedStackedBondBricksPool.slab(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
