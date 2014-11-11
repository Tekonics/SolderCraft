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
    public static boolean testValue = false;
    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    public static void loadConfiguration()
    {
        testValue = configuration.getBoolean("Useless", Configuration.CATEGORY_GENERAL, true, "This is useless!");
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