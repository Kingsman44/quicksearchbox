package com.google.p4017at.p4046e.p4047a.p4048a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.at.e.a.a.f */
/* compiled from: PG */
public enum C53925f implements C62957cd {
    UNKNOWN(0),
    ENFORCE(1),
    DO_NOT_ENFORCE(2);
    

    /* renamed from: d */
    public final int f141497d;

    private C53925f(int i) {
        this.f141497d = i;
    }

    /* renamed from: a */
    public static C53925f m87061a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENFORCE;
        }
        if (i != 2) {
            return null;
        }
        return DO_NOT_ENFORCE;
    }

    /* renamed from: b */
    public static C62959cf m87062b() {
        return C53924e.f141492a;
    }

    public final int getNumber() {
        return this.f141497d;
    }

    public final String toString() {
        return Integer.toString(this.f141497d);
    }
}
