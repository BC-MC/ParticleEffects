package com.ep6.pe;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				ParticleEffects eff = ParticleEffects.ANGRY_VILLAGER;
				for (Player p : Bukkit.getServer().getOnlinePlayers()){
					 eff.display(p.getLocation().add(0, 2, 0), 15, 0, 0, 0, 6, 10);
				}
				
			}
		}, 0, 20);
	}

}
