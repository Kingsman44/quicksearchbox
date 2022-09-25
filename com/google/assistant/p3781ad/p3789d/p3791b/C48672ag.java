package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.b.ag */
/* compiled from: PG */
public enum C48672ag implements C62957cd {
    UNKNOWN(0),
    COMPLETE_SERVER(1),
    ICING(3),
    EXPLORE(17),
    ANSWER(22),
    APPS(2),
    APPS_NICKNAME(41),
    APP_ACTIONS(4),
    APP_ACTIONS_DONATION(33),
    APP_ACTIONS_ENTITY(28),
    APP_ACTIONS_SHORTCUT(32),
    APP_SHORTCUTS(30),
    APP_ACTIONS_SLICE(36),
    CALCULATOR(27),
    CHALKBOARD(26),
    COMMUNICATION(5),
    CONTACT_ALL_DEVICE(6),
    CONTACT_STARRED(7),
    CONTACT_TOP(8),
    CORRECTION(24),
    GEO(9),
    HABIT(10),
    HABIT_RECENT_QUERIES(23),
    HOME_AUTOMATION(29),
    MEDIA(11),
    MESSAGE(12),
    NOTIFICATION(13),
    PCP(25),
    RULE_BASED(21),
    USAGE_STATS_APPS(38),
    SHORTCUT(14),
    SLICES(15),
    TAPAS_SERVER(16),
    WEBPAGE(18),
    WORK_APPS(31),
    ZERO_PREFIX_CARDS(19),
    ZERO_STATE(20),
    OFFLINE_CLIENT(34),
    OFFLINE_WORKER(35),
    SXOY_ONDEVICE(37);
    

    /* renamed from: O */
    public final int f125915O;

    private C48672ag(int i) {
        this.f125915O = i;
    }

    /* renamed from: a */
    public static C48672ag m85258a(String str) {
        return (C48672ag) Enum.valueOf(C48672ag.class, str);
    }

    /* renamed from: b */
    public static C48672ag m85259b(int i) {
        if (i == 41) {
            return APPS_NICKNAME;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return COMPLETE_SERVER;
            case 2:
                return APPS;
            case 3:
                return ICING;
            case 4:
                return APP_ACTIONS;
            case 5:
                return COMMUNICATION;
            case 6:
                return CONTACT_ALL_DEVICE;
            case 7:
                return CONTACT_STARRED;
            case 8:
                return CONTACT_TOP;
            case 9:
                return GEO;
            case 10:
                return HABIT;
            case 11:
                return MEDIA;
            case 12:
                return MESSAGE;
            case 13:
                return NOTIFICATION;
            case 14:
                return SHORTCUT;
            case 15:
                return SLICES;
            case 16:
                return TAPAS_SERVER;
            case 17:
                return EXPLORE;
            case 18:
                return WEBPAGE;
            case 19:
                return ZERO_PREFIX_CARDS;
            case 20:
                return ZERO_STATE;
            case 21:
                return RULE_BASED;
            case 22:
                return ANSWER;
            case 23:
                return HABIT_RECENT_QUERIES;
            case 24:
                return CORRECTION;
            case 25:
                return PCP;
            case 26:
                return CHALKBOARD;
            case 27:
                return CALCULATOR;
            case 28:
                return APP_ACTIONS_ENTITY;
            case 29:
                return HOME_AUTOMATION;
            case 30:
                return APP_SHORTCUTS;
            case 31:
                return WORK_APPS;
            case 32:
                return APP_ACTIONS_SHORTCUT;
            case 33:
                return APP_ACTIONS_DONATION;
            case 34:
                return OFFLINE_CLIENT;
            case 35:
                return OFFLINE_WORKER;
            case 36:
                return APP_ACTIONS_SLICE;
            case 37:
                return SXOY_ONDEVICE;
            case 38:
                return USAGE_STATS_APPS;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m85260c() {
        return C48671af.f125873a;
    }

    public final int getNumber() {
        return this.f125915O;
    }

    public final String toString() {
        return Integer.toString(this.f125915O);
    }
}
