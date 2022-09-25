package com.google.assistant.p3860as;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.as.z */
/* compiled from: PG */
public enum C49812z implements C62957cd {
    UNKNOWN(0),
    TEST(1),
    AT_HOME(10),
    SEMANTIC_MORNING(11),
    SEMANTIC_EVENING(12),
    DRIVING(13);
    

    /* renamed from: g */
    private final int f128668g;

    private C49812z(int i) {
        this.f128668g = i;
    }

    /* renamed from: a */
    public static C49812z m85716a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TEST;
        }
        switch (i) {
            case 10:
                return AT_HOME;
            case 11:
                return SEMANTIC_MORNING;
            case 12:
                return SEMANTIC_EVENING;
            case 13:
                return DRIVING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85717b() {
        return C49811y.f128660a;
    }

    public final int getNumber() {
        return this.f128668g;
    }

    public final String toString() {
        return Integer.toString(this.f128668g);
    }
}
