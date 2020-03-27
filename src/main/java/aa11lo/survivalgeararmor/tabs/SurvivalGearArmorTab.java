package aa11lo.survivalgeararmor.tabs;

import aa11lo.survivalgeararmor.survivalgeararmor;
import aa11lo.survivalgeararmor.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SurvivalGearArmorTab extends CreativeTabs {
    
    public SurvivalGearArmorTab(){
        super(survivalgeararmor.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ModItems.ITEM_CRAFTING_CLOTH);
    }
}