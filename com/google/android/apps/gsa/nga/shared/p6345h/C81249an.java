package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.an */
/* compiled from: PG */
public enum C81249an implements C62957cd {
    NOT_SET(0),
    OPTED_IN(1),
    OPTED_OUT(2);
    

    /* renamed from: d */
    public final int f222430d;

    private C81249an(int i) {
        this.f222430d = i;
    }

    /* renamed from: a */
    public static C81249an m129216a(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return OPTED_IN;
        }
        if (i != 2) {
            return null;
        }
        return OPTED_OUT;
    }

    /* renamed from: b */
    public static C62959cf m129217b() {
        return C81248am.f222425a;
    }

    public final int getNumber() {
        return this.f222430d;
    }

    public final String toString() {
        return Integer.toString(this.f222430d);
    }
}
