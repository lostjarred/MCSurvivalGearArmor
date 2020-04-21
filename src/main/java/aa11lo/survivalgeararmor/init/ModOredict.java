package aa11lo.survivalgeararmor.init;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

public class ModOredict {
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        OreDictionary.registerOre("craftingCloth", ModItems.ITEM_CRAFTING_CLOTH );
	}
}