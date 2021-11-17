package com.greenone.clockstoppers;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import net.minecraftforge.common.MinecraftForge;

public class SideProxy implements IProxy{

    SideProxy(){
        MinecraftForge.EVENT_BUS.register(CSEventHandler.instance);
        Minecraft.getInstance().timer = new Timer(20.0F, 0L);
    }

    public static class Client extends SideProxy{
        Client(){
        }

    }

    public static class Common extends SideProxy{

    }
}
