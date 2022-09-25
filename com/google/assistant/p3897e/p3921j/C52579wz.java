package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.wz */
/* compiled from: PG */
public enum C52579wz implements C62957cd {
    UNKNOWN_READ_STATE(0),
    READ(1),
    UNREAD(2),
    INCOMPLETE(3),
    ARCHIVED(4);
    

    /* renamed from: f */
    public final int f138049f;

    private C52579wz(int i) {
        this.f138049f = i;
    }

    /* renamed from: a */
    public static C52579wz m86656a(int i) {
        if (i == 0) {
            return UNKNOWN_READ_STATE;
        }
        if (i == 1) {
            return READ;
        }
        if (i == 2) {
            return UNREAD;
        }
        if (i == 3) {
            return INCOMPLETE;
        }
        if (i != 4) {
            return null;
        }
        return ARCHIVED;
    }

    /* renamed from: b */
    public static C62959cf m86657b() {
        return C52578wy.f138042a;
    }

    public final int getNumber() {
        return this.f138049f;
    }

    public final String toString() {
        return Integer.toString(this.f138049f);
    }
}
