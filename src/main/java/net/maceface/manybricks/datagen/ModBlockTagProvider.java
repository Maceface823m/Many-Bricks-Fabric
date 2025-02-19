package net.maceface.manybricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maceface.manybricks.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BRICK_TILES)
                .add(ModBlocks.ENGLISH_BOND_BRICKS)
                .add(ModBlocks.FLEMMISH_BOND_BRICKS)
                .add(ModBlocks.STACKED_BOND_BRICKS)
                .add(ModBlocks.SOLDIER_COURSE_BRICKS)
                .add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS)
                .add(ModBlocks.HERRINGBONE_BRICKS)
                .add(ModBlocks.DOUBLE_BASKETWEAVE_BRICKS)
                .add(ModBlocks.BRICK_TILE_STAIRS)
                .add(ModBlocks.DOUBLE_BASKETWEAVE_BRICK_STAIRS)
                .add(ModBlocks.ENGLISH_BOND_BRICK_STAIRS)
                .add(ModBlocks.HERRINGBONE_BRICK_STAIRS)
                .add(ModBlocks.FLEMMISH_BOND_BRICK_STAIRS)
                .add(ModBlocks.SOLDIER_COURSE_BRICK_STAIRS)
                .add(ModBlocks.STACKED_BOND_BRICK_STAIRS)
                .add(ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS);

    }
}
