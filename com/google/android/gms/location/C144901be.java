package com.google.android.gms.location;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.location.be */
/* compiled from: PG */
public final class C144901be {
    /* renamed from: a */
    public static String m235499a(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static void m235500b(int i) {
        boolean z;
        if (!(i == 100 || i == 102 || i == 104)) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
                C143919bh.m233961d(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
            }
        }
        z = true;
        C143919bh.m233961d(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }
}
