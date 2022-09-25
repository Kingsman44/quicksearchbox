package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bs */
/* compiled from: PG */
public enum C124476bs implements C62957cd {
    UNKNOWN_STATE(0),
    CONNECTED(1),
    DISCONNECTED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f343517e;

    private C124476bs(int i) {
        this.f343517e = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f343517e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
