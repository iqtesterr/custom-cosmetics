package net.chiiblock.customcosmetics.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRemoveEvent;
import org.bukkit.event.player.PlayerMoveEvent;


public class ExampleListener implements Listener {
//    @EventHandler
//    public void mapleSuck(PlayerMoveEvent event) {
//        Player player = event.getPlayer();
//        player.sendMessage("kill maple");


    @EventHandler
    public void pigExplosion(EntityRemoveEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Pig) {
            entity.getWorld().createExplosion(entity.getLocation(), 3F);
        }

    }





}
