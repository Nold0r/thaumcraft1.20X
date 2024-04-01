package net.noldor.thaumcraft.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.noldor.thaumcraft.Thaumcraft;
import net.noldor.thaumcraft.custom.AnimatedItem;

public class ModeItems {
    public static final Item THAUMONOMICON = registerItem("thaumonomicon", new AnimatedItem(new FabricItemSettings()));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Thaumcraft.MODID, name ), item);
    }
    public static void registerModItems(){
        Thaumcraft.LOGGER.info("Registering Mod Item for"+ Thaumcraft.MODID);

    }
}
