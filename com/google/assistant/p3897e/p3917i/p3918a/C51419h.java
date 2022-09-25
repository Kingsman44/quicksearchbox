package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.h */
/* compiled from: PG */
public enum C51419h implements C62957cd {
    UNKNOWN_ALARM_STATUS(0),
    SCHEDULED(1),
    FIRING(2),
    SNOOZED(3),
    DISABLED(4),
    MISSED(5);
    

    /* renamed from: g */
    public final int f133932g;

    private C51419h(int i) {
        this.f133932g = i;
    }

    /* renamed from: a */
    public static C51419h m86180a(int i) {
        if (i == 0) {
            return UNKNOWN_ALARM_STATUS;
        }
        if (i == 1) {
            return SCHEDULED;
        }
        if (i == 2) {
            return FIRING;
        }
        if (i == 3) {
            return SNOOZED;
        }
        if (i == 4) {
            return DISABLED;
        }
        if (i != 5) {
            return null;
        }
        return MISSED;
    }

    /* renamed from: b */
    public static C62959cf m86181b() {
        return C51392g.f133838a;
    }

    public final int getNumber() {
        return this.f133932g;
    }

    public final String toString() {
        return Integer.toString(this.f133932g);
    }
}
