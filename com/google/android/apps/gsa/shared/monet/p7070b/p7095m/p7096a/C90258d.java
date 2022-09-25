package com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.m.a.d */
/* compiled from: PG */
public enum C90258d implements C62957cd {
    UNKNOWN(0),
    INTERESTS_TAB(1),
    SRP(2),
    MINUS_ONE(3);
    

    /* renamed from: e */
    public final int f252121e;

    private C90258d(int i) {
        this.f252121e = i;
    }

    /* renamed from: a */
    public static C90258d m146802a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return INTERESTS_TAB;
        }
        if (i == 2) {
            return SRP;
        }
        if (i != 3) {
            return null;
        }
        return MINUS_ONE;
    }

    /* renamed from: b */
    public static C62959cf m146803b() {
        return C90257c.f252115a;
    }

    public final int getNumber() {
        return this.f252121e;
    }

    public final String toString() {
        return Integer.toString(this.f252121e);
    }
}
