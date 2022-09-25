package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.u */
/* compiled from: PG */
public enum C119299u implements C62957cd {
    UNKNOWN_STICKINESS(0),
    DEFAULT(1),
    STICKY(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f332676e;

    private C119299u(int i) {
        this.f332676e = i;
    }

    /* renamed from: a */
    public static C119299u m197995a(int i) {
        if (i == 0) {
            return UNKNOWN_STICKINESS;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return STICKY;
    }

    /* renamed from: b */
    public static C62959cf m197996b() {
        return C119298t.f332670a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f332676e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
