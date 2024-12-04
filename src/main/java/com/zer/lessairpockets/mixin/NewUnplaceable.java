package com.zer.lessairpockets.mixin;

import net.minecraft.block.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = {
    TorchBlock.class, WallTorchBlock.class, PlantBlock.class, MushroomPlantBlock.class,
    RedstoneWireBlock.class, RepeaterBlock.class, ComparatorBlock.class, SnowBlock.class
})
public interface NewUnplaceable {}