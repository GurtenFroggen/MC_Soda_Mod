package net.mcreator.soda.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.soda.init.SodaModBlocks;

import java.util.Map;

public class Co2CollectorFireProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
			if (SodaModBlocks.CO_2_COLLECTOR.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() && Blocks.FIRE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SodaModBlocks.CO_2_COLLECTOR_FULL.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
