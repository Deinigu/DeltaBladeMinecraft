package net.deinigu.deltablademod.event;

import net.deinigu.deltablademod.DeltabladeMod;
import net.deinigu.deltablademod.item.ModItems;
import net.deinigu.deltablademod.particle.ModParticles;
import net.deinigu.deltablademod.particle.custom.ActuallyParticles;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = DeltabladeMod.MOD_ID)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.getSource().getEntity() instanceof Player player) {
                if (player.getMainHandItem().getItem() == ModItems.ACTUALLY_BLADE.get()) {
                    player.sendSystemMessage(Component.literal("Sonidito"));
                }
            }
        }

    }

    @Mod.EventBusSubscriber(modid = DeltabladeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBusEvents {

        @SubscribeEvent
        public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
            Minecraft.getInstance().particleEngine.register(ModParticles.ACTUALLY_PARTICLES.get(),
                    ActuallyParticles.Provider::new);
        }
    }
}
