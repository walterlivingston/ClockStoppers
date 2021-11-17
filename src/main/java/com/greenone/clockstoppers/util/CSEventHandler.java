package com.greenone.clockstoppers.util;

import com.greenone.clockstoppers.ClockStoppers;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClockStoppers.MOD_ID)
public class CSEventHandler {
    public static final CSEventHandler instance = new CSEventHandler();
    public static boolean canUpdate = true;

    public void canUpdate(final EntityEvent.CanUpdate event){
        event.setCanUpdate(canUpdate);
    }
}
