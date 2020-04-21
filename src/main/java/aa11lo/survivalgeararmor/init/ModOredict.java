package aa11lo.survivalgeararmor.init;

import aa11lo.survivalgeararmor.survivalgeararmor;
import net.minecraftforge.oredict.OreDictionary;
public class ModOredict {
    public static void registerOredicts(){
        survivalgeararmor.LOGGER.info(survivalgeararmor.NAME + ": Registering Oredict");
        OreDictionary.registerOre("craftingCloth", ModItems.ITEM_CRAFTING_CLOTH );
    }
}