package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.cn */
/* compiled from: PG */
public enum C48994cn implements C62957cd {
    UNSPECIFIED_STATE(0),
    PHONE_UNLOCKED(1),
    PHONE_LOCKED(2);
    

    /* renamed from: d */
    private final int f126745d;

    private C48994cn(int i) {
        this.f126745d = i;
    }

    /* renamed from: a */
    public static C48994cn m85336a(int i) {
        if (i == 0) {
            return UNSPECIFIED_STATE;
        }
        if (i == 1) {
            return PHONE_UNLOCKED;
        }
        if (i != 2) {
            return null;
        }
        return PHONE_LOCKED;
    }

    /* renamed from: b */
    public static C62959cf m85337b() {
        return C48993cm.f126740a;
    }

    public final int getNumber() {
        return this.f126745d;
    }

    public final String toString() {
        return Integer.toString(this.f126745d);
    }
}
