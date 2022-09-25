package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.fk */
/* compiled from: PG */
public enum C51958fk implements C62957cd {
    UNKNOWN_TYPE(0),
    WUWA(1);
    

    /* renamed from: c */
    private final int f136334c;

    private C51958fk(int i) {
        this.f136334c = i;
    }

    /* renamed from: a */
    public static C51958fk m86453a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return WUWA;
    }

    /* renamed from: b */
    public static C62959cf m86454b() {
        return C51957fj.f136330a;
    }

    public final int getNumber() {
        return this.f136334c;
    }

    public final String toString() {
        return Integer.toString(this.f136334c);
    }
}
