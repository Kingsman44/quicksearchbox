package com.google.android.apps.p471d.p482b.p483a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.d.b.a.j */
/* compiled from: PG */
public enum C9049j implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    ERROR(2);
    

    /* renamed from: d */
    private final int f31263d;

    private C9049j(int i) {
        this.f31263d = i;
    }

    /* renamed from: a */
    public static C9049j m23587a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ERROR;
    }

    /* renamed from: b */
    public static C62959cf m23588b() {
        return C9048i.f31258a;
    }

    public final int getNumber() {
        return this.f31263d;
    }

    public final String toString() {
        return Integer.toString(this.f31263d);
    }
}
