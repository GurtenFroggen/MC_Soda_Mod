
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soda.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.soda.SodaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SodaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SodaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SodaModBlocks.ALUMINIUM_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(SodaModBlocks.CO_2_COLLECTOR.get().asItem());
			tabData.accept(SodaModBlocks.CO_2_COLLECTOR_FULL.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SodaModItems.ALUMINIUM_INGOT.get());
			tabData.accept(SodaModItems.RAW_ALUMINIUM.get());
			tabData.accept(SodaModItems.ALUMINIUM_NUGGET.get());
			tabData.accept(SodaModItems.BOTTLE_CAP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SodaModBlocks.ALUMINIUM_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SodaModItems.CO_2_CARTRIDGE.get());
			tabData.accept(SodaModItems.CARTRIDGE.get());
			tabData.accept(SodaModItems.GLASS_SODA_BOTTLE.get());
		}
	}
}
