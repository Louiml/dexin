
package net.louiml.dexin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.louiml.dexin.item.WaterArmorItem;
import net.louiml.dexin.DexinMod;

public class DexinModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DexinMod.MODID);
	public static final RegistryObject<Item> WATER_ARMOR_HELMET = REGISTRY.register("water_armor_helmet", () -> new WaterArmorItem.Helmet());
	public static final RegistryObject<Item> WATER_ARMOR_CHESTPLATE = REGISTRY.register("water_armor_chestplate", () -> new WaterArmorItem.Chestplate());
	public static final RegistryObject<Item> WATER_ARMOR_LEGGINGS = REGISTRY.register("water_armor_leggings", () -> new WaterArmorItem.Leggings());
	public static final RegistryObject<Item> WATER_ARMOR_BOOTS = REGISTRY.register("water_armor_boots", () -> new WaterArmorItem.Boots());
}
