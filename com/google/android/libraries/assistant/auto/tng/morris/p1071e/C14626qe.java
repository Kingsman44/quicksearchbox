package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.qe */
/* compiled from: PG */
public enum C14626qe implements C62957cd {
    STATUS_UNKNOWN(0),
    YOUTUBE_PREMIUM_USER(1),
    YOUTUBE_FREE_USER(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f44205e;

    private C14626qe(int i) {
        this.f44205e = i;
    }

    /* renamed from: a */
    public static C14626qe m30646a(int i) {
        if (i == 0) {
            return STATUS_UNKNOWN;
        }
        if (i == 1) {
            return YOUTUBE_PREMIUM_USER;
        }
        if (i != 2) {
            return null;
        }
        return YOUTUBE_FREE_USER;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f44205e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
