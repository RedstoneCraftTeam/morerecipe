package cf.rscraft.morerecipe;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModLaunch implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("rsc_morerecipe");

    @Override
    public void onInitialize() {
        LOGGER.info("More recipes, by littlekan233(RedstoneCraftTeam).");
        LOGGER.info("Launched! version: 1.0.0");
    }
}