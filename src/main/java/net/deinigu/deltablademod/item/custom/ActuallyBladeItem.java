package net.deinigu.deltablademod.item.custom;

import net.deinigu.deltablademod.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
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
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            summonParticleIdle(pContext, pContext.getClickedPos());
        }
        return super.useOn(pContext);
    }

    private void summonParticleIdle(UseOnContext context, BlockPos blockPos) {
        context.getLevel().addParticle(ModParticles.ACTUALLY_PARTICLES.get(), blockPos.getX() + 0.5d,
                blockPos.getY() + 1.5d, blockPos.getZ() + 0.5d, 0, 0.33d, 0);
    }

}
