
package net.mcreator.soda.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BottleCapItem extends Item {
	public BottleCapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
