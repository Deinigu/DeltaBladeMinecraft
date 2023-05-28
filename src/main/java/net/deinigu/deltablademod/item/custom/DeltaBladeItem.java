package net.deinigu.deltablademod.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class DeltaBladeItem extends SwordItem {

    public DeltaBladeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties properties) {
        super(pTier,pAttackDamageModifier,pAttackSpeedModifier,properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,200),pAttacker);
        return super.hurtEnemy(pStack,pTarget,pAttacker);
    }


}
