package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.fe */
/* compiled from: PG */
public enum C51952fe implements C62957cd {
    RENDER_NEW_NATIVE_FORM_DEFAULT(0),
    FORM_FIELD_STATUS_UPDATE(1);
    

    /* renamed from: c */
    public final int f136314c;

    private C51952fe(int i) {
        this.f136314c = i;
    }

    /* renamed from: a */
    public static C51952fe m86449a(int i) {
        if (i == 0) {
            return RENDER_NEW_NATIVE_FORM_DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return FORM_FIELD_STATUS_UPDATE;
    }

    /* renamed from: b */
    public static C62959cf m86450b() {
        return C51951fd.f136310a;
    }

    public final int getNumber() {
        return this.f136314c;
    }

    public final String toString() {
        return Integer.toString(this.f136314c);
    }
}
