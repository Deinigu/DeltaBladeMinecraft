package net.deinigu.deltablademod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier DELTATIER = new ForgeTier(2, 96969, 1.6f,
            1f, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.DELTABLADE.get()));
}
