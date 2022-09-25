package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.ih */
/* compiled from: PG */
public enum C51454ih implements C62957cd {
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
    SHUFFLE(11),
    REWIND(12),
    FAST_FORWARD(13),
    SKIP_TO_QUEUE_ITEM(14),
    SET_REPEAT_MODE(15),
    SET_CAPTIONING_ENABLED(16);
    

    /* renamed from: r */
    public final int f134036r;

    private C51454ih(int i) {
        this.f134036r = i;
    }

    /* renamed from: a */
    public static C51454ih m86192a(int i) {
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
            case 12:
                return REWIND;
            case 13:
                return FAST_FORWARD;
            case 14:
                return SKIP_TO_QUEUE_ITEM;
            case 15:
                return SET_REPEAT_MODE;
            case 16:
                return SET_CAPTIONING_ENABLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86193b() {
        return C51453ig.f134017a;
    }

    public final int getNumber() {
        return this.f134036r;
    }

    public final String toString() {
        return Integer.toString(this.f134036r);
    }
}
