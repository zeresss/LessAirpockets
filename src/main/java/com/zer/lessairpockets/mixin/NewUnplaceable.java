package com.zer.lessairpockets.mixin;

import net.minecraft.block.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = {
    AbstractTorchBlock.class, WallTorchBlock.class, PlantBlock.class, TwistingVinesBlock.class, TwistingVinesPlantBlock.class,
    WeepingVinesBlock.class, WeepingVinesPlantBlock.class, CaveVinesHeadBlock.class, CaveVinesBodyBlock.class,
    MushroomPlantBlock.class, RedstoneWireBlock.class, RepeaterBlock.class, ComparatorBlock.class, SnowBlock.class
})
public interface NewUnplaceable {}