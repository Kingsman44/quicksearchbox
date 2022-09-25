package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.hf */
/* compiled from: PG */
public enum C53258hf implements C62957cd {
    WIDGET_TYPE_UNKNOWN(0),
    WIDGET_TYPE_SQUARE(1),
    WIDGET_TYPE_FREEFORM(2),
    WIDGET_TYPE_ALL(3);
    

    /* renamed from: e */
    public final int f139611e;

    private C53258hf(int i) {
        this.f139611e = i;
    }

    /* renamed from: a */
    public static C53258hf m86798a(int i) {
        if (i == 0) {
            return WIDGET_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return WIDGET_TYPE_SQUARE;
        }
        if (i == 2) {
            return WIDGET_TYPE_FREEFORM;
        }
        if (i != 3) {
            return null;
        }
        return WIDGET_TYPE_ALL;
    }

    /* renamed from: b */
    public static C62959cf m86799b() {
        return C53257he.f139605a;
    }

    public final int getNumber() {
        return this.f139611e;
    }

    public final String toString() {
        return Integer.toString(this.f139611e);
    }
}
