package net.maceface.manybricks.item;

import net.fabricmc.fabric.mixin.transfer.ItemMixin;
import net.maceface.manybricks.ManyBricks;
import net.maceface.manybricks.ManyBricksClient;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ManyBricks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ManyBricks.LOGGER.info("Registering Mod Items for " + ManyBricks.MOD_ID);
    }

}
