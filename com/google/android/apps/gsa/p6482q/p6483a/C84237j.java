package com.google.android.apps.gsa.p6482q.p6483a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.q.a.j */
/* compiled from: PG */
public enum C84237j implements C62957cd {
    UNIFIED_OPT_IN_UI_UNKNOWN(0),
    UNIFIED_OPT_IN_UI_SHOW_LEGACY(1),
    UNIFIED_OPT_IN_UI_SHOW_V1(2),
    UNIFIED_OPT_IN_UI_SHOW_V2(3);
    

    /* renamed from: e */
    public final int f229238e;

    private C84237j(int i) {
        this.f229238e = i;
    }

    /* renamed from: a */
    public static C84237j m134314a(int i) {
        if (i == 0) {
            return UNIFIED_OPT_IN_UI_UNKNOWN;
        }
        if (i == 1) {
            return UNIFIED_OPT_IN_UI_SHOW_LEGACY;
        }
        if (i == 2) {
            return UNIFIED_OPT_IN_UI_SHOW_V1;
        }
        if (i != 3) {
            return null;
        }
        return UNIFIED_OPT_IN_UI_SHOW_V2;
    }

    /* renamed from: b */
    public static C62959cf m134315b() {
        return C84236i.f229232a;
    }

    public final int getNumber() {
        return this.f229238e;
    }

    public final String toString() {
        return Integer.toString(this.f229238e);
    }
}
