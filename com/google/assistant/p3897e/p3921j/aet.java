package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.aet */
/* compiled from: PG */
public enum aet implements C62957cd {
    DEFAULT(0),
    ALTERNATIVE(1);
    

    /* renamed from: c */
    public final int f134958c;

    private aet(int i) {
        this.f134958c = i;
    }

    /* renamed from: a */
    public static aet m86300a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return ALTERNATIVE;
    }

    /* renamed from: b */
    public static C62959cf m86301b() {
        return aes.f134954a;
    }

    public final int getNumber() {
        return this.f134958c;
    }

    public final String toString() {
        return Integer.toString(this.f134958c);
    }
}
