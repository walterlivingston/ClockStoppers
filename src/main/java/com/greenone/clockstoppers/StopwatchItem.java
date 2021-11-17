package com.greenone.clockstoppers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class StopwatchItem extends Item {
    public StopwatchItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        float sPerTick = 1000F/Minecraft.getInstance().timer.msPerTick;
        if(p_77659_1_.isClientSide()){
            if(sPerTick != 20F && p_77659_3_ == Hand.MAIN_HAND){
                TickChanger.setClientTickRate(1.0F);
            }
        }
        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
