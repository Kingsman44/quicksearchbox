package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.do */
/* compiled from: PG */
public enum C142390do implements C62957cd {
    ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED(0),
    ASSISTANT_GESTURE_UNAVAILABLE(1),
    ASSISTANT_GESTURE_AVAILABLE_LEFT(2),
    ASSISTANT_GESTURE_AVAILABLE_RIGHT(3),
    ASSISTANT_GESTURE_AVAILABLE_BOTH(4),
    ASSISTANT_GESTURE_AVAILABLE_SINGULAR(5);
    

    /* renamed from: g */
    public final int f386391g;

    private C142390do(int i) {
        this.f386391g = i;
    }

    /* renamed from: a */
    public static C142390do m231074a(int i) {
        if (i == 0) {
            return ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return ASSISTANT_GESTURE_UNAVAILABLE;
        }
        if (i == 2) {
            return ASSISTANT_GESTURE_AVAILABLE_LEFT;
        }
        if (i == 3) {
            return ASSISTANT_GESTURE_AVAILABLE_RIGHT;
        }
        if (i == 4) {
            return ASSISTANT_GESTURE_AVAILABLE_BOTH;
        }
        if (i != 5) {
            return null;
        }
        return ASSISTANT_GESTURE_AVAILABLE_SINGULAR;
    }

    /* renamed from: b */
    public static C62959cf m231075b() {
        return C142389dn.f386383a;
    }

    public final int getNumber() {
        return this.f386391g;
    }

    public final String toString() {
        return Integer.toString(this.f386391g);
    }
}
