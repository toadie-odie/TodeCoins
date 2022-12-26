package net.warrentode.todecoins.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.warrentode.todecoins.TodeCoins;
import net.warrentode.todecoins.block.custom.CoinPressBlock;
import net.warrentode.todecoins.item.ModCreativeModeTab;
import net.warrentode.todecoins.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TodeCoins.MOD_ID);

    public static final RegistryObject<Block> COPPER_COIN_BAG = registerBlock("copper_coin_bag",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.CHAIN).strength(2f)),
            ModCreativeModeTab.TODECOINSTAB);

    public static final RegistryObject<Block> COINPRESSBLOCK = registerBlock("coin_press",
            ()-> new CoinPressBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.ANVIL).strength(6f)),
            ModCreativeModeTab.TODECOINSTAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, ()->new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}