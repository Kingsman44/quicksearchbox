package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.x */
/* compiled from: PG */
public enum C80590x implements C62957cd {
    UNKNOWN(0),
    STASH(1),
    ESCAPE_HATCH(2),
    CONVERSATION_STARTER(3),
    HISTORY(4),
    LENS(5),
    WHATS_ON_MY_SCREEN(6),
    SHARE_SCREENSHOT(7),
    BISTO(8),
    BISTO_LOW_PRIORITY(9),
    OOBE(10),
    CONVERSATION_STARTER_FALLBACK(11),
    MUSIC_SEARCH(12),
    APP_ACTIONS(13),
    SCREEN_CONTEXT_MANAGE_SETTINGS(14),
    SCREEN_CONTEXT_LEARN_MORE(15),
    HOMESCREEN_ENTRY_POINT(16),
    CONTEXTUAL_CHIP(17),
    VOICE_MATCH(18),
    UPDATES_CENTER(19),
    ASSISTANT_ON_LOCKSCREEN(20),
    LENS_SCREENSHOT(21),
    NEST_PROMO(22),
    READ_ALOUD(23),
    CLIENT_OP_SUGGESTION_ON_DEVICE(25),
    ACCOUNT_FIX(26),
    ONE_LEARNING_CENTER(27),
    EXPLORE(28),
    TELL_MY_FAMILY(29),
    LONG_PRESS_POWER_CONTEXTUAL_EDU(30),
    UNRECOGNIZED(-1);
    

    /* renamed from: F */
    private final int f221263F;

    private C80590x(int i) {
        this.f221263F = i;
    }

    /* renamed from: a */
    public static C80590x m128211a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return STASH;
            case 2:
                return ESCAPE_HATCH;
            case 3:
                return CONVERSATION_STARTER;
            case 4:
                return HISTORY;
            case 5:
                return LENS;
            case 6:
                return WHATS_ON_MY_SCREEN;
            case 7:
                return SHARE_SCREENSHOT;
            case 8:
                return BISTO;
            case 9:
                return BISTO_LOW_PRIORITY;
            case 10:
                return OOBE;
            case 11:
                return CONVERSATION_STARTER_FALLBACK;
            case 12:
                return MUSIC_SEARCH;
            case 13:
                return APP_ACTIONS;
            case 14:
                return SCREEN_CONTEXT_MANAGE_SETTINGS;
            case 15:
                return SCREEN_CONTEXT_LEARN_MORE;
            case 16:
                return HOMESCREEN_ENTRY_POINT;
            case 17:
                return CONTEXTUAL_CHIP;
            case 18:
                return VOICE_MATCH;
            case 19:
                return UPDATES_CENTER;
            case 20:
                return ASSISTANT_ON_LOCKSCREEN;
            case 21:
                return LENS_SCREENSHOT;
            case 22:
                return NEST_PROMO;
            case 23:
                return READ_ALOUD;
            case 25:
                return CLIENT_OP_SUGGESTION_ON_DEVICE;
            case 26:
                return ACCOUNT_FIX;
            case 27:
                return ONE_LEARNING_CENTER;
            case 28:
                return EXPLORE;
            case 29:
                return TELL_MY_FAMILY;
            case 30:
                return LONG_PRESS_POWER_CONTEXTUAL_EDU;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221263F;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
