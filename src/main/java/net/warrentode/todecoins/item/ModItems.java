package net.warrentode.todecoins.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.warrentode.todecoins.TodeCoins;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TodeCoins.MOD_ID);

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));

    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));
    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));
    public static final RegistryObject<Item> EMERALD_BANK_NOTE = ITEMS.register("emerald_bank_note",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));
    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TODECOINSTAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}