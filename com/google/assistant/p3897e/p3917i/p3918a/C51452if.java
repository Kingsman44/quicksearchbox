package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.if */
/* compiled from: PG */
public enum C51452if implements C62957cd {
    UNKNOWN_STATE(0),
    STOPPED(1),
    PAUSED(2),
    PLAYING(3),
    FAST_FORWARDING(4),
    REWINDING(5),
    BUFFERING(6),
    ERROR(7),
    CONNECTING(8),
    SKIPPING_TO_PREVIOUS(9),
    SKIPPING_TO_NEXT(10),
    SKIPPING_TO_QUEUE_ITEM(11);
    

    /* renamed from: m */
    public final int f134016m;

    private C51452if(int i) {
        this.f134016m = i;
    }

    /* renamed from: a */
    public static C51452if m86190a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATE;
            case 1:
                return STOPPED;
            case 2:
                return PAUSED;
            case 3:
                return PLAYING;
            case 4:
                return FAST_FORWARDING;
            case 5:
                return REWINDING;
            case 6:
                return BUFFERING;
            case 7:
                return ERROR;
            case 8:
                return CONNECTING;
            case 9:
                return SKIPPING_TO_PREVIOUS;
            case 10:
                return SKIPPING_TO_NEXT;
            case 11:
                return SKIPPING_TO_QUEUE_ITEM;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86191b() {
        return C51451ie.f134002a;
    }

    public final int getNumber() {
        return this.f134016m;
    }

    public final String toString() {
        return Integer.toString(this.f134016m);
    }
}
