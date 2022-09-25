package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dn */
/* compiled from: PG */
public enum C14284dn implements C62957cd {
    PLAY(0),
    PAUSE(1),
    STOP(2),
    NEXT(3),
    FORWARD(4),
    PREV(5),
    BACKWARD(6),
    SEEK_TO(7),
    THUMB_UP(8),
    THUMB_DOWN(9),
    REPEAT(10),
    SHUFFLE(11),
    CUSTOM_ACTION(12),
    UNRECOGNIZED(-1);
    

    /* renamed from: o */
    private final int f43214o;

    private C14284dn(int i) {
        this.f43214o = i;
    }

    /* renamed from: a */
    public static C14284dn m30595a(int i) {
        switch (i) {
            case 0:
                return PLAY;
            case 1:
                return PAUSE;
            case 2:
                return STOP;
            case 3:
                return NEXT;
            case 4:
                return FORWARD;
            case 5:
                return PREV;
            case 6:
                return BACKWARD;
            case 7:
                return SEEK_TO;
            case 8:
                return THUMB_UP;
            case 9:
                return THUMB_DOWN;
            case 10:
                return REPEAT;
            case 11:
                return SHUFFLE;
            case 12:
                return CUSTOM_ACTION;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43214o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
