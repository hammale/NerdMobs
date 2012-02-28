package me.hammale.mob;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.CreatureType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;


public class mobPlayer implements Listener {

	public mob plugin;
	
    public mobPlayer(mob instance) {
    	plugin = instance;
    }

    @EventHandler
    public void onBlockRedstoneChange(BlockRedstoneEvent event) {
    	final Block b = event.getBlock();	 
    	if (isPressurePlate(b.getType())) {
		    if(event.getNewCurrent() == 1) {
		    	Block initial = b.getRelative(BlockFace.DOWN, 1);
		    	if(initial.getTypeId() == 49){
		    		Block s1 = initial.getRelative(BlockFace.NORTH, 1);
		    		if(s1.getType() == Material.WALL_SIGN){
	    				org.bukkit.block.Sign s = (org.bukkit.block.Sign) s1.getState();
	    				if(s.getLine(0).contains("[") && s.getLine(0).contains("]")){
	    					String line = s.getLine(0);
	    					line = line.replace("[", "");
	    					line = line.replace("]", "");
	    					String mname = line;
	    					if(s.getLine(1) != null){
		    					String cord = s.getLine(1);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    					if(s.getLine(2) != null && (!s.getLine(2).equals(""))){
		    					String cord = s.getLine(2);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    				}
		    		}
		    		Block s2 = initial.getRelative(BlockFace.SOUTH, 1);
		    		if(s2.getType() == Material.WALL_SIGN){
	    				org.bukkit.block.Sign s = (org.bukkit.block.Sign) s2.getState();
	    				if(s.getLine(0).contains("[") && s.getLine(0).contains("]")){
	    					String line = s.getLine(0);
	    					line = line.replace("[", "");
	    					line = line.replace("]", "");
	    					String mname = line;
	    					if(s.getLine(1) != null){
		    					String cord = s.getLine(1);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    					if(s.getLine(2) != null && (!s.getLine(2).equals(""))){
		    					String cord = s.getLine(2);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    				}
		    		}
		    		
		    		Block s3 = initial.getRelative(BlockFace.EAST, 1);
		    		if(s3.getType() == Material.WALL_SIGN){
	    				org.bukkit.block.Sign s = (org.bukkit.block.Sign) s3.getState();
	    				if(s.getLine(0).contains("[") && s.getLine(0).contains("]")){
	    					String line = s.getLine(0);
	    					line = line.replace("[", "");
	    					line = line.replace("]", "");
	    					String mname = line;
	    					if(s.getLine(1) != null){
		    					String cord = s.getLine(1);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    					if(s.getLine(2) != null && (!s.getLine(2).equals(""))){
		    					String cord = s.getLine(2);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    				}
		    		}	
		    		Block s4 = initial.getRelative(BlockFace.WEST, 1);
		    		if(s4.getType() == Material.WALL_SIGN){
	    				org.bukkit.block.Sign s = (org.bukkit.block.Sign) s4.getState();
	    				if(s.getLine(0).contains("[") && s.getLine(0).contains("]")){
	    					String line = s.getLine(0);
	    					line = line.replace("[", "");
	    					line = line.replace("]", "");
	    					String mname = line;
	    					if(s.getLine(1) != null){
		    					String cord = s.getLine(1);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    					if(s.getLine(2) != null && (!s.getLine(2).equals(""))){
		    					String cord = s.getLine(2);
		    					String delims = ",";
								String[] cords = cord.split(delims);
								int x = Integer.parseInt(cords[0]);
								int y = Integer.parseInt(cords[1]);
								int z = Integer.parseInt(cords[2]);
								Location loc = b.getWorld().getBlockAt(x,y,z).getLocation();
								CreatureType ct = CreatureType.valueOf(mname.toUpperCase());
								b.getWorld().spawnCreature(loc, ct);
	    					}
	    				}
		    		}	
		    	}
		    }
    	}
    }
    
    public static boolean isPressurePlate(Material mat) {
		return (mat == Material.STONE_PLATE || mat == Material.WOOD_PLATE);
	}
    
}