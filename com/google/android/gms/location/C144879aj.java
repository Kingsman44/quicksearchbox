package com.google.android.gms.location;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.location.aj */
/* compiled from: PG */
public final class C144879aj {
    /* renamed from: a */
    public static String m235476a(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static void m235477b(int i) {
        boolean z;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                C143919bh.m233961d(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
            }
        }
        z = true;
        C143919bh.m233961d(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
    }
}
