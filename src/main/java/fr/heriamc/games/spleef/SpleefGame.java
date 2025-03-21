package fr.heriamc.games.spleef;

import fr.heriamc.api.game.size.GameSizeTemplate;
import fr.heriamc.games.engine.Game;
import fr.heriamc.games.engine.team.GameTeamColor;
import fr.heriamc.games.spleef.player.SpleefPlayer;
import fr.heriamc.games.spleef.setting.SpleefSettings;
import fr.heriamc.games.spleef.player.SpleefTeam;
import fr.heriamc.games.spleef.waiting.SpleefWaitingRoom;

import java.util.UUID;

public class SpleefGame extends Game<SpleefPlayer, SpleefTeam, SpleefSettings> {

    private final SpleefWaitingRoom waitingRoom;

    public SpleefGame() {
        super("Spleef", new SpleefSettings(GameSizeTemplate.SIZE_5V5.toGameSize()));
        this.waitingRoom = new SpleefWaitingRoom(this);
    }

    @Override
    public SpleefTeam defaultGameTeam(int size, GameTeamColor gameTeamColor) {
        return new SpleefTeam(size, gameTeamColor);
    }

    @Override
    public SpleefPlayer defaultGamePlayer(UUID uuid, boolean spectator) {
        return new SpleefPlayer(uuid, 0, 0, spectator);
    }

    @Override
    public void load() {

    }

}