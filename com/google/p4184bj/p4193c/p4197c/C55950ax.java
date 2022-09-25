package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.c.ax */
/* compiled from: PG */
public enum C55950ax implements C62957cd {
    UNKNOWN(0),
    SHOULD_NOT_PROMPT(2),
    ALREADY_ACCEPTED(3);
    

    /* renamed from: d */
    private final int f148931d;

    private C55950ax(int i) {
        this.f148931d = i;
    }

    /* renamed from: a */
    public static C55950ax m87866a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 2) {
            return SHOULD_NOT_PROMPT;
        }
        if (i != 3) {
            return null;
        }
        return ALREADY_ACCEPTED;
    }

    /* renamed from: b */
    public static C62959cf m87867b() {
        return C55949aw.f148926a;
    }

    public final int getNumber() {
        return this.f148931d;
    }

    public final String toString() {
        return Integer.toString(this.f148931d);
    }
}
