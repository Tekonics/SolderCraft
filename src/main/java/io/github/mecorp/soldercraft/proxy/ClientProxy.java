package io.github.mecorp.soldercraft.proxy;


import com.jadarstudios.developercapes.DevCapes;
import io.github.mecorp.soldercraft.reference.Reference;
import io.github.mecorp.soldercraft.utility.LogHelper;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initCapes()
    {
        DevCapes.getInstance().registerConfig(Reference.DevCapes, Reference.MOD_ID);
        LogHelper.info("Capes Loaded");
    }
}