package com.greenone.clockstoppers.item;

import com.greenone.clockstoppers.init.CSSounds;
import com.greenone.clockstoppers.util.TickChanger;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StopwatchItem extends Item {
    public StopwatchItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if(world.isClientSide()){
            if(hand == Hand.MAIN_HAND){
                world.playSound(player, player.blockPosition(), CSSounds.STOPWATCH, SoundCategory.PLAYERS, 2.0F, 1.0F);

                TickChanger.stopTicking();
                ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
                service.schedule(TickChanger::resetClientTickRate, 10, TimeUnit.SECONDS);
            }
        }
        return super.use(world, player, hand);
    }
}
