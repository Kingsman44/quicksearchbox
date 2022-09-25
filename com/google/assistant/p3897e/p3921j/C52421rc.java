package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.rc */
/* compiled from: PG */
public enum C52421rc implements C62957cd {
    UNKNOWN(0),
    NOT_GRANTED(1),
    GRANTED(2);
    

    /* renamed from: d */
    public static final C62958ce f137545d = null;

    /* renamed from: e */
    public final int f137547e;

    static {
        f137545d = new C52419ra();
    }

    private C52421rc(int i) {
        this.f137547e = i;
    }

    /* renamed from: a */
    public static C52421rc m86622a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_GRANTED;
        }
        if (i != 2) {
            return null;
        }
        return GRANTED;
    }

    /* renamed from: b */
    public static C62959cf m86623b() {
        return C52420rb.f137541a;
    }

    public final int getNumber() {
        return this.f137547e;
    }

    public final String toString() {
        return Integer.toString(this.f137547e);
    }
}
