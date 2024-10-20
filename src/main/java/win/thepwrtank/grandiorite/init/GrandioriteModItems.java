
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package win.thepwrtank.grandiorite.init;

import win.thepwrtank.grandiorite.item.GraniteSwordItem;
import win.thepwrtank.grandiorite.item.GraniteShovelItem;
import win.thepwrtank.grandiorite.item.GranitePickaxeItem;
import win.thepwrtank.grandiorite.item.GraniteHoeItem;
import win.thepwrtank.grandiorite.item.GraniteAxeItem;
import win.thepwrtank.grandiorite.item.DioriteSwordItem;
import win.thepwrtank.grandiorite.item.DioriteShovelItem;
import win.thepwrtank.grandiorite.item.DioritePickaxeItem;
import win.thepwrtank.grandiorite.item.DioriteHoeItem;
import win.thepwrtank.grandiorite.item.DioriteAxeItem;
import win.thepwrtank.grandiorite.item.AndesiteshovelItem;
import win.thepwrtank.grandiorite.item.AndesitehoeItem;
import win.thepwrtank.grandiorite.item.AndesiteaxeItem;
import win.thepwrtank.grandiorite.item.AndesiteSwordItem;
import win.thepwrtank.grandiorite.item.AndesitePickaxeItem;
import win.thepwrtank.grandiorite.GrandioriteMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class GrandioriteModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GrandioriteMod.MODID);
	public static final DeferredItem<Item> ANDESITE_SHOVEL = REGISTRY.register("andesite_shovel", AndesiteshovelItem::new);
	public static final DeferredItem<Item> ANDESITE_HOE = REGISTRY.register("andesite_hoe", AndesitehoeItem::new);
	public static final DeferredItem<Item> ANDESITEAXE = REGISTRY.register("andesiteaxe", AndesiteaxeItem::new);
	public static final DeferredItem<Item> ANDESITE_SWORD = REGISTRY.register("andesite_sword", AndesiteSwordItem::new);
	public static final DeferredItem<Item> DIORITE_SWORD = REGISTRY.register("diorite_sword", DioriteSwordItem::new);
	public static final DeferredItem<Item> DIORITE_PICKAXE = REGISTRY.register("diorite_pickaxe", DioritePickaxeItem::new);
	public static final DeferredItem<Item> DIORITE_AXE = REGISTRY.register("diorite_axe", DioriteAxeItem::new);
	public static final DeferredItem<Item> DIORITE_SHOVEL = REGISTRY.register("diorite_shovel", DioriteShovelItem::new);
	public static final DeferredItem<Item> DIORITE_HOE = REGISTRY.register("diorite_hoe", DioriteHoeItem::new);
	public static final DeferredItem<Item> GRANITE_SWORD = REGISTRY.register("granite_sword", GraniteSwordItem::new);
	public static final DeferredItem<Item> GRANITE_AXE = REGISTRY.register("granite_axe", GraniteAxeItem::new);
	public static final DeferredItem<Item> GRANITE_HOE = REGISTRY.register("granite_hoe", GraniteHoeItem::new);
	public static final DeferredItem<Item> GRANITE_SHOVEL = REGISTRY.register("granite_shovel", GraniteShovelItem::new);
	public static final DeferredItem<Item> GRANITE_PICKAXE = REGISTRY.register("granite_pickaxe", GranitePickaxeItem::new);
	public static final DeferredItem<Item> ANDESITE_PICKAXE = REGISTRY.register("andesite_pickaxe", AndesitePickaxeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
