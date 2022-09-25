package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.kr */
/* compiled from: PG */
public enum C52247kr implements C62957cd {
    UNSUPPORTED(0),
    NGA_ESCAPE_HATCH(1);
    

    /* renamed from: c */
    public final int f137120c;

    private C52247kr(int i) {
        this.f137120c = i;
    }

    /* renamed from: a */
    public static C52247kr m86551a(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i != 1) {
            return null;
        }
        return NGA_ESCAPE_HATCH;
    }

    /* renamed from: b */
    public static C62959cf m86552b() {
        return C52246kq.f137116a;
    }

    public final int getNumber() {
        return this.f137120c;
    }

    public final String toString() {
        return Integer.toString(this.f137120c);
    }
}
