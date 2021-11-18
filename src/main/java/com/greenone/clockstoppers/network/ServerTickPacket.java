package com.greenone.clockstoppers.network;

import com.greenone.clockstoppers.util.TickChanger;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ServerTickPacket implements IPacket{

    public ServerTickPacket(PacketBuffer buf){

    }

    @Override
    public void toBytes(PacketBuffer buf) {

    }

    public ServerTickPacket(){

    }

    @Override
    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> DistExecutor.safeRunWhenOn(Dist.CLIENT, this::setTickRate));
        ctx.get().setPacketHandled(true);
    }

    private DistExecutor.SafeRunnable setTickRate() {
        return () -> {
            TickChanger.stopTicking();
            ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
            service.schedule(TickChanger::resetClientTickRate, 10, TimeUnit.SECONDS);
        };
    }
}
