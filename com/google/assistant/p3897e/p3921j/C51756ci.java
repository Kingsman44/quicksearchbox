package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.ci */
/* compiled from: PG */
public enum C51756ci implements C62957cd {
    PERSONAL_DATA_OUTPUT_UNKNOWN(0),
    ALL_PERSONAL_DATA_WITH_PROACTIVE(3),
    ALL_PERSONAL_DATA(1),
    NO_PERSONAL_DATA(2);
    

    /* renamed from: e */
    public final int f135790e;

    private C51756ci(int i) {
        this.f135790e = i;
    }

    /* renamed from: a */
    public static C51756ci m86372a(int i) {
        if (i == 0) {
            return PERSONAL_DATA_OUTPUT_UNKNOWN;
        }
        if (i == 1) {
            return ALL_PERSONAL_DATA;
        }
        if (i == 2) {
            return NO_PERSONAL_DATA;
        }
        if (i != 3) {
            return null;
        }
        return ALL_PERSONAL_DATA_WITH_PROACTIVE;
    }

    /* renamed from: b */
    public static C62959cf m86373b() {
        return C51755ch.f135784a;
    }

    public final int getNumber() {
        return this.f135790e;
    }

    public final String toString() {
        return Integer.toString(this.f135790e);
    }
}
