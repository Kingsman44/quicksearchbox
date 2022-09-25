package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.g.d.cr */
/* compiled from: PG */
public enum C9209cr implements C62957cd {
    NONE(0),
    VTT(1),
    SUBRIP(2);
    

    /* renamed from: d */
    public final int f31813d;

    private C9209cr(int i) {
        this.f31813d = i;
    }

    /* renamed from: a */
    public static C9209cr m23690a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return VTT;
        }
        if (i != 2) {
            return null;
        }
        return SUBRIP;
    }

    /* renamed from: b */
    public static C62959cf m23691b() {
        return C9208cq.f31808a;
    }

    public final int getNumber() {
        return this.f31813d;
    }

    public final String toString() {
        return Integer.toString(this.f31813d);
    }
}
