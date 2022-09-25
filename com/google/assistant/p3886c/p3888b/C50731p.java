package com.google.assistant.p3886c.p3888b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.b.p */
/* compiled from: PG */
public enum C50731p implements C62957cd {
    UNDEFINED(0),
    BROADCAST(1),
    START_ACTIVITY(2);
    

    /* renamed from: d */
    public final int f132020d;

    private C50731p(int i) {
        this.f132020d = i;
    }

    /* renamed from: a */
    public static C50731p m85907a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return BROADCAST;
        }
        if (i != 2) {
            return null;
        }
        return START_ACTIVITY;
    }

    /* renamed from: b */
    public static C62959cf m85908b() {
        return C50730o.f132015a;
    }

    public final int getNumber() {
        return this.f132020d;
    }

    public final String toString() {
        return Integer.toString(this.f132020d);
    }
}
