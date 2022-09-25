package com.google.assistant.p3886c.p3888b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.b.d */
/* compiled from: PG */
public enum C50719d implements C62957cd {
    UNDEFINED(0),
    EVENT_START_TIME(1),
    EVENT_END_TIME(2),
    FIXED_STRING(3);
    

    /* renamed from: e */
    public final int f131984e;

    private C50719d(int i) {
        this.f131984e = i;
    }

    /* renamed from: a */
    public static C50719d m85891a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EVENT_START_TIME;
        }
        if (i == 2) {
            return EVENT_END_TIME;
        }
        if (i != 3) {
            return null;
        }
        return FIXED_STRING;
    }

    /* renamed from: b */
    public static C62959cf m85892b() {
        return C50718c.f131978a;
    }

    public final int getNumber() {
        return this.f131984e;
    }

    public final String toString() {
        return Integer.toString(this.f131984e);
    }
}
