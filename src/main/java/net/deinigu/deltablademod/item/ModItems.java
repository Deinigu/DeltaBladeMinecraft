package net.deinigu.deltablademod.item;

import net.deinigu.deltablademod.DeltabladeMod;
import net.deinigu.deltablademod.item.custom.ActuallyBladeItem;
import net.deinigu.deltablademod.item.custom.DeltaBladeItem;
import net.deinigu.deltablademod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
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
    public static final RegistryObject<SwordItem> ACTUALLY_BLADE = ITEMS.register("actually_blade",()->new ActuallyBladeItem(Tiers.NETHERITE,2, -2.4f,new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));

    public static final RegistryObject<RecordItem> MUSIC_BOX_MUSIC_DISC = ITEMS.register("music_box_music_disc",
            () -> new RecordItem(8, ModSounds.MUSIC_BOX, new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB).stacksTo(1),5120));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
