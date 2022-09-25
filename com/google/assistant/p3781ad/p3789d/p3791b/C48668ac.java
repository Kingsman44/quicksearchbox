package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.ad.d.b.ac */
/* compiled from: PG */
public enum C48668ac implements C62957cd {
    UNSPECIFIED_REFLECTION_PREDICTOR(0),
    FULFILLMENT_PREDICTOR(1),
    LOGISTIC_PREDICTOR(2),
    TYPE_PREDICTOR(3),
    SOURCE_PREDICTOR(4),
    GROUP_PREDICTOR(5);
    

    /* renamed from: g */
    public final int f125803g;

    private C48668ac(int i) {
        this.f125803g = i;
    }

    /* renamed from: a */
    public static C48668ac m85255a(String str) {
        return (C48668ac) Enum.valueOf(C48668ac.class, str);
    }

    public final int getNumber() {
        return this.f125803g;
    }

    public final String toString() {
        return Integer.toString(this.f125803g);
    }
}
