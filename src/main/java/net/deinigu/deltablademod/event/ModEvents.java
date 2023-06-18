package net.deinigu.deltablademod.event;

import net.deinigu.deltablademod.DeltabladeMod;
import net.deinigu.deltablademod.item.ModItems;
import net.deinigu.deltablademod.sound.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = DeltabladeMod.MOD_ID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = DeltabladeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBusEvents {

    }
}
