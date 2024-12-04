package com.zer.lessairpockets.mixin;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = {
    TorchBlock.class, WallTorchBlock.class, AbstractPlantPartBlock.class, PlantBlock.class,
    MushroomPlantBlock.class, RedstoneWireBlock.class, AbstractRedstoneGateBlock.class, SnowBlock.class
})
public abstract class CanPlaceAtMixin {

    /**
     * makes it impossible to place block in any fluid
     */
    @Inject(method = "canPlaceAt", at = @At("RETURN"), cancellable = true)
    private void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (this instanceof NewUnplaceable) {
            cir.setReturnValue(cir.getReturnValue() && world.getFluidState(pos).getFluid() == Fluids.EMPTY);
        }
    }

}