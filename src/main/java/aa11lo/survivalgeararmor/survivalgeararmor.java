package aa11lo.survivalgeararmor;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = survivalgeararmor.MODID, name = survivalgeararmor.NAME, version = survivalgeararmor.VERSION, acceptedMinecraftVersions = survivalgeararmor.MC_VERSION)
public class survivalgeararmor {

	public static final String MODID = "survialgeararmor";
	public static final String NAME = "Survival Gear Armor Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(survivalgeararmor.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(survivalgeararmor.NAME + "Armor: Loading");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}

}