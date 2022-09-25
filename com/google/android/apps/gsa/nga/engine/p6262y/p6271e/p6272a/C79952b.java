package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.b */
/* compiled from: PG */
public enum C79952b implements C62957cd {
    UNKNOWN_ORIGIN(0),
    SERVER_ORIGIN(1),
    CLIENT_ORIGIN(2),
    IL_CLIENT(3);
    

    /* renamed from: e */
    public final int f219268e;

    private C79952b(int i) {
        this.f219268e = i;
    }

    /* renamed from: a */
    public static C79952b m128040a(int i) {
        if (i == 0) {
            return UNKNOWN_ORIGIN;
        }
        if (i == 1) {
            return SERVER_ORIGIN;
        }
        if (i == 2) {
            return CLIENT_ORIGIN;
        }
        if (i != 3) {
            return null;
        }
        return IL_CLIENT;
    }

    /* renamed from: b */
    public static C62959cf m128041b() {
        return C79925a.f219073a;
    }

    public final int getNumber() {
        return this.f219268e;
    }

    public final String toString() {
        return Integer.toString(this.f219268e);
    }
}
