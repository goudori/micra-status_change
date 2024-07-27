package plugin.micra_twenty;

import static org.bukkit.Bukkit.getPluginManager;

import java.net.http.WebSocket.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.micra_twenty.command.EnemyDownCommand;

public final class Main extends JavaPlugin implements Listener, org.bukkit.event.Listener {

  @Override
  public void onEnable() {
    // Plugin startup logic
    Bukkit.getPluginManager().registerEvents(this, this);

    getCommand("enemyDown").setExecutor(new EnemyDownCommand(this));
  }


}
