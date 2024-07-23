
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soda.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.soda.block.entity.Co2CollectorBlockEntity;
import net.mcreator.soda.SodaMod;

public class SodaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SodaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CO_2_COLLECTOR = register("co_2_collector", SodaModBlocks.CO_2_COLLECTOR, Co2CollectorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
