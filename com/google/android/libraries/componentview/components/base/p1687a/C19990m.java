package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.componentview.components.base.a.m */
/* compiled from: PG */
public enum C19990m implements C62957cd {
    NONE(0),
    DOTTED(1),
    DASHED(2),
    SOLID(3);
    

    /* renamed from: e */
    private final int f56018e;

    private C19990m(int i) {
        this.f56018e = i;
    }

    /* renamed from: a */
    public static C19990m m37789a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return DOTTED;
        }
        if (i == 2) {
            return DASHED;
        }
        if (i != 3) {
            return null;
        }
        return SOLID;
    }

    /* renamed from: b */
    public static C62959cf m37790b() {
        return C19989l.f56012a;
    }

    public final int getNumber() {
        return this.f56018e;
    }

    public final String toString() {
        return Integer.toString(this.f56018e);
    }
}
