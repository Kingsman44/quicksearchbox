package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.al.c.c.b.l */
/* compiled from: PG */
public enum C8502l implements C62957cd {
    STATE_DUMP(1),
    STACK_TRACE(2);
    

    /* renamed from: c */
    private final int f29502c;

    private C8502l(int i) {
        this.f29502c = i;
    }

    /* renamed from: a */
    public static C8502l m23271a(int i) {
        if (i == 1) {
            return STATE_DUMP;
        }
        if (i != 2) {
            return null;
        }
        return STACK_TRACE;
    }

    /* renamed from: b */
    public static C62959cf m23272b() {
        return C8501k.f29498a;
    }

    public final int getNumber() {
        return this.f29502c;
    }

    public final String toString() {
        return Integer.toString(this.f29502c);
    }
}
