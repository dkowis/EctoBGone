package org.shlrm.bukkit.antislime;

import org.bukkit.entity.CreatureType;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityListener;

/**
 * Created by IntelliJ IDEA.
 * User: dkowis
 * Date: 4/18/11
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class SlimeSpawnListener extends EntityListener {
    private AntiSlime main;

    public SlimeSpawnListener(AntiSlime plugin) {
        main = plugin;
    }

    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if(event.getCreatureType() == CreatureType.SLIME) {
            event.setCancelled(true);
        }
    }

}
