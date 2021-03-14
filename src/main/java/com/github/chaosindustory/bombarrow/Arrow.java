package com.github.chaosindustory.bombarrow;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Entity;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Arrow implements Listener {

    @EventHandler
    public void ArrowMethod(ProjectileHitEvent event){
        if(event.getEntity().getType().toString().equalsIgnoreCase("SPECTRAL_ARROW")){
            Entity entity = event.getEntity();
            entity.getWorld().createExplosion(entity.getLocation(),3,false,false);
        }
    }
}
