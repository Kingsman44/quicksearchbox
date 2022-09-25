package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.b.a.h */
/* compiled from: PG */
public enum C48906h implements C62957cd {
    UNSPECIFIED(0),
    TRIGGER_FOR_CURRENT(1),
    TRIGGER_FOR_ALL(2);
    

    /* renamed from: d */
    public final int f126560d;

    private C48906h(int i) {
        this.f126560d = i;
    }

    /* renamed from: a */
    public static C48906h m85303a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return TRIGGER_FOR_CURRENT;
        }
        if (i != 2) {
            return null;
        }
        return TRIGGER_FOR_ALL;
    }

    /* renamed from: b */
    public static C62959cf m85304b() {
        return C48905g.f126555a;
    }

    public final int getNumber() {
        return this.f126560d;
    }

    public final String toString() {
        return Integer.toString(this.f126560d);
    }
}
