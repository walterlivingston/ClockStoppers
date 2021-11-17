package com.greenone.clockstoppers.util;

import com.greenone.clockstoppers.util.CSEventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;

public class TickChanger {
    public static float tickRate = 20;

    public static void stopTicking(){
        Minecraft.getInstance().timer = new Timer(0.0F, 0L);
        CSEventHandler.canUpdate = false;
    }

    public static void setClientTickRate(float seconds){
        Minecraft.getInstance().timer = new Timer(seconds, 0L);
        tickRate = seconds;
    }

    public static void resetClientTickRate(){
        Minecraft.getInstance().timer = new Timer(20.0F, 0L);
        tickRate = 20.0F;
        CSEventHandler.canUpdate = true;
    }

    public static float getTickRate(){
        return tickRate;
    }
}
