package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.cd */
/* compiled from: PG */
public enum C119836cd implements C62957cd {
    UNKNOWN(0),
    CLIENT(1),
    CLIENT_OP_RESULT(2),
    QUERY_FOLLOW_ON(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f333774f;

    private C119836cd(int i) {
        this.f333774f = i;
    }

    /* renamed from: a */
    public static C119836cd m198736a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CLIENT;
        }
        if (i == 2) {
            return CLIENT_OP_RESULT;
        }
        if (i != 3) {
            return null;
        }
        return QUERY_FOLLOW_ON;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f333774f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
