package com.greenone.clockstoppers;

import com.greenone.clockstoppers.init.CSItems;
import com.greenone.clockstoppers.init.Registration;
import com.greenone.clockstoppers.util.CSEventHandler;
import com.greenone.clockstoppers.util.IProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy implements IProxy {

    SideProxy(){
        MinecraftForge.EVENT_BUS.register(CSEventHandler.instance);
        Registration.init();
    }

    public static class Client extends SideProxy{
        Client(){
        }
    }

    public static class Common extends SideProxy{
        Common(){
        }
    }
}
