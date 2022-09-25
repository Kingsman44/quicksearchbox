package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cp */
/* compiled from: PG */
public enum C51300cp implements C62957cd {
    UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN(0),
    ASSISTANT_ON_LOCKSCREEN_ALLOWED(1),
    ASSISTANT_ON_LOCKSCREEN_DISALLOWED(2);
    

    /* renamed from: d */
    public final int f133549d;

    private C51300cp(int i) {
        this.f133549d = i;
    }

    /* renamed from: a */
    public static C51300cp m86112a(int i) {
        if (i == 0) {
            return UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN;
        }
        if (i == 1) {
            return ASSISTANT_ON_LOCKSCREEN_ALLOWED;
        }
        if (i != 2) {
            return null;
        }
        return ASSISTANT_ON_LOCKSCREEN_DISALLOWED;
    }

    /* renamed from: b */
    public static C62959cf m86113b() {
        return C51299co.f133544a;
    }

    public final int getNumber() {
        return this.f133549d;
    }

    public final String toString() {
        return Integer.toString(this.f133549d);
    }
}
