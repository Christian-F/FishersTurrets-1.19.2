package com.example.fishersturrets.item;

import com.example.fishersturrets.FishersTurrets;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FishersTurrets.MODID);

    //Todo: Delete this and related pieces - this is actually a block
    public static final RegistryObject<Item> TURRETBASE = ITEMS.register("turretbase",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreateiveModeTab.FISHERS_TURRETS_TAB)));
    //Todo: Delete this and related pieces - this is actually a block
    public static final RegistryObject<Item> TURRETGUN = ITEMS.register("turretgun",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreateiveModeTab.FISHERS_TURRETS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
