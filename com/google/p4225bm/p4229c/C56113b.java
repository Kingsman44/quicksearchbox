package com.google.p4225bm.p4229c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bm.c.b */
/* compiled from: PG */
public enum C56113b implements C62957cd {
    UNKNOWN(0),
    HOME_SCREEN_SHORTCUT_TO_HOMEBASE(1),
    HOME_SCREEN_SHORTCUT_TO_SHOW(2),
    PODCASTS_APP_HOMEBASE(10),
    AGSA_SRP_MORE_EPISODES(3),
    AGSA_SRP_PLAY_EPISODE(4),
    CHROME_SRP_MORE_EPISODES(5),
    CHROME_SRP_PLAY_EPISODE(6),
    NOTIFICATION(7),
    NEW_EPISODE_NOTIFICATION(13),
    YOUR_NEWS_UPDATE(17),
    CAMPAIGN(18),
    DISCOVER_PLAY_EPISODE(12),
    SHARE(14),
    DEEPLINK_TO_SHOW(11),
    DEEPLINK_TO_QUEUE(15),
    OPA(8),
    OPA_SNAPSHOT(16),
    UI_TEST(9),
    OHANA(19);
    

    /* renamed from: u */
    public final int f149497u;

    private C56113b(int i) {
        this.f149497u = i;
    }

    /* renamed from: a */
    public static C56113b m87894a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return HOME_SCREEN_SHORTCUT_TO_HOMEBASE;
            case 2:
                return HOME_SCREEN_SHORTCUT_TO_SHOW;
            case 3:
                return AGSA_SRP_MORE_EPISODES;
            case 4:
                return AGSA_SRP_PLAY_EPISODE;
            case 5:
                return CHROME_SRP_MORE_EPISODES;
            case 6:
                return CHROME_SRP_PLAY_EPISODE;
            case 7:
                return NOTIFICATION;
            case 8:
                return OPA;
            case 9:
                return UI_TEST;
            case 10:
                return PODCASTS_APP_HOMEBASE;
            case 11:
                return DEEPLINK_TO_SHOW;
            case 12:
                return DISCOVER_PLAY_EPISODE;
            case 13:
                return NEW_EPISODE_NOTIFICATION;
            case 14:
                return SHARE;
            case 15:
                return DEEPLINK_TO_QUEUE;
            case 16:
                return OPA_SNAPSHOT;
            case 17:
                return YOUR_NEWS_UPDATE;
            case 18:
                return CAMPAIGN;
            case 19:
                return OHANA;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87895b() {
        return C56112a.f149475a;
    }

    public final int getNumber() {
        return this.f149497u;
    }

    public final String toString() {
        return Integer.toString(this.f149497u);
    }
}
