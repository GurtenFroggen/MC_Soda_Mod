
package net.mcreator.soda.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Co2CartridgeItem extends Item {
	public Co2CartridgeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
