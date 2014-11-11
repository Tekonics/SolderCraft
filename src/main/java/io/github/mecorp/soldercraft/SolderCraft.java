package io.github.mecorp.soldercraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.mecorp.soldercraft.handler.ConfigHandler;
import io.github.mecorp.soldercraft.proxy.CommonProxy;
import io.github.mecorp.soldercraft.reference.Reference;

/**
 * Created by untamemadman on 8/25/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SolderCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static SolderCraft instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.initCapes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}