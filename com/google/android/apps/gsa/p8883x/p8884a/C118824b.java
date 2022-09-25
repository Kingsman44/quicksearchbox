package com.google.android.apps.gsa.p8883x.p8884a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.x.a.b */
/* compiled from: PG */
public enum C118824b implements C62957cd {
    GRAPH_EVENTS(1),
    NETWORK(2),
    STREAM(3),
    UNKNOWN_TYPE(0);
    

    /* renamed from: e */
    private final int f331420e;

    private C118824b(int i) {
        this.f331420e = i;
    }

    /* renamed from: a */
    public static C118824b m197210a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return GRAPH_EVENTS;
        }
        if (i == 2) {
            return NETWORK;
        }
        if (i != 3) {
            return null;
        }
        return STREAM;
    }

    public final int getNumber() {
        return this.f331420e;
    }

    public final String toString() {
        return Integer.toString(this.f331420e);
    }
}
