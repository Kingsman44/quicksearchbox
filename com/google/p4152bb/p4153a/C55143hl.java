package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.hl */
/* compiled from: PG */
public enum C55143hl implements C62957cd {
    UNKNOWN_COMMAND(0),
    PLAY_FROM_SEARCH(1),
    PLAY_FROM_URI(2),
    SEND_CUSTOM_ACTION(3),
    SKIP_TO_NEXT(4),
    SKIP_TO_PREVIOUS(5),
    PLAY(6),
    PAUSE(7),
    STOP(8),
    SET_RATING(9),
    SEEK_TO(10),
    SHUFFLE(11);
    

    /* renamed from: m */
    private final int f145168m;

    private C55143hl(int i) {
        this.f145168m = i;
    }

    /* renamed from: a */
    public static C55143hl m87608a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMMAND;
            case 1:
                return PLAY_FROM_SEARCH;
            case 2:
                return PLAY_FROM_URI;
            case 3:
                return SEND_CUSTOM_ACTION;
            case 4:
                return SKIP_TO_NEXT;
            case 5:
                return SKIP_TO_PREVIOUS;
            case 6:
                return PLAY;
            case 7:
                return PAUSE;
            case 8:
                return STOP;
            case 9:
                return SET_RATING;
            case 10:
                return SEEK_TO;
            case 11:
                return SHUFFLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87609b() {
        return C55142hk.f145154a;
    }

    public final int getNumber() {
        return this.f145168m;
    }

    public final String toString() {
        return Integer.toString(this.f145168m);
    }
}
