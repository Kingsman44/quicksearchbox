package com.google.assistant.p3745ab.p3771w;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ab.w.e */
/* compiled from: PG */
public enum C48418e implements C62957cd {
    ON_DEVICE_STACK_STATUS_UNKNOWN(0),
    ON_DEVICE_STACK_ENABLED(1),
    ON_DEVICE_STACK_DISABLED(2);
    

    /* renamed from: d */
    public final int f125126d;

    private C48418e(int i) {
        this.f125126d = i;
    }

    /* renamed from: a */
    public static C48418e m85225a(int i) {
        if (i == 0) {
            return ON_DEVICE_STACK_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ON_DEVICE_STACK_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return ON_DEVICE_STACK_DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m85226b() {
        return C48417d.f125121a;
    }

    public final int getNumber() {
        return this.f125126d;
    }

    public final String toString() {
        return Integer.toString(this.f125126d);
    }
}
