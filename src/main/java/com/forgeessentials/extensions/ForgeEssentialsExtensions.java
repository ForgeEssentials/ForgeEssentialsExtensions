package com.forgeessentials.extensions;

import com.forgeessentials.commons.BuildInfo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;

/**
 * Main mod class
 */

@Mod(modid = ForgeEssentialsExtensions.MODID, 
    name = "Forge Essentials Extensions", 
    version = BuildInfo.BASE_VERSION, 
    acceptableRemoteVersions = "*",
    dependencies = "required-after:ForgeEssentials")
public class ForgeEssentialsExtensions
{

    public static final String MODID = "ForgeEssentialsExtensions";

    @Instance
    public static ForgeEssentialsExtensions instance;

}
