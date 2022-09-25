package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ae */
/* compiled from: PG */
public enum C134540ae implements C62957cd {
    ALIGNMENT_UNSPECIFIED(0),
    DEFAULT(1),
    CENTER(2);
    

    /* renamed from: d */
    public final int f366387d;

    private C134540ae(int i) {
        this.f366387d = i;
    }

    /* renamed from: a */
    public static C134540ae m218279a(int i) {
        if (i == 0) {
            return ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    /* renamed from: b */
    public static C62959cf m218280b() {
        return C134539ad.f366382a;
    }

    public final int getNumber() {
        return this.f366387d;
    }

    public final String toString() {
        return Integer.toString(this.f366387d);
    }
}
