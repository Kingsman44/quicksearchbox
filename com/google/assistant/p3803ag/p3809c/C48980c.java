package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.c */
/* compiled from: PG */
public enum C48980c implements C62957cd {
    TYPE_UNKNOWN(0),
    TYPE_OPA_PROACTIVE(1),
    TYPE_OPA_HANDOFF(2),
    TYPE_OPA_MISC(3),
    TYPE_OPA_RECOMMENDATIONS(4),
    TYPE_OPA_PRODUCT_UPDATES(5),
    TYPE_OPA_THIRD_PARTY(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f126714i;

    private C48980c(int i) {
        this.f126714i = i;
    }

    /* renamed from: a */
    public static C48980c m85331a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return TYPE_OPA_PROACTIVE;
            case 2:
                return TYPE_OPA_HANDOFF;
            case 3:
                return TYPE_OPA_MISC;
            case 4:
                return TYPE_OPA_RECOMMENDATIONS;
            case 5:
                return TYPE_OPA_PRODUCT_UPDATES;
            case 6:
                return TYPE_OPA_THIRD_PARTY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85332b() {
        return C48953b.f126661a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f126714i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
