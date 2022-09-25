package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.y.a.bf */
/* compiled from: PG */
public enum C53573bf implements C62957cd {
    CONTEXT_KEY_UNKNOWN(0),
    CONTEXT_KEY_FOREGROUND_APPLICATION(1),
    CONTEXT_KEY_HANDS_FREE(2);
    

    /* renamed from: d */
    public final int f140612d;

    private C53573bf(int i) {
        this.f140612d = i;
    }

    /* renamed from: a */
    public static C53573bf m86872a(int i) {
        if (i == 0) {
            return CONTEXT_KEY_UNKNOWN;
        }
        if (i == 1) {
            return CONTEXT_KEY_FOREGROUND_APPLICATION;
        }
        if (i != 2) {
            return null;
        }
        return CONTEXT_KEY_HANDS_FREE;
    }

    /* renamed from: b */
    public static C62959cf m86873b() {
        return C53572be.f140607a;
    }

    public final int getNumber() {
        return this.f140612d;
    }

    public final String toString() {
        return Integer.toString(this.f140612d);
    }
}
