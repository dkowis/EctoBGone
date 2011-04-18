package org.shlrm.bukkit.antislime;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Innectis Nether plugin class
 * <p/>
 * Features:
 * Single-player style Nether portals
 *
 * @author Innectis
 */
public class AntiSlime extends JavaPlugin {
    private final SlimeSpawnListener slimeSpawnListener = new SlimeSpawnListener(this);


    public void onEnable() {
        // Register events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.CREATURE_SPAWN, slimeSpawnListener, Priority.Normal, this);

        // Say hi
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println(pdfFile.getName() + " v" + pdfFile.getVersion() + " enabled");
    }

    public void onDisable() {
    }
}
