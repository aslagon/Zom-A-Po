package kr.mcv.aslagon;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ZombieEvent implements Listener {
    @EventHandler
    public void onCombust(EntityCombustEvent event) {
        if (event.getEntityType() == EntityType.ZOMBIE) { event.setCancelled(true); }
    }

    @EventHandler
    public void onSpawn(EntitySpawnEvent event) {

        if (event.getEntityType() == EntityType.ZOMBIE) {
            LivingEntity entity = (LivingEntity) event.getEntity();
            EntityType entityType = event.getEntityType();

            entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, true));
            entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, true));

            entity.setMaxHealth(250);
            entity.setHealth(entity.getMaxHealth());




        }





    }
}
