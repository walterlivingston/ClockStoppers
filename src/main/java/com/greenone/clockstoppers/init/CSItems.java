package com.greenone.clockstoppers.init;

import com.greenone.clockstoppers.ClockStoppers;
import com.greenone.clockstoppers.item.StopwatchItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ClockStoppers.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register("stopwatch", () -> new StopwatchItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));

        ITEMS.register(eventBus);
    }
}
