package aa11lo.survivalgeararmor.init;

import aa11lo.survivalgeararmor.survivalgeararmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(survivalgeararmor.MODID)
public class ModItems {

    public static final Item ITEM_CRAFTING_CLOTH = null;
    
    @EventBusSubscriber(modid = survivalgeararmor.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                new Item().setRegistryName(survivalgeararmor.MODID, "item_crafting_cloth").setTranslationKey(survivalgeararmor.MODID + "." + "item_crafting_cloth").setCreativeTab(survivalgeararmor.SurvivalGearArmorTab)
            };

            event.getRegistry().registerAll(items);

        }
    }

}