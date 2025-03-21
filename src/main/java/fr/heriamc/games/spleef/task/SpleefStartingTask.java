package fr.heriamc.games.spleef.task;

import fr.heriamc.api.game.GameState;
import fr.heriamc.games.engine.utils.task.countdown.CountdownTask;
import fr.heriamc.games.engine.utils.task.countdown.GameCountdownTask;
import fr.heriamc.games.spleef.SpleefGame;
import fr.heriamc.games.spleef.setting.SpleefSettings;
import org.bukkit.Sound;

public class SpleefStartingTask extends GameCountdownTask<SpleefGame> {

    private final SpleefSettings settings;

    public SpleefStartingTask(SpleefGame game) {
        super(10, game);
        this.settings = game.getSettings();
    }

    @Override
    public void onStart() {
        game.getPlayers().values().forEach(settings.getBoardManager()::update);
        game.setState(GameState.STARTING);
    }

    @Override
    public void onNext(CountdownTask task) {
        //game.broadcast(JumpScadeMessages.STARTING_MESSAGE.getMessage(secondsLeft.get()));

        game.getAlivePlayers()
                .forEach(gamePlayer -> {
                    gamePlayer.getPlayer().setLevel(secondsLeft.get());
                    gamePlayer.getPlayer().playSound(gamePlayer.getLocation(), Sound.NOTE_PLING, 20f, 20f);

                    switch (secondsLeft.get()) {
                        case 3 -> gamePlayer.sendTitle(20, 20, 20, "§c3", "");
                        case 2 -> gamePlayer.sendTitle(20, 20, 20, "§62", "");
                        case 1 -> gamePlayer.sendTitle(20, 20, 20, "§e1", "");
                    }
                });
    }

    @Override
    public void onComplete() {
        game.setState(GameState.IN_GAME);
        //game.getGameCycleTask().run();
        game.getPlayers().values().forEach(settings.getBoardManager()::update);

        game.fillTeam();
        //game.getTeams().forEach(SpleefTeam::teleportMembers);
    }

    @Override
    public void onCancel() {
        game.setState(GameState.WAIT);
        //game.broadcast(JumpScadeMessages.STARTING_CANCELLED.getMessage());
    }

}