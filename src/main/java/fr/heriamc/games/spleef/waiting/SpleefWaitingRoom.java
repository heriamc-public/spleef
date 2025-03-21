package fr.heriamc.games.spleef.waiting;

import fr.heriamc.games.engine.waitingroom.GameWaitingRoom;
import fr.heriamc.games.spleef.SpleefGame;
import fr.heriamc.games.spleef.player.SpleefPlayer;
import fr.heriamc.games.spleef.task.SpleefStartingTask;

public class SpleefWaitingRoom extends GameWaitingRoom<SpleefGame, SpleefPlayer> {

    public SpleefWaitingRoom(SpleefGame game) {
        super(game);
        this.countdownTask = new SpleefStartingTask(game);
    }

    @Override
    public void onJoin(SpleefPlayer spleefPlayer) {

    }

    @Override
    public void onLeave(SpleefPlayer spleefPlayer) {

    }

    @Override
    protected void giveItems(SpleefPlayer spleefPlayer) {

    }

}