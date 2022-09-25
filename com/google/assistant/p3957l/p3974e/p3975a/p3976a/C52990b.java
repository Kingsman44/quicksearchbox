package com.google.assistant.p3957l.p3974e.p3975a.p3976a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.l.e.a.a.b */
/* compiled from: PG */
public enum C52990b implements C62957cd {
    NOTICE_UNKNOWN(0),
    NOTICE_LINKING_INFO(1),
    NOTICE_CAPABILITY_CONSENT(2);
    

    /* renamed from: d */
    private final int f138910d;

    private C52990b(int i) {
        this.f138910d = i;
    }

    /* renamed from: a */
    public static C52990b m86765a(int i) {
        if (i == 0) {
            return NOTICE_UNKNOWN;
        }
        if (i == 1) {
            return NOTICE_LINKING_INFO;
        }
        if (i != 2) {
            return null;
        }
        return NOTICE_CAPABILITY_CONSENT;
    }

    /* renamed from: b */
    public static C62959cf m86766b() {
        return C52989a.f138905a;
    }

    public final int getNumber() {
        return this.f138910d;
    }

    public final String toString() {
        return Integer.toString(this.f138910d);
    }
}
