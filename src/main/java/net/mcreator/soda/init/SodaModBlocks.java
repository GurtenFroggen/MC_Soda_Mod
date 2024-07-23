
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soda.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.soda.block.Co2CollectorBlock;
import net.mcreator.soda.block.AluminiumOreBlock;
import net.mcreator.soda.block.AluminiumBlockBlock;
import net.mcreator.soda.SodaMod;

public class SodaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SodaMod.MODID);
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final RegistryObject<Block> CO_2_COLLECTOR = REGISTRY.register("co_2_collector", () -> new Co2CollectorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
