package net.deinigu.deltablademod.event;

import net.deinigu.deltablademod.DeltabladeMod;
import net.deinigu.deltablademod.particle.custom.ActuallyParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.deinigu.deltablademod.particle.ModParticles;

@Mod.EventBusSubscriber(modid = DeltabladeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.ACTUALLY_PARTICLES.get(),
                ActuallyParticles.Provider::new);
    }
}
