package fr.heriamc.games.spleef.setting;

import fr.heriamc.api.game.size.GameSize;
import fr.heriamc.games.engine.GameSettings;
import fr.heriamc.games.engine.MiniGame;
import fr.heriamc.games.engine.board.GameBoard;
import fr.heriamc.games.engine.board.GameBoardManager;
import fr.heriamc.games.engine.player.BaseGamePlayer;
import fr.heriamc.games.spleef.SpleefGame;
import fr.heriamc.games.spleef.board.SpleefBoard;
import fr.heriamc.games.spleef.player.SpleefPlayer;

public class SpleefSettings extends GameSettings<SpleefMapManager> {

    public SpleefSettings(GameSize gameSize) {
        super(gameSize, new GameBoardManager());
    }

    @Override
    public GameBoard<?, ?> defaultBoard(MiniGame game, BaseGamePlayer gamePlayer) {
        return new SpleefBoard((SpleefGame) game, (SpleefPlayer) gamePlayer);
    }

}