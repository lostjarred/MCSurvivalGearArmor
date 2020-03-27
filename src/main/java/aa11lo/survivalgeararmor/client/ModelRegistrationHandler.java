package aa11lo.survivalgeararmor.client;

import aa11lo.survivalgeararmor.survivalgeararmor;
import aa11lo.survivalgeararmor.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = survivalgeararmor.MODID)
public class ModelRegistrationHandler {
    @SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.ITEM_CRAFTING_CLOTH, 0);
        registerModel(ModItems.ARMOR_BASIC_BOOTS, 0);
        registerModel(ModItems.ARMOR_BASIC_CHESTPLATE, 0);
        registerModel(ModItems.ARMOR_BASIC_HELMENT, 0);
        registerModel(ModItems.ARMOR_BASIC_LEGGINGS, 0);
    }

    private static void registerModel(Item item, int meta) {
        aa11lo.survivalgeararmor.survivalgeararmor.LOGGER.info("loading model from " + item.getRegistryName());
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}