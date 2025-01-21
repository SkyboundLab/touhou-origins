package net.reimaden.touhouorigins.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.reimaden.touhouorigins.TouhouOrigins;

public class ModParticles {

    public static final SimpleParticleType ORB = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registries.PARTICLE_TYPE, TouhouOrigins.id("orb"), ORB);
    }
}
