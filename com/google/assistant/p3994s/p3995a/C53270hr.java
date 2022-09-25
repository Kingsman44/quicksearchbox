package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.hr */
/* compiled from: PG */
public enum C53270hr implements C62957cd {
    UNKNOWN(0),
    FOREGROUND(1),
    PREFETCH(2),
    REFRESH(3),
    BACKGROUND_REFRESH(4),
    PUSH_TO_REFRESH(5);
    

    /* renamed from: g */
    public final int f139649g;

    private C53270hr(int i) {
        this.f139649g = i;
    }

    /* renamed from: a */
    public static C53270hr m86801a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return PREFETCH;
        }
        if (i == 3) {
            return REFRESH;
        }
        if (i == 4) {
            return BACKGROUND_REFRESH;
        }
        if (i != 5) {
            return null;
        }
        return PUSH_TO_REFRESH;
    }

    /* renamed from: b */
    public static C62959cf m86802b() {
        return C53269hq.f139641a;
    }

    public final int getNumber() {
        return this.f139649g;
    }

    public final String toString() {
        return Integer.toString(this.f139649g);
    }
}
