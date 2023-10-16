package net.ordavid.thormod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THOR_TAB = new CreativeModeTab("thor_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.THOR_INGOT.get());
        }
    };
}
