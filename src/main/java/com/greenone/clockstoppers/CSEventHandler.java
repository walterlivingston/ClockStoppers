package com.greenone.clockstoppers;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClockStoppers.MOD_ID)
public class CSEventHandler {
    public static final CSEventHandler instance = new CSEventHandler();
    boolean freezeTime = false;

    @SubscribeEvent
    public void onBonemeal(final BonemealEvent event){
        if(!freezeTime){
            Minecraft.getInstance().timer = new Timer(1.0F, 0L);
        }else{
            Minecraft.getInstance().timer = new Timer(20.0F, 0L);
        }
        freezeTime = !freezeTime;
    }

    public void canUpdate(final EntityEvent event){
        if(freezeTime){
            //event.getEntity().canUpdate(false);
        }
    }

}
