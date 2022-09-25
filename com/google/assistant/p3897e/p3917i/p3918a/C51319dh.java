package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dh */
/* compiled from: PG */
public enum C51319dh implements C62957cd {
    DEFAULT(0),
    SHOW_RESPONSE_TO_TRUSTED_USER_ALWAYS(1);
    

    /* renamed from: c */
    public final int f133616c;

    private C51319dh(int i) {
        this.f133616c = i;
    }

    /* renamed from: a */
    public static C51319dh m86127a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return SHOW_RESPONSE_TO_TRUSTED_USER_ALWAYS;
    }

    /* renamed from: b */
    public static C62959cf m86128b() {
        return C51318dg.f133612a;
    }

    public final int getNumber() {
        return this.f133616c;
    }

    public final String toString() {
        return Integer.toString(this.f133616c);
    }
}
