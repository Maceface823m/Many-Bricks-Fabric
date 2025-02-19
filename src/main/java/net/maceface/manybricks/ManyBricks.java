package net.maceface.manybricks;

import net.fabricmc.api.ModInitializer;

import net.maceface.manybricks.block.ModBlocks;
import net.maceface.manybricks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManyBricks implements ModInitializer {
	public static final String MOD_ID = "many-bricks";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}