package nickytea.mcinspects;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McInspects implements ModInitializer {

	public static final String MOD_ID = "mcinspects";

	// Setup our logger
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MCInspects");
	}
}