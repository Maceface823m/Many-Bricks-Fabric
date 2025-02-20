package net.maceface.manybricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maceface.manybricks.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {



        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_TILE_SLAB, ModBlocks.BRICK_TILES, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_TILE_STAIRS, ModBlocks.BRICK_TILES, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_TILE_WALL, ModBlocks.BRICK_TILES, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENGLISH_BOND_BRICK_SLAB, ModBlocks.ENGLISH_BOND_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENGLISH_BOND_BRICK_STAIRS, ModBlocks.ENGLISH_BOND_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENGLISH_BOND_BRICK_WALL, ModBlocks.ENGLISH_BOND_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLEMMISH_BOND_BRICK_SLAB, ModBlocks.FLEMMISH_BOND_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLEMMISH_BOND_BRICK_STAIRS, ModBlocks.FLEMMISH_BOND_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLEMMISH_BOND_BRICK_WALL, ModBlocks.FLEMMISH_BOND_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HERRINGBONE_BRICK_SLAB, ModBlocks.HERRINGBONE_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HERRINGBONE_BRICK_STAIRS, ModBlocks.HERRINGBONE_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HERRINGBONE_BRICK_WALL, ModBlocks.HERRINGBONE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_BASKETWEAVE_BRICK_SLAB, ModBlocks.DOUBLE_BASKETWEAVE_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_BASKETWEAVE_BRICK_STAIRS, ModBlocks.DOUBLE_BASKETWEAVE_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_BASKETWEAVE_BRICK_WALL, ModBlocks.DOUBLE_BASKETWEAVE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_COURSE_BRICK_SLAB, ModBlocks.SOLDIER_COURSE_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_COURSE_BRICK_STAIRS, ModBlocks.SOLDIER_COURSE_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_COURSE_BRICK_WALL, ModBlocks.SOLDIER_COURSE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STACKED_BOND_BRICK_SLAB, ModBlocks.STACKED_BOND_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STACKED_BOND_BRICK_STAIRS, ModBlocks.STACKED_BOND_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STACKED_BOND_BRICK_WALL, ModBlocks.STACKED_BOND_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_SLAB, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_STAIRS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICK_WALL, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_TILES, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENGLISH_BOND_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLEMMISH_BOND_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HERRINGBONE_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_BASKETWEAVE_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STACKED_BOND_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_COURSE_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS, Blocks.BRICKS);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.BRICK_TILES);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.ENGLISH_BOND_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.FLEMMISH_BOND_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.HERRINGBONE_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.DOUBLE_BASKETWEAVE_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.STACKED_BOND_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.SOLDIER_COURSE_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS);


    }
}
