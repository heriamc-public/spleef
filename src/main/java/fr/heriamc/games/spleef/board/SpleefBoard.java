package fr.heriamc.games.spleef.board;

import fr.heriamc.games.engine.board.GameBoard;
import fr.heriamc.games.spleef.SpleefGame;
import fr.heriamc.games.spleef.player.SpleefPlayer;

public class SpleefBoard extends GameBoard<SpleefGame, SpleefPlayer> {

    public SpleefBoard(SpleefGame game, SpleefPlayer gamePlayer) {
        super(game, gamePlayer);
    }

    @Override
    public void reloadData() {

    }

    @Override
    public void setLines(String s) {
        switch (game.getState()) {
            case WAIT -> {}
            case STARTING -> {}
            case IN_GAME -> {}
            case END -> {}
        }
    }

}