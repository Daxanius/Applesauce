package net.daxanius.applesauce;

import net.daxanius.applesauce.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Applesauce implements ModInitializer {
	public static final String MODID = "applesauce";
	public static String VERSION = "1.0";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing data");
		ModItems.register();
	}
}