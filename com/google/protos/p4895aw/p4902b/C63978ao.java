package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.b.ao */
/* compiled from: PG */
public enum C63978ao implements C62957cd {
    UNKNOWN(0),
    SYNC_FULL_SNAPSHOT(1),
    SYNC_LATEST_PER_SECONDARY_ID(2),
    SYNC_COMBINED(3);
    

    /* renamed from: e */
    public final int f173025e;

    private C63978ao(int i) {
        this.f173025e = i;
    }

    /* renamed from: a */
    public static C63978ao m96329a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYNC_FULL_SNAPSHOT;
        }
        if (i == 2) {
            return SYNC_LATEST_PER_SECONDARY_ID;
        }
        if (i != 3) {
            return null;
        }
        return SYNC_COMBINED;
    }

    /* renamed from: b */
    public static C62959cf m96330b() {
        return C63977an.f173019a;
    }

    public final int getNumber() {
        return this.f173025e;
    }

    public final String toString() {
        return Integer.toString(this.f173025e);
    }
}
