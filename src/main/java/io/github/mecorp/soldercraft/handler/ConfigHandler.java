package io.github.mecorp.soldercraft.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.mecorp.soldercraft.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by Sam on 8/25/2014.
 */
public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean useless = false;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        useless = configuration.getBoolean("useless", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}