package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.l.a.bc */
/* compiled from: PG */
public enum C52697bc implements C62957cd {
    UNKNOWN_HOTWORD_SENSITIVITY(0),
    HOTWORD_SENSITIVITY_LOW(1),
    HOTWORD_SENSITIVITY_NORMAL(2),
    HOTWORD_SENSITIVITY_HIGH(3),
    HOTWORD_SENSITIVITY_LOW_2(4),
    HOTWORD_SENSITIVITY_HIGH_2(5);
    

    /* renamed from: g */
    public final int f138349g;

    private C52697bc(int i) {
        this.f138349g = i;
    }

    /* renamed from: a */
    public static C52697bc m86692a(int i) {
        if (i == 0) {
            return UNKNOWN_HOTWORD_SENSITIVITY;
        }
        if (i == 1) {
            return HOTWORD_SENSITIVITY_LOW;
        }
        if (i == 2) {
            return HOTWORD_SENSITIVITY_NORMAL;
        }
        if (i == 3) {
            return HOTWORD_SENSITIVITY_HIGH;
        }
        if (i == 4) {
            return HOTWORD_SENSITIVITY_LOW_2;
        }
        if (i != 5) {
            return null;
        }
        return HOTWORD_SENSITIVITY_HIGH_2;
    }

    /* renamed from: b */
    public static C62959cf m86693b() {
        return C52696bb.f138341a;
    }

    public final int getNumber() {
        return this.f138349g;
    }

    public final String toString() {
        return Integer.toString(this.f138349g);
    }
}
