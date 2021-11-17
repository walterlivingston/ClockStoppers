package com.greenone.clockstoppers.init;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registration {

    public static void init(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CSItems.register(eventBus);
        CSSounds.register(eventBus);
    }
}
