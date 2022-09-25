package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.af */
/* compiled from: PG */
public enum C124613af implements C62957cd {
    HFP_USE_UNKNOWN(0),
    HFP_NOT_USED(1),
    HFP_USED(2);
    

    /* renamed from: d */
    public final int f343738d;

    private C124613af(int i) {
        this.f343738d = i;
    }

    /* renamed from: a */
    public static C124613af m204283a(int i) {
        if (i == 0) {
            return HFP_USE_UNKNOWN;
        }
        if (i == 1) {
            return HFP_NOT_USED;
        }
        if (i != 2) {
            return null;
        }
        return HFP_USED;
    }

    /* renamed from: b */
    public static C62959cf m204284b() {
        return C124612ae.f343733a;
    }

    public final int getNumber() {
        return this.f343738d;
    }

    public final String toString() {
        return Integer.toString(this.f343738d);
    }
}
