package com.greenone.clockstoppers;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;

public class TickChanger {

    public void stopTicking(){
        Minecraft.getInstance().timer = new Timer(0.0F, 0L);
    }

    public static void setClientTickRate(float seconds){
        Minecraft.getInstance().timer = new Timer(seconds, 0L);
    }

    public void resetClientTickRate(){
        Minecraft.getInstance().timer = new Timer(20.0F, 0L);
    }
}
