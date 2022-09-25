package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.eu */
/* compiled from: PG */
public enum C14318eu implements C62957cd {
    UNKNOWN_ACTION(0),
    ACTION_SKIP_TO_PREVIOUS(1),
    ACTION_PLAY(2),
    ACTION_PAUSE(3),
    ACTION_STOP(4),
    ACTION_SKIP_TO_NEXT(5),
    ACTION_SEEK_TO(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f43315i;

    private C14318eu(int i) {
        this.f43315i = i;
    }

    /* renamed from: a */
    public static C14318eu m30604a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION;
            case 1:
                return ACTION_SKIP_TO_PREVIOUS;
            case 2:
                return ACTION_PLAY;
            case 3:
                return ACTION_PAUSE;
            case 4:
                return ACTION_STOP;
            case 5:
                return ACTION_SKIP_TO_NEXT;
            case 6:
                return ACTION_SEEK_TO;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43315i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
