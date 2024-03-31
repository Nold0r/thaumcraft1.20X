package net.noldor.thaumcraft;

import net.fabricmc.api.ModInitializer;

import net.noldor.thaumcraft.items.ModeItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thaumcraft implements ModInitializer {
	public static final String MODID = "thaumcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger("MODID");

	@Override
	public void onInitialize() {

		ModeItems.registerModItems();
	}
}