package kr.mcv.aslagon;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FallEvent implements Listener {
    @EventHandler
    public void onPlayerFall(EntityDamageEvent event) {
        if (event.getEntityType() == EntityType.PLAYER && event.getEntity().getFallDistance() >= 5) {
            Player player = (Player) event.getEntity();
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 100, true));
        }
    }
}
