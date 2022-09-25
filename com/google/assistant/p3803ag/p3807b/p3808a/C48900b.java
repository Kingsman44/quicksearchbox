package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.b.a.b */
/* compiled from: PG */
public enum C48900b implements C62957cd {
    UNSPECIFIED(0),
    AMBIENT_ASSISTANT(3),
    PROACTIVE_API_CLIENT_ACTION(1),
    PROACTIVE_CLIENT_PLATFORM(2),
    PROACTIVE_CLIENT_PLATFORM_V2(4),
    TEST(1000);
    

    /* renamed from: g */
    public final int f126548g;

    private C48900b(int i) {
        this.f126548g = i;
    }

    /* renamed from: a */
    public static C48900b m85301a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return PROACTIVE_API_CLIENT_ACTION;
        }
        if (i == 2) {
            return PROACTIVE_CLIENT_PLATFORM;
        }
        if (i == 3) {
            return AMBIENT_ASSISTANT;
        }
        if (i == 4) {
            return PROACTIVE_CLIENT_PLATFORM_V2;
        }
        if (i != 1000) {
            return null;
        }
        return TEST;
    }

    /* renamed from: b */
    public static C62959cf m85302b() {
        return C48885a.f126505a;
    }

    public final int getNumber() {
        return this.f126548g;
    }

    public final String toString() {
        return Integer.toString(this.f126548g);
    }
}
