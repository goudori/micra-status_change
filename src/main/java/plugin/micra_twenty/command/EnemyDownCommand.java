package plugin.micra_twenty.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import plugin.micra_twenty.Main;

public class EnemyDownCommand implements CommandExecutor {

  private Main main;

  public EnemyDownCommand(Main main) {
    this.main = main;
  }

  @Override
  public boolean onCommand(CommandSender commandSender, Command command, String s,
      String[] strings) {
    if (commandSender instanceof Player player) {
//      体力回復
      player.setHealth(20);
//      スタミナ回復
      player.setFoodLevel(20);
//      飛行許可
      player.setAllowFlight(true);
//      飛行可能
      player.setFlying(true);
//      飛行スピード
      player.setFlySpeed(1f);


    }
    return false;
  }
}
