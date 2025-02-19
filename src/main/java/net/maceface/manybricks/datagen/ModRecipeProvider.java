package net.maceface.manybricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maceface.manybricks.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> STONE_CUTTABLE = List.of(ModBlocks.BRICK_TILES,
                ModBlocks.DOUBLE_BASKETWEAVE_BRICKS, ModBlocks.ENGLISH_BOND_BRICKS, ModBlocks.FLEMMISH_BOND_BRICKS,
                ModBlocks.HERRINGBONE_BRICKS, ModBlocks.SOLDIER_COURSE_BRICKS, ModBlocks.SOLDIER_TOPPED_STACKED_BOND_BRICKS,
                ModBlocks.STACKED_BOND_BRICKS);

    }
}
