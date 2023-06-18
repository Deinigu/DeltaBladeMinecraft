package net.deinigu.deltablademod.item.custom;

import net.deinigu.deltablademod.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class ActuallyBladeItem extends SwordItem {
    public ActuallyBladeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties properties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, properties);

    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide()) {
            level.playSound(player, player.getOnPos(), ModSounds.ACTUALLY_SOUND.get(), SoundSource.BLOCKS, 1f, 1f);
        }
        return super.use(level,player,hand);
    }

}
