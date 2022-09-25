package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ai.b.ex */
/* compiled from: PG */
public enum C7651ex implements C62957cd {
    COMMUTE(1),
    OTHER(2);
    

    /* renamed from: c */
    public final int f26563c;

    private C7651ex(int i) {
        this.f26563c = i;
    }

    /* renamed from: a */
    public static C7651ex m22796a(int i) {
        if (i == 1) {
            return COMMUTE;
        }
        if (i != 2) {
            return null;
        }
        return OTHER;
    }

    public final int getNumber() {
        return this.f26563c;
    }

    public final String toString() {
        return Integer.toString(this.f26563c);
    }
}
