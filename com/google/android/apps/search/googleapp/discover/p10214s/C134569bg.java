package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bg */
/* compiled from: PG */
public enum C134569bg implements C62957cd {
    UNKNOWN_SURFACE(0),
    AGA_MAIN_APP(1),
    MINUS_ONE(2);
    

    /* renamed from: d */
    public final int f366479d;

    private C134569bg(int i) {
        this.f366479d = i;
    }

    /* renamed from: a */
    public static C134569bg m218288a(int i) {
        if (i == 0) {
            return UNKNOWN_SURFACE;
        }
        if (i == 1) {
            return AGA_MAIN_APP;
        }
        if (i != 2) {
            return null;
        }
        return MINUS_ONE;
    }

    /* renamed from: b */
    public static C62959cf m218289b() {
        return C134568bf.f366474a;
    }

    public final int getNumber() {
        return this.f366479d;
    }

    public final String toString() {
        return Integer.toString(this.f366479d);
    }
}
