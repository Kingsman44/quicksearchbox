package com.google.protos.p4850an.p4853b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.an.b.g */
/* compiled from: PG */
public enum C63363g implements C62957cd {
    HOUR_NONE(0),
    HOUR_UNAMBIGUOUS(1),
    HOUR_AMBIGUOUS_ORIGINAL(2),
    HOUR_AMBIGUOUS_INFERRED(3);
    

    /* renamed from: e */
    public final int f171244e;

    private C63363g(int i) {
        this.f171244e = i;
    }

    /* renamed from: a */
    public static C63363g m96228a(int i) {
        if (i == 0) {
            return HOUR_NONE;
        }
        if (i == 1) {
            return HOUR_UNAMBIGUOUS;
        }
        if (i == 2) {
            return HOUR_AMBIGUOUS_ORIGINAL;
        }
        if (i != 3) {
            return null;
        }
        return HOUR_AMBIGUOUS_INFERRED;
    }

    /* renamed from: b */
    public static C62959cf m96229b() {
        return C63362f.f171238a;
    }

    public final int getNumber() {
        return this.f171244e;
    }

    public final String toString() {
        return Integer.toString(this.f171244e);
    }
}
