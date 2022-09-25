package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ah */
/* compiled from: PG */
public enum C134543ah implements C62957cd {
    UNKNOWN_CONTENT(0),
    ELEMENTS(1);
    

    /* renamed from: c */
    private final int f366392c;

    private C134543ah(int i) {
        this.f366392c = i;
    }

    /* renamed from: a */
    public static C134543ah m218281a(int i) {
        if (i == 0) {
            return UNKNOWN_CONTENT;
        }
        if (i != 1) {
            return null;
        }
        return ELEMENTS;
    }

    /* renamed from: b */
    public static C62959cf m218282b() {
        return C134542ag.f366388a;
    }

    public final int getNumber() {
        return this.f366392c;
    }

    public final String toString() {
        return Integer.toString(this.f366392c);
    }
}
