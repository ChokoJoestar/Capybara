package fr.chokojoestar.capymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chokojoestar.capymod.item.CapyItems;
import fr.chokojoestar.capymod.item.CapyItemsGroup;

public class CapyMod implements ModInitializer {
	public static final String MOD_ID = "capymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("CapyMod");

	@Override
	public void onInitialize() {
		CapyItemsGroup.registerItemsGroup();
		CapyItems.registerItems();
	}
}