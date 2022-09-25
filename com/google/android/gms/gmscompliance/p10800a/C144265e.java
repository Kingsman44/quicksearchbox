package com.google.android.gms.gmscompliance.p10800a;

/* renamed from: com.google.android.gms.gmscompliance.a.e */
/* compiled from: PG */
public abstract class C144265e {
    /* renamed from: a */
    public abstract int mo119791a();

    /* renamed from: b */
    public final boolean mo119794b() {
        return mo119791a() == 1;
    }

    public final String toString() {
        int a = mo119791a();
        if (a == 1) {
            return "ENFORCE";
        }
        if (a == 2) {
            return "NOT_SET";
        }
        if (a != 3) {
            return a != 4 ? "null" : "DO_NOT_ENFORCE";
        }
        return "UNKNOWN";
    }
}
