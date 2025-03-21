package fr.heriamc.games.spleef.pool;

import fr.heriamc.games.api.DirectConnectStrategy;
import fr.heriamc.games.api.pool.GamePool;
import fr.heriamc.games.spleef.SpleefGame;

import java.util.function.Supplier;

public class SpleefPool extends GamePool<SpleefGame> {

    public SpleefPool() {
        super(SpleefGame.class, "Spleef Pool", null, 1, 10, DirectConnectStrategy.FILL_GAME);
    }

    @Override
    public Supplier<SpleefGame> newGame() {
        return SpleefGame::new;
    }

}