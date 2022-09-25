package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.u */
/* compiled from: PG */
public enum C80441u implements C62957cd {
    NOT_SET(0),
    SCREEN_NEEDED(1),
    SCREEN_NOT_NEEDED(2);
    

    /* renamed from: d */
    public final int f220788d;

    private C80441u(int i) {
        this.f220788d = i;
    }

    /* renamed from: a */
    public static C80441u m128163a(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return SCREEN_NEEDED;
        }
        if (i != 2) {
            return null;
        }
        return SCREEN_NOT_NEEDED;
    }

    /* renamed from: b */
    public static C62959cf m128164b() {
        return C80440t.f220783a;
    }

    public final int getNumber() {
        return this.f220788d;
    }

    public final String toString() {
        return Integer.toString(this.f220788d);
    }
}
