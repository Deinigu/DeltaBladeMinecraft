package net.deinigu.deltablademod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("deltablademodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DELTA.get());
        }
    };
}
