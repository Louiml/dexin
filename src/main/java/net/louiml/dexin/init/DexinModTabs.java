
package net.louiml.dexin.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DexinModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(DexinModItems.WATER_ARMOR_HELMET.get());
			tabData.accept(DexinModItems.WATER_ARMOR_CHESTPLATE.get());
			tabData.accept(DexinModItems.WATER_ARMOR_LEGGINGS.get());
			tabData.accept(DexinModItems.WATER_ARMOR_BOOTS.get());
		}
	}
}
