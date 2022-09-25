package com.google.nlp.p4730a.p4731a.p4732a.p4733a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.nlp.a.a.a.a.d */
/* compiled from: PG */
public enum C62733d implements C62957cd {
    DEFAULT(0),
    CHRONOLOGICAL(1);
    

    /* renamed from: c */
    public final int f169439c;

    private C62733d(int i) {
        this.f169439c = i;
    }

    /* renamed from: a */
    public static C62733d m94943a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return CHRONOLOGICAL;
    }

    /* renamed from: b */
    public static C62959cf m94944b() {
        return C62732c.f169435a;
    }

    public final int getNumber() {
        return this.f169439c;
    }

    public final String toString() {
        return Integer.toString(this.f169439c);
    }
}
