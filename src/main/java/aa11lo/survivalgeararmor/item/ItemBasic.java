package aa11lo.survivalgeararmor.item;

import aa11lo.survivalgeararmor.survivalgeararmor;
import net.minecraft.item.Item;

public class ItemBasic extends Item{
    public ItemBasic(String unlocalisedName, String registryName){
        setTranslationKey(survivalgeararmor.MODID + "." + unlocalisedName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeararmor.SurvivalGearArmorTab);
    }
}