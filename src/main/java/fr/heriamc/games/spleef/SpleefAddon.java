package fr.heriamc.games.spleef;

import fr.heriamc.games.api.addon.GameAddon;
import fr.heriamc.games.spleef.listener.PlayerConnectionListener;
import fr.heriamc.games.spleef.pool.SpleefPool;

public class SpleefAddon extends GameAddon<SpleefPool> {

    public SpleefAddon() {
        super(new SpleefPool());
    }

    @Override
    public void enable() {
        pool.loadDefaultGames();

        registerListener(
                new PlayerConnectionListener(pool.getGamesManager())
        );
    }

    @Override
    public void disable() {

    }

}