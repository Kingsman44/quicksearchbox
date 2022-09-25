package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.by */
/* compiled from: PG */
public enum C51727by implements C62957cd {
    NO_NOTIFICATION_CAPABILITY(0),
    NOTIFICATIONS_DISABLED(1),
    NOTIFICATIONS_ENABLED(2);
    

    /* renamed from: d */
    public final int f135712d;

    private C51727by(int i) {
        this.f135712d = i;
    }

    /* renamed from: a */
    public static C51727by m86369a(int i) {
        if (i == 0) {
            return NO_NOTIFICATION_CAPABILITY;
        }
        if (i == 1) {
            return NOTIFICATIONS_DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return NOTIFICATIONS_ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m86370b() {
        return C51726bx.f135707a;
    }

    public final int getNumber() {
        return this.f135712d;
    }

    public final String toString() {
        return Integer.toString(this.f135712d);
    }
}
