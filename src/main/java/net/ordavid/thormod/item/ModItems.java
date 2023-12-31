package net.ordavid.thormod.item;

import net.ordavid.thormod.ThorMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThorMod.MOD_ID);

    public static final RegistryObject<Item> THOR_INGOT = ITEMS.register("thor_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THOR_TAB)));
    public static final RegistryObject<Item> RAW_THOR_INGOT = ITEMS.register("raw_thor_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THOR_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}