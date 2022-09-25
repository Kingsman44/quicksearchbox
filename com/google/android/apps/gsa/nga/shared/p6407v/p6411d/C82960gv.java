package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gv */
/* compiled from: PG */
public enum C82960gv implements C62957cd {
    UNKNOWN(0),
    GH_INTERVAL_GUEST(1),
    GH_INTERVAL_UNLIKELY_USER(2),
    GH_INTERVAL_USER(3),
    GH_INTERVAL_TRUSTED_USER(4);
    

    /* renamed from: f */
    public final int f226335f;

    private C82960gv(int i) {
        this.f226335f = i;
    }

    /* renamed from: a */
    public static C82960gv m132438a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return GH_INTERVAL_GUEST;
        }
        if (i == 2) {
            return GH_INTERVAL_UNLIKELY_USER;
        }
        if (i == 3) {
            return GH_INTERVAL_USER;
        }
        if (i != 4) {
            return null;
        }
        return GH_INTERVAL_TRUSTED_USER;
    }

    /* renamed from: b */
    public static C62959cf m132439b() {
        return C82959gu.f226328a;
    }

    public final int getNumber() {
        return this.f226335f;
    }

    public final String toString() {
        return Integer.toString(this.f226335f);
    }
}
