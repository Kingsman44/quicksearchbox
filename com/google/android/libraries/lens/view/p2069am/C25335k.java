package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.lens.view.am.k */
/* compiled from: PG */
public enum C25335k implements C62957cd {
    UNKNOWN(0),
    USER(1),
    CLIENT_FALLBACK(2),
    SERVER_PREFETCHED(3),
    SERVER_FINAL(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f68956g;

    private C25335k(int i) {
        this.f68956g = i;
    }

    /* renamed from: a */
    public static C25335k m46664a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER;
        }
        if (i == 2) {
            return CLIENT_FALLBACK;
        }
        if (i == 3) {
            return SERVER_PREFETCHED;
        }
        if (i != 4) {
            return null;
        }
        return SERVER_FINAL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f68956g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
