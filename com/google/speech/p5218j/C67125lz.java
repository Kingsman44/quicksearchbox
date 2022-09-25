package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.lz */
/* compiled from: PG */
public enum C67125lz implements C62957cd {
    DEFAULT_TEXT_DEPENDENT(0),
    TEXT_INDEPENDENT(1);
    

    /* renamed from: c */
    public final int f182473c;

    private C67125lz(int i) {
        this.f182473c = i;
    }

    /* renamed from: a */
    public static C67125lz m97424a(int i) {
        if (i == 0) {
            return DEFAULT_TEXT_DEPENDENT;
        }
        if (i != 1) {
            return null;
        }
        return TEXT_INDEPENDENT;
    }

    /* renamed from: b */
    public static C62959cf m97425b() {
        return C67124ly.f182469a;
    }

    public final int getNumber() {
        return this.f182473c;
    }

    public final String toString() {
        return Integer.toString(this.f182473c);
    }
}
