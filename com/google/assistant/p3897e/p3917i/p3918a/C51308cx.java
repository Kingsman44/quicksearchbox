package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cx */
/* compiled from: PG */
public enum C51308cx implements C62957cd {
    UNKNOWN_DEVICE_LOCK_ENABLEMENT_STATUS(0),
    DEVICE_LOCK_ENABLED(1),
    DEVICE_LOCK_DISABLED(2);
    

    /* renamed from: d */
    public final int f133572d;

    private C51308cx(int i) {
        this.f133572d = i;
    }

    /* renamed from: a */
    public static C51308cx m86119a(int i) {
        if (i == 0) {
            return UNKNOWN_DEVICE_LOCK_ENABLEMENT_STATUS;
        }
        if (i == 1) {
            return DEVICE_LOCK_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return DEVICE_LOCK_DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m86120b() {
        return C51307cw.f133567a;
    }

    public final int getNumber() {
        return this.f133572d;
    }

    public final String toString() {
        return Integer.toString(this.f133572d);
    }
}
