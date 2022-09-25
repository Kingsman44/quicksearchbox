package com.google.android.gms.location;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.location.bf */
/* compiled from: PG */
public final class C144902bf {
    /* renamed from: a */
    public static String m235501a(int i) {
        if (i == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static void m235502b(int i) {
        boolean z;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                C143919bh.m233961d(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            }
        }
        z = true;
        C143919bh.m233961d(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
    }
}
