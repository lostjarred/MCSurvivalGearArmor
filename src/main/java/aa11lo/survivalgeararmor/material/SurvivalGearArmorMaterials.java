package aa11lo.survivalgeararmor.material;

import aa11lo.survivalgeararmor.survivalgeararmor;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SurvivalGearArmorMaterials {
    public static final ArmorMaterial SURVIALGEARARMOR_BASIC = EnumHelper.addArmorMaterial(survivalgeararmor.MODID + ":" + "basic_armor", survivalgeararmor.MODID + ":basic", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
}