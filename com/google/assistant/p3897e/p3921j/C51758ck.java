package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.ck */
/* compiled from: PG */
public enum C51758ck implements C62957cd {
    UNKNOWN_PROACTIVE_NOTIFICATION(0),
    NO_PROACTIVE_NOTIFICATION(1),
    ALL_PROACTIVE_NOTIFICATIONS(2);
    

    /* renamed from: d */
    public final int f135796d;

    private C51758ck(int i) {
        this.f135796d = i;
    }

    /* renamed from: a */
    public static C51758ck m86374a(int i) {
        if (i == 0) {
            return UNKNOWN_PROACTIVE_NOTIFICATION;
        }
        if (i == 1) {
            return NO_PROACTIVE_NOTIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return ALL_PROACTIVE_NOTIFICATIONS;
    }

    /* renamed from: b */
    public static C62959cf m86375b() {
        return C51757cj.f135791a;
    }

    public final int getNumber() {
        return this.f135796d;
    }

    public final String toString() {
        return Integer.toString(this.f135796d);
    }
}
