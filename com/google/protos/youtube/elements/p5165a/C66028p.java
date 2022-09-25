package com.google.protos.youtube.elements.p5165a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.youtube.elements.a.p */
/* compiled from: PG */
public enum C66028p implements C62957cd {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_LIGHT_IMPACT(1),
    HAPTIC_TYPE_MEDIUM_IMPACT(2),
    HAPTIC_TYPE_HEAVY_IMPACT(3),
    HAPTIC_TYPE_SELECTION_CLICK(4),
    HAPTIC_TYPE_SUCCESS(5);
    

    /* renamed from: g */
    private final int f179572g;

    private C66028p(int i) {
        this.f179572g = i;
    }

    /* renamed from: a */
    public static C66028p m96832a(int i) {
        if (i == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return HAPTIC_TYPE_LIGHT_IMPACT;
        }
        if (i == 2) {
            return HAPTIC_TYPE_MEDIUM_IMPACT;
        }
        if (i == 3) {
            return HAPTIC_TYPE_HEAVY_IMPACT;
        }
        if (i == 4) {
            return HAPTIC_TYPE_SELECTION_CLICK;
        }
        if (i != 5) {
            return null;
        }
        return HAPTIC_TYPE_SUCCESS;
    }

    /* renamed from: b */
    public static C62959cf m96833b() {
        return C66027o.f179564a;
    }

    public final int getNumber() {
        return this.f179572g;
    }

    public final String toString() {
        return Integer.toString(this.f179572g);
    }
}
