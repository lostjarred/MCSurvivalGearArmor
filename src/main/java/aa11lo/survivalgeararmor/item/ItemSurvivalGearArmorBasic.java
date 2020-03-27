package aa11lo.survivalgeararmor.item;

import aa11lo.survivalgeararmor.survivalgeararmor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemSurvivalGearArmorBasic extends ItemArmor{
    public ItemSurvivalGearArmorBasic(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName){
        super(material, 0, equipmentSlot);

        setTranslationKey(survivalgeararmor.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeararmor.SurvivalGearArmorTab);
    }
}