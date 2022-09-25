package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.v */
/* compiled from: PG */
public enum C80267v implements C62957cd {
    FLOW_ID_UNKNOWN(0),
    SWIPE_EDUCATION(1),
    APP_OPEN(2),
    GENERIC_TRY_SAYING(3),
    APP_EDUCATION(4),
    MULTI_STEP_TRY_SAYING(5);
    

    /* renamed from: g */
    public final int f220269g;

    private C80267v(int i) {
        this.f220269g = i;
    }

    /* renamed from: a */
    public static C80267v m128110a(int i) {
        if (i == 0) {
            return FLOW_ID_UNKNOWN;
        }
        if (i == 1) {
            return SWIPE_EDUCATION;
        }
        if (i == 2) {
            return APP_OPEN;
        }
        if (i == 3) {
            return GENERIC_TRY_SAYING;
        }
        if (i == 4) {
            return APP_EDUCATION;
        }
        if (i != 5) {
            return null;
        }
        return MULTI_STEP_TRY_SAYING;
    }

    /* renamed from: b */
    public static C62959cf m128111b() {
        return C80266u.f220261a;
    }

    public final int getNumber() {
        return this.f220269g;
    }

    public final String toString() {
        return Integer.toString(this.f220269g);
    }
}
