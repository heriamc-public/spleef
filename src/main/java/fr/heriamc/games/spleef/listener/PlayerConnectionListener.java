package fr.heriamc.games.spleef.listener;

import fr.heriamc.games.api.pool.GameManager;
import fr.heriamc.games.engine.event.player.GamePlayerJoinEvent;
import fr.heriamc.games.engine.event.player.GamePlayerLeaveEvent;
import fr.heriamc.games.spleef.SpleefGame;
import fr.heriamc.games.spleef.player.SpleefPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public record PlayerConnectionListener(GameManager<SpleefGame> gameManager) implements Listener {

    @EventHandler
    public void onJoin(GamePlayerJoinEvent<SpleefGame, SpleefPlayer> event) {

    }

    @EventHandler
    public void onLeave(GamePlayerLeaveEvent<SpleefGame, SpleefPlayer> event) {

    }

    private void saveData() {

    }

}