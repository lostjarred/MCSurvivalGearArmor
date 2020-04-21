package aa11lo.survivalgeararmor.init;

import aa11lo.survivalgeararmor.survivalgeararmor;
import aa11lo.survivalgeararmor.item.ItemSurvivalGearArmorBasic;
import aa11lo.survivalgeararmor.material.SurvivalGearArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(survivalgeararmor.MODID)
public class ModItems {

    //ITEMS
    public static final Item ITEM_CRAFTING_CLOTH = null;

    //ARMOR
    public static final Item ARMOR_BASIC_HELMENT = null;
    public static final Item ARMOR_BASIC_CHESTPLATE = null;
    public static final Item ARMOR_BASIC_LEGGINGS = null;
    public static final Item ARMOR_BASIC_BOOTS = null;
    
    @EventBusSubscriber(modid = survivalgeararmor.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                new Item().setRegistryName(survivalgeararmor.MODID, "item_crafting_cloth").setTranslationKey(survivalgeararmor.MODID + "." + "item_crafting_cloth").setCreativeTab(survivalgeararmor.SurvivalGearArmorTab),
                new ItemSurvivalGearArmorBasic(SurvivalGearArmorMaterials.SURVIALGEARARMOR_BASIC, EntityEquipmentSlot.HEAD, "helmentbasic", "armor_basic_helment"),
                new ItemSurvivalGearArmorBasic(SurvivalGearArmorMaterials.SURVIALGEARARMOR_BASIC, EntityEquipmentSlot.CHEST, "chestplatebasic", "armor_basic_chestplate"),
                new ItemSurvivalGearArmorBasic(SurvivalGearArmorMaterials.SURVIALGEARARMOR_BASIC, EntityEquipmentSlot.LEGS, "leggingsbasic", "armor_basic_leggings"),
                new ItemSurvivalGearArmorBasic(SurvivalGearArmorMaterials.SURVIALGEARARMOR_BASIC, EntityEquipmentSlot.FEET, "bootsbasic", "armor_basic_boots"),
            };

            event.getRegistry().registerAll(items);
        }
    }

}