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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENGLISH_BOND_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLEMMISH_BOND_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOLDIER_COURSE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HERRINGBONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STACKED_BOND_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
