package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.h */
/* compiled from: PG */
public enum C134219h implements C62957cd {
    CACHE_UNSPECIFIED(0),
    CACHE_READ_OK(1),
    EMPTY_SESSION(2),
    STALE(3),
    INVALID(4),
    STORAGE_FAILURE(5),
    READ_CANCELLED(6),
    FAILED(7),
    NO_CARDS_FOUND_PREVIOUS_REQUEST_FAILURE(9),
    UNKNOWN(8);
    

    /* renamed from: k */
    public final int f365620k;

    private C134219h(int i) {
        this.f365620k = i;
    }

    public final int getNumber() {
        return this.f365620k;
    }

    public final String toString() {
        return Integer.toString(this.f365620k);
    }
}
