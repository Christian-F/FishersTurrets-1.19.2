package com.example.fishersturrets.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreateiveModeTab {
    public static final CreativeModeTab FISHERS_TURRETS_TAB = new CreativeModeTab("Fishers Turrets"){

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TURRETGUN.get());
        }
    };
}
