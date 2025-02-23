package net.maceface.manybricks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.maceface.manybricks.datagen.ModBlockTagProvider;
import net.maceface.manybricks.datagen.ModLootTableProvider;
import net.maceface.manybricks.datagen.ModModelProvider;
import net.maceface.manybricks.datagen.ModRecipeProvider;

public class ManyBricksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);


	}
}
