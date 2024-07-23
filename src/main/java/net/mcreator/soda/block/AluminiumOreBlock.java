
package net.mcreator.soda.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AluminiumOreBlock extends Block {
	public AluminiumOreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5f, 3f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}