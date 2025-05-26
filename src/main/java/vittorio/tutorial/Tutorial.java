package vittorio.tutorial;

import net.fabricmc.api.ModInitializer;
import vittorio.tutorial.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {

	// The mod ID, used for identifying your mod in logs and other places
	public static final String MOD_ID = "tutorial";

	// Define a logger for this mod
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-loading state.
		ModItems.registerModItem();
	}
}