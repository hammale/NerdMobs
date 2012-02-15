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
    	if(e.getEntity().getWorld() == plugin.getServer().getWorld("coliseum")){
    		SpawnReason reason = e.getSpawnReason();
    		if(reason == SpawnReason.NATURAL){
    			e.setCancelled(true);
    		}
    	}
    }
}