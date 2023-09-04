package com.example.fishersturrets.block;

import com.example.fishersturrets.FishersTurrets;
import com.example.fishersturrets.item.ModCreateiveModeTab;
import com.example.fishersturrets.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FishersTurrets.MODID);

    public static final RegistryObject<Block> TURRETBASE_BLOCK =  registerBlock("turretbase_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f)
                    .requiresCorrectToolForDrops()), ModCreateiveModeTab.FISHERS_TURRETS_TAB);

    public static final RegistryObject<Block> TURRETGUN_BLOCK = registerBlock("turretgun_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f)
                    .requiresCorrectToolForDrops()), ModCreateiveModeTab.FISHERS_TURRETS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
