
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soda.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.soda.block.LimeLeavesBlock;
import net.mcreator.soda.block.Co2CollectorBlock;
import net.mcreator.soda.block.CitrusWoodBlock;
import net.mcreator.soda.block.CitrusStairsBlock;
import net.mcreator.soda.block.CitrusSlabBlock;
import net.mcreator.soda.block.CitrusPressurePlateBlock;
import net.mcreator.soda.block.CitrusPlanksBlock;
import net.mcreator.soda.block.CitrusLogBlock;
import net.mcreator.soda.block.CitrusFenceGateBlock;
import net.mcreator.soda.block.CitrusFenceBlock;
import net.mcreator.soda.block.CitrusButtonBlock;
import net.mcreator.soda.block.AluminiumOreBlock;
import net.mcreator.soda.block.AluminiumBlockBlock;
import net.mcreator.soda.SodaMod;

public class SodaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SodaMod.MODID);
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final RegistryObject<Block> CO_2_COLLECTOR = REGISTRY.register("co_2_collector", () -> new Co2CollectorBlock());
	public static final RegistryObject<Block> CITRUS_WOOD = REGISTRY.register("citrus_wood", () -> new CitrusWoodBlock());
	public static final RegistryObject<Block> CITRUS_LOG = REGISTRY.register("citrus_log", () -> new CitrusLogBlock());
	public static final RegistryObject<Block> CITRUS_PLANKS = REGISTRY.register("citrus_planks", () -> new CitrusPlanksBlock());
	public static final RegistryObject<Block> CITRUS_STAIRS = REGISTRY.register("citrus_stairs", () -> new CitrusStairsBlock());
	public static final RegistryObject<Block> CITRUS_SLAB = REGISTRY.register("citrus_slab", () -> new CitrusSlabBlock());
	public static final RegistryObject<Block> CITRUS_FENCE = REGISTRY.register("citrus_fence", () -> new CitrusFenceBlock());
	public static final RegistryObject<Block> CITRUS_FENCE_GATE = REGISTRY.register("citrus_fence_gate", () -> new CitrusFenceGateBlock());
	public static final RegistryObject<Block> CITRUS_PRESSURE_PLATE = REGISTRY.register("citrus_pressure_plate", () -> new CitrusPressurePlateBlock());
	public static final RegistryObject<Block> CITRUS_BUTTON = REGISTRY.register("citrus_button", () -> new CitrusButtonBlock());
	public static final RegistryObject<Block> LIME_LEAVES = REGISTRY.register("lime_leaves", () -> new LimeLeavesBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
