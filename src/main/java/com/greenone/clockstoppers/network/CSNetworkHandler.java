package com.greenone.clockstoppers.network;

import com.greenone.clockstoppers.ClockStoppers;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import java.util.Optional;

public class CSNetworkHandler {
    public static SimpleChannel INSTANCE;
    private static int ID = 0;

    public static int nextID(){ return ID++; }

    public static void registerMessages(){
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(ClockStoppers.MOD_ID, "clockstoppers"), () -> "1.0", s -> true, s -> true);

        INSTANCE.registerMessage(nextID(), ServerTickPacket.class, ServerTickPacket::toBytes, ServerTickPacket::new, ServerTickPacket::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    }
}
