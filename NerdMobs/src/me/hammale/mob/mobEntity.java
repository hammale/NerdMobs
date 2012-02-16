package me.hammale.mob;

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityListener;


public class mobEntity extends EntityListener {

	public mob plugin;
	
    public mobEntity(mob instance) {
    	plugin = instance;
    }

    public void onCreatureSpawn(CreatureSpawnEvent e){
    	if(plugin.getStopWorlds().contains(",")){
    		String delims = ",";
			String[] worlds = plugin.getStopWorlds().split(delims);
			for(String s : worlds){
	    		if(e.getEntity().getWorld() == plugin.getServer().getWorld(s)){
		    		SpawnReason reason = e.getSpawnReason();
		    		if(reason == SpawnReason.NATURAL){
		    			e.setCancelled(true);
		    		}
	    		}
			}
    	}else{
    		if(e.getEntity().getWorld() == plugin.getServer().getWorld(plugin.getStopWorlds())){
	    		SpawnReason reason = e.getSpawnReason();
	    		if(reason == SpawnReason.NATURAL){
	    			e.setCancelled(true);
	    		}
    		}
    	}
    }
}