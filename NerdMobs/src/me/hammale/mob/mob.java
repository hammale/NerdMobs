package me.hammale.mob;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class mob extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	private final mobEntity entity = new mobEntity(this);
	
	public boolean active = false;
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("[NerdMob] Version: " + pdfFile.getVersion() + " Enabled!");
		PluginManager pm = getServer().getPluginManager();
	    pm.registerEvent(Event.Type.CREATURE_SPAWN, entity, Event.Priority.Normal, this);
	}

	  public boolean onCommand(final CommandSender sender, Command cmd, String commandLabel, String[] args){
			if(cmd.getName().equalsIgnoreCase("butcher")){
				if(args.length >= 1){
					World w = getServer().getWorld(args[0]);
					removeMobs(w);
					sender.sendMessage(ChatColor.GREEN + "Butchered all mobs in " + args[0]);
				}
			}else if(cmd.getName().equalsIgnoreCase("spawn")){
				if(args.length == 1){
					if(sender instanceof Player){
						Player p = (Player) sender;
						World w = p.getWorld();
						Location l = p.getTargetBlock(null, 300).getLocation();					
						if(isValid(args[0])){
							String name = args[0].toUpperCase();
							CreatureType ct = CreatureType.fromName(name);
							w.spawnCreature(l, ct);
							p.sendMessage(ChatColor.LIGHT_PURPLE + "Spawned a " + args[0]);
						}
					}
				}else if(args.length == 2){
					if(sender instanceof Player){
						Player p = (Player) sender;
						World w = p.getWorld();
						Location l = p.getTargetBlock(null, 300).getLocation();					
						if(isValid(args[0])){
							String name = args[0].toUpperCase();
							CreatureType ct = CreatureType.fromName(name);
							w.spawnCreature(l, ct);
							p.sendMessage(ChatColor.LIGHT_PURPLE + "Spawned a " + args[0]);
						}
					}
				}
			}
			return true;	
	  }
	
	  public boolean isValid(String s){
		String mob = s.toUpperCase();
		
		if(mob.equals("BLAZE")){
			return true;
		}

		else if(mob.equals("CAVE_SPIDER")){
			return true;
		}
		
		else if(mob.equals("CHICKEN")){
			return true;
		}
		
		else if(mob.equals("COW")){
			return true;
		}
		
		else if(mob.equals("CREEPER")){
			return true;
		}
		
		else if(mob.equals("ENDER_DRAGON")){
			return true;
		}
		
		else if(mob.equals("ENDERMAN")){
			return true;
		}
		
		else if(mob.equals("GHAST")){
			return true;
		}
		
		else if(mob.equals("GIANT")){
			return true;
		}
		
		else if(mob.equals("MAGMA_CUBE")){
			return true;
		}
		
		else if(mob.equals("MUSHROOM_COW")){
			return true;
		}
		
		else if(mob.equals("PIG")){
			return true;
		}
		
		else if(mob.equals("PIG_ZOMBIE")){
			return true;
		}
		
		else if(mob.equals("SHEEP")){
			return true;
		}
		
		else if(mob.equals("SILVERFISH")){
			return true;
		}
		
		else if(mob.equals("SKELETON")){
			return true;
		}
		
		else if(mob.equals("SLIME")){
			return true;
		}
		
		else if(mob.equals("SNOWMAN")){
			return true;
		}
		
		else if(mob.equals("SPIDER")){
			return true;
		}
		
		else if(mob.equals("SQUID")){
			return true;
		}
		
		else if(mob.equals("VILLAGER")){
			return true;
		}
		
		else if(mob.equals("WOLF")){
			return true;
		}
		
		else if(mob.equals("ZOMBIE")){
			return true;
		}else{
		  return false;
		}
	  }
	  
	public void removeMobs(World w){
		for(Entity e : w.getEntities()){
			if(e instanceof LivingEntity){
				LivingEntity le = (LivingEntity) e;
				if(!(le instanceof Player)){				
					le.setHealth(0);
				}
			}
		}
	}	
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("[NerdMob] Version: " + pdfFile.getVersion() + " Disabled!");
	}
	
}
