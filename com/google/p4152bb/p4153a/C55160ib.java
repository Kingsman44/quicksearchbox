package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.ib */
/* compiled from: PG */
public enum C55160ib implements C62957cd {
    INVALID_COMMAND(0),
    NEXT(1),
    PREVIOUS(2),
    PAUSE(3),
    RESUME(4),
    REWIND(5),
    STOP(6),
    FAST_FORWARD(7),
    MUTE(8),
    CLOSE(9),
    EJECT(10),
    RECORD(11),
    PLAY_PAUSE(12),
    RATE(13),
    SEEK(14),
    SHUFFLE(15);
    

    /* renamed from: q */
    public final int f145231q;

    private C55160ib(int i) {
        this.f145231q = i;
    }

    /* renamed from: a */
    public static C55160ib m87611a(int i) {
        switch (i) {
            case 0:
                return INVALID_COMMAND;
            case 1:
                return NEXT;
            case 2:
                return PREVIOUS;
            case 3:
                return PAUSE;
            case 4:
                return RESUME;
            case 5:
                return REWIND;
            case 6:
                return STOP;
            case 7:
                return FAST_FORWARD;
            case 8:
                return MUTE;
            case 9:
                return CLOSE;
            case 10:
                return EJECT;
            case 11:
                return RECORD;
            case 12:
                return PLAY_PAUSE;
            case 13:
                return RATE;
            case 14:
                return SEEK;
            case 15:
                return SHUFFLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87612b() {
        return C55159ia.f145213a;
    }

    public final int getNumber() {
        return this.f145231q;
    }

    public final String toString() {
        return Integer.toString(this.f145231q);
    }
}
