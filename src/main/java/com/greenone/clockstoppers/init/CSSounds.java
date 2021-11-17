package com.greenone.clockstoppers.init;

import com.greenone.clockstoppers.ClockStoppers;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CSSounds {
    public static DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ClockStoppers.MOD_ID);

    public static final SoundEvent STOPWATCH = new SoundEvent(new ResourceLocation(ClockStoppers.MOD_ID));

    public static void register(IEventBus eventBus){
        SOUNDS.register("stopwatch", () -> STOPWATCH);

        SOUNDS.register(eventBus);
    }
}
