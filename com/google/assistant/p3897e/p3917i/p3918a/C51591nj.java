package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.nj */
/* compiled from: PG */
public enum C51591nj implements C62957cd {
    UNKNOWN_TIMER_STATUS(0),
    RUNNING(1),
    PAUSED(2),
    FIRING(3);
    

    /* renamed from: e */
    public final int f134461e;

    private C51591nj(int i) {
        this.f134461e = i;
    }

    /* renamed from: a */
    public static C51591nj m86227a(int i) {
        if (i == 0) {
            return UNKNOWN_TIMER_STATUS;
        }
        if (i == 1) {
            return RUNNING;
        }
        if (i == 2) {
            return PAUSED;
        }
        if (i != 3) {
            return null;
        }
        return FIRING;
    }

    /* renamed from: b */
    public static C62959cf m86228b() {
        return C51590ni.f134455a;
    }

    public final int getNumber() {
        return this.f134461e;
    }

    public final String toString() {
        return Integer.toString(this.f134461e);
    }
}
