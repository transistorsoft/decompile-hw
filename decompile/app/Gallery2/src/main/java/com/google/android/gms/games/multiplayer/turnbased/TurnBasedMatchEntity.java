package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ep;
import java.util.ArrayList;

/* compiled from: Unknown */
public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();
    private final String FH;
    private final String GV;
    private final Bundle JO;
    private final String JS;
    private final GameEntity Jq;
    private final long Jr;
    private final ArrayList<ParticipantEntity> Ju;
    private final int Jv;
    private final String Ka;
    private final long Kb;
    private final String Kc;
    private final int Kd;
    private final int Ke;
    private final byte[] Kf;
    private final String Kg;
    private final byte[] Kh;
    private final int Ki;
    private final int Kj;
    private final boolean Kk;
    private final String Kl;
    private final int wj;

    TurnBasedMatchEntity(int versionCode, GameEntity game, String matchId, String creatorId, long creationTimestamp, String lastUpdaterId, long lastUpdatedTimestamp, String pendingParticipantId, int matchStatus, int variant, int version, byte[] data, ArrayList<ParticipantEntity> participants, String rematchId, byte[] previousData, int matchNumber, Bundle autoMatchCriteria, int turnStatus, boolean isLocallyModified, String description, String descriptionParticipantId) {
        this.wj = versionCode;
        this.Jq = game;
        this.GV = matchId;
        this.JS = creatorId;
        this.Jr = creationTimestamp;
        this.Ka = lastUpdaterId;
        this.Kb = lastUpdatedTimestamp;
        this.Kc = pendingParticipantId;
        this.Kd = matchStatus;
        this.Kj = turnStatus;
        this.Jv = variant;
        this.Ke = version;
        this.Kf = data;
        this.Ju = participants;
        this.Kg = rematchId;
        this.Kh = previousData;
        this.Ki = matchNumber;
        this.JO = autoMatchCriteria;
        this.Kk = isLocallyModified;
        this.FH = description;
        this.Kl = descriptionParticipantId;
    }

    public TurnBasedMatchEntity(TurnBasedMatch match) {
        this.wj = 2;
        this.Jq = new GameEntity(match.getGame());
        this.GV = match.getMatchId();
        this.JS = match.getCreatorId();
        this.Jr = match.getCreationTimestamp();
        this.Ka = match.getLastUpdaterId();
        this.Kb = match.getLastUpdatedTimestamp();
        this.Kc = match.getPendingParticipantId();
        this.Kd = match.getStatus();
        this.Kj = match.getTurnStatus();
        this.Jv = match.getVariant();
        this.Ke = match.getVersion();
        this.Kg = match.getRematchId();
        this.Ki = match.getMatchNumber();
        this.JO = match.getAutoMatchCriteria();
        this.Kk = match.isLocallyModified();
        this.FH = match.getDescription();
        this.Kl = match.getDescriptionParticipantId();
        Object data = match.getData();
        if (data != null) {
            this.Kf = new byte[data.length];
            System.arraycopy(data, 0, this.Kf, 0, data.length);
        } else {
            this.Kf = null;
        }
        data = match.getPreviousMatchData();
        if (data != null) {
            this.Kh = new byte[data.length];
            System.arraycopy(data, 0, this.Kh, 0, data.length);
        } else {
            this.Kh = null;
        }
        ArrayList participants = match.getParticipants();
        int size = participants.size();
        this.Ju = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.Ju.add((ParticipantEntity) ((Participant) participants.get(i)).freeze());
        }
    }

    static int a(TurnBasedMatch turnBasedMatch) {
        return ep.hashCode(turnBasedMatch.getGame(), turnBasedMatch.getMatchId(), turnBasedMatch.getCreatorId(), Long.valueOf(turnBasedMatch.getCreationTimestamp()), turnBasedMatch.getLastUpdaterId(), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp()), turnBasedMatch.getPendingParticipantId(), Integer.valueOf(turnBasedMatch.getStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus()), turnBasedMatch.getDescription(), Integer.valueOf(turnBasedMatch.getVariant()), Integer.valueOf(turnBasedMatch.getVersion()), turnBasedMatch.getParticipants(), turnBasedMatch.getRematchId(), Integer.valueOf(turnBasedMatch.getMatchNumber()), turnBasedMatch.getAutoMatchCriteria(), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    static boolean a(TurnBasedMatch turnBasedMatch, Object obj) {
        boolean z = true;
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        if (ep.equal(turnBasedMatch2.getGame(), turnBasedMatch.getGame()) && ep.equal(turnBasedMatch2.getMatchId(), turnBasedMatch.getMatchId()) && ep.equal(turnBasedMatch2.getCreatorId(), turnBasedMatch.getCreatorId()) && ep.equal(Long.valueOf(turnBasedMatch2.getCreationTimestamp()), Long.valueOf(turnBasedMatch.getCreationTimestamp())) && ep.equal(turnBasedMatch2.getLastUpdaterId(), turnBasedMatch.getLastUpdaterId()) && ep.equal(Long.valueOf(turnBasedMatch2.getLastUpdatedTimestamp()), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())) && ep.equal(turnBasedMatch2.getPendingParticipantId(), turnBasedMatch.getPendingParticipantId()) && ep.equal(Integer.valueOf(turnBasedMatch2.getStatus()), Integer.valueOf(turnBasedMatch.getStatus())) && ep.equal(Integer.valueOf(turnBasedMatch2.getTurnStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus())) && ep.equal(turnBasedMatch2.getDescription(), turnBasedMatch.getDescription()) && ep.equal(Integer.valueOf(turnBasedMatch2.getVariant()), Integer.valueOf(turnBasedMatch.getVariant())) && ep.equal(Integer.valueOf(turnBasedMatch2.getVersion()), Integer.valueOf(turnBasedMatch.getVersion())) && ep.equal(turnBasedMatch2.getParticipants(), turnBasedMatch.getParticipants()) && ep.equal(turnBasedMatch2.getRematchId(), turnBasedMatch.getRematchId()) && ep.equal(Integer.valueOf(turnBasedMatch2.getMatchNumber()), Integer.valueOf(turnBasedMatch.getMatchNumber())) && ep.equal(turnBasedMatch2.getAutoMatchCriteria(), turnBasedMatch.getAutoMatchCriteria()) && ep.equal(Integer.valueOf(turnBasedMatch2.getAvailableAutoMatchSlots()), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots()))) {
            if (!ep.equal(Boolean.valueOf(turnBasedMatch2.isLocallyModified()), Boolean.valueOf(turnBasedMatch.isLocallyModified()))) {
            }
            return z;
        }
        z = false;
        return z;
    }

    static String b(TurnBasedMatch turnBasedMatch) {
        return ep.e(turnBasedMatch).a("Game", turnBasedMatch.getGame()).a("MatchId", turnBasedMatch.getMatchId()).a("CreatorId", turnBasedMatch.getCreatorId()).a("CreationTimestamp", Long.valueOf(turnBasedMatch.getCreationTimestamp())).a("LastUpdaterId", turnBasedMatch.getLastUpdaterId()).a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())).a("PendingParticipantId", turnBasedMatch.getPendingParticipantId()).a("MatchStatus", Integer.valueOf(turnBasedMatch.getStatus())).a("TurnStatus", Integer.valueOf(turnBasedMatch.getTurnStatus())).a("Description", turnBasedMatch.getDescription()).a("Variant", Integer.valueOf(turnBasedMatch.getVariant())).a("Data", turnBasedMatch.getData()).a("Version", Integer.valueOf(turnBasedMatch.getVersion())).a("Participants", turnBasedMatch.getParticipants()).a("RematchId", turnBasedMatch.getRematchId()).a("PreviousData", turnBasedMatch.getPreviousMatchData()).a("MatchNumber", Integer.valueOf(turnBasedMatch.getMatchNumber())).a("AutoMatchCriteria", turnBasedMatch.getAutoMatchCriteria()).a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())).a("LocallyModified", Boolean.valueOf(turnBasedMatch.isLocallyModified())).a("DescriptionParticipantId", turnBasedMatch.getDescriptionParticipantId()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public TurnBasedMatch freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.JO;
    }

    public int getAvailableAutoMatchSlots() {
        return this.JO != null ? this.JO.getInt("max_automatch_players") : 0;
    }

    public long getCreationTimestamp() {
        return this.Jr;
    }

    public String getCreatorId() {
        return this.JS;
    }

    public byte[] getData() {
        return this.Kf;
    }

    public String getDescription() {
        return this.FH;
    }

    public String getDescriptionParticipantId() {
        return this.Kl;
    }

    public Game getGame() {
        return this.Jq;
    }

    public long getLastUpdatedTimestamp() {
        return this.Kb;
    }

    public String getLastUpdaterId() {
        return this.Ka;
    }

    public String getMatchId() {
        return this.GV;
    }

    public int getMatchNumber() {
        return this.Ki;
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList(this.Ju);
    }

    public String getPendingParticipantId() {
        return this.Kc;
    }

    public byte[] getPreviousMatchData() {
        return this.Kh;
    }

    public String getRematchId() {
        return this.Kg;
    }

    public int getStatus() {
        return this.Kd;
    }

    public int getTurnStatus() {
        return this.Kj;
    }

    public int getVariant() {
        return this.Jv;
    }

    public int getVersion() {
        return this.Ke;
    }

    public int getVersionCode() {
        return this.wj;
    }

    public int hashCode() {
        return a(this);
    }

    public boolean isLocallyModified() {
        return this.Kk;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel out, int flags) {
        TurnBasedMatchEntityCreator.a(this, out, flags);
    }
}
