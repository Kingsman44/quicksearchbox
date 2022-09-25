package com.google.android.apps.search.googleapp.launcher.p10341b.p10348f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.f.e */
/* compiled from: PG */
public enum C136469e implements C62957cd {
    TNG_MINUS_ONE(1),
    TNG_ACETONE(2);
    

    /* renamed from: c */
    public final int f371559c;

    private C136469e(int i) {
        this.f371559c = i;
    }

    /* renamed from: a */
    public static C136469e m221780a(int i) {
        if (i == 1) {
            return TNG_MINUS_ONE;
        }
        if (i != 2) {
            return null;
        }
        return TNG_ACETONE;
    }

    /* renamed from: b */
    public static C62959cf m221781b() {
        return C136468d.f371555a;
    }

    public final int getNumber() {
        return this.f371559c;
    }

    public final String toString() {
        return Integer.toString(this.f371559c);
    }
}
