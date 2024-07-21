
package net.mcreator.soda.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlassSodaBottleItem extends Item {
	public GlassSodaBottleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
