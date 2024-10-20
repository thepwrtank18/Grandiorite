
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package win.thepwrtank.grandiorite.init;

import win.thepwrtank.grandiorite.GrandioriteMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GrandioriteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrandioriteMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(GrandioriteModItems.ANDESITE_SHOVEL.get());
			tabData.accept(GrandioriteModItems.ANDESITE_HOE.get());
			tabData.accept(GrandioriteModItems.ANDESITEAXE.get());
			tabData.accept(GrandioriteModItems.ANDESITE_SWORD.get());
			tabData.accept(GrandioriteModItems.DIORITE_SWORD.get());
			tabData.accept(GrandioriteModItems.DIORITE_PICKAXE.get());
			tabData.accept(GrandioriteModItems.DIORITE_AXE.get());
			tabData.accept(GrandioriteModItems.DIORITE_SHOVEL.get());
			tabData.accept(GrandioriteModItems.DIORITE_HOE.get());
			tabData.accept(GrandioriteModItems.GRANITE_SWORD.get());
			tabData.accept(GrandioriteModItems.GRANITE_AXE.get());
			tabData.accept(GrandioriteModItems.GRANITE_HOE.get());
			tabData.accept(GrandioriteModItems.GRANITE_SHOVEL.get());
			tabData.accept(GrandioriteModItems.GRANITE_PICKAXE.get());
			tabData.accept(GrandioriteModItems.ANDESITE_PICKAXE.get());

		}
	}
}
