
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soda.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.soda.item.RawAluminiumItem;
import net.mcreator.soda.item.GlassSodaBottleItem;
import net.mcreator.soda.item.Co2CartridgeItem;
import net.mcreator.soda.item.CartridgeItem;
import net.mcreator.soda.item.BottleCapItem;
import net.mcreator.soda.item.AluminiumNuggetItem;
import net.mcreator.soda.item.AluminiumIngotItem;
import net.mcreator.soda.SodaMod;

public class SodaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SodaMod.MODID);
	public static final RegistryObject<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final RegistryObject<Item> ALUMINIUM_BLOCK = block(SodaModBlocks.ALUMINIUM_BLOCK);
	public static final RegistryObject<Item> ALUMINIUM_ORE = block(SodaModBlocks.ALUMINIUM_ORE);
	public static final RegistryObject<Item> RAW_ALUMINIUM = REGISTRY.register("raw_aluminium", () -> new RawAluminiumItem());
	public static final RegistryObject<Item> CO_2_CARTRIDGE = REGISTRY.register("co_2_cartridge", () -> new Co2CartridgeItem());
	public static final RegistryObject<Item> CARTRIDGE = REGISTRY.register("cartridge", () -> new CartridgeItem());
	public static final RegistryObject<Item> CO_2_COLLECTOR = block(SodaModBlocks.CO_2_COLLECTOR);
	public static final RegistryObject<Item> CO_2_COLLECTOR_FULL = block(SodaModBlocks.CO_2_COLLECTOR_FULL);
	public static final RegistryObject<Item> ALUMINIUM_NUGGET = REGISTRY.register("aluminium_nugget", () -> new AluminiumNuggetItem());
	public static final RegistryObject<Item> BOTTLE_CAP = REGISTRY.register("bottle_cap", () -> new BottleCapItem());
	public static final RegistryObject<Item> GLASS_SODA_BOTTLE = REGISTRY.register("glass_soda_bottle", () -> new GlassSodaBottleItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
