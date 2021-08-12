package com.uraneptus.lycheed.common.blocks;

import com.uraneptus.lycheed.common.entities.tile.ModSignTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class ModWallSignBlock extends WallSignBlock {

    public ModWallSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader blockReader) {
        return new ModSignTileEntity();
    }

}
