package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.d.b.a.r */
/* compiled from: PG */
public enum C56982r implements C62957cd {
    AFTER_EFFECT_UNSPECIFIED(0),
    REMOVE_INLINE_CONTROLS(1),
    LOG_DISMISS(2),
    LOG_CLICK_NOTIFICATION(3);
    

    /* renamed from: e */
    private final int f152112e;

    private C56982r(int i) {
        this.f152112e = i;
    }

    /* renamed from: a */
    public static C56982r m88247a(int i) {
        if (i == 0) {
            return AFTER_EFFECT_UNSPECIFIED;
        }
        if (i == 1) {
            return REMOVE_INLINE_CONTROLS;
        }
        if (i == 2) {
            return LOG_DISMISS;
        }
        if (i != 3) {
            return null;
        }
        return LOG_CLICK_NOTIFICATION;
    }

    /* renamed from: b */
    public static C62959cf m88248b() {
        return C56981q.f152106a;
    }

    public final int getNumber() {
        return this.f152112e;
    }

    public final String toString() {
        return Integer.toString(this.f152112e);
    }
}
