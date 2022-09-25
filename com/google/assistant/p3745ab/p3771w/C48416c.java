package com.google.assistant.p3745ab.p3771w;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ab.w.c */
/* compiled from: PG */
public enum C48416c implements C62957cd {
    UNKNOWN(0),
    ENABLED_IN_PAUSED_MODE(1),
    ENABLED(2),
    DISABLED(3);
    

    /* renamed from: e */
    public final int f125120e;

    private C48416c(int i) {
        this.f125120e = i;
    }

    /* renamed from: a */
    public static C48416c m85223a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLED_IN_PAUSED_MODE;
        }
        if (i == 2) {
            return ENABLED;
        }
        if (i != 3) {
            return null;
        }
        return DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m85224b() {
        return C48415b.f125114a;
    }

    public final int getNumber() {
        return this.f125120e;
    }

    public final String toString() {
        return Integer.toString(this.f125120e);
    }
}
