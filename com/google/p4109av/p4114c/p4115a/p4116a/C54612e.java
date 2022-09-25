package com.google.p4109av.p4114c.p4115a.p4116a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.av.c.a.a.e */
/* compiled from: PG */
public enum C54612e implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    CANCELED_BY_USER(2),
    RECOVERABLE_ERROR(3),
    UNRECOVERABLE_ERROR(4);
    

    /* renamed from: f */
    public final int f143381f;

    private C54612e(int i) {
        this.f143381f = i;
    }

    /* renamed from: a */
    public static C54612e m87500a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return CANCELED_BY_USER;
        }
        if (i == 3) {
            return RECOVERABLE_ERROR;
        }
        if (i != 4) {
            return null;
        }
        return UNRECOVERABLE_ERROR;
    }

    /* renamed from: b */
    public static C62959cf m87501b() {
        return C54611d.f143374a;
    }

    public final int getNumber() {
        return this.f143381f;
    }

    public final String toString() {
        return Integer.toString(this.f143381f);
    }
}
