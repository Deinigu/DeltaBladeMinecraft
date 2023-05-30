package net.deinigu.deltablademod.item;

import net.deinigu.deltablademod.DeltabladeMod;
import net.deinigu.deltablademod.item.custom.DeltaBladeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeltabladeMod.MOD_ID);

    public static final RegistryObject<Item> DELTA = ITEMS.register("delta", ()->new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));
    public static final RegistryObject<Item> BLADE = ITEMS.register("blade",()->new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));
    public static final RegistryObject<SwordItem> DELTABLADE = ITEMS.register("deltablade",()->new DeltaBladeItem(ModTiers.DELTATIER,12, -2.4f,new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
