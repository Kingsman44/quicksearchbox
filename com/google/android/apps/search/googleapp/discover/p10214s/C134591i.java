package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.i */
/* compiled from: PG */
public enum C134591i implements C62957cd {
    UNKNOWN(0),
    ELIGIBLE(1),
    INELIGIBLE(2);
    

    /* renamed from: d */
    public final int f366539d;

    private C134591i(int i) {
        this.f366539d = i;
    }

    /* renamed from: a */
    public static C134591i m218304a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ELIGIBLE;
        }
        if (i != 2) {
            return null;
        }
        return INELIGIBLE;
    }

    /* renamed from: b */
    public static C62959cf m218305b() {
        return C134590h.f366534a;
    }

    public final int getNumber() {
        return this.f366539d;
    }

    public final String toString() {
        return Integer.toString(this.f366539d);
    }
}
