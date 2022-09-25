package com.google.android.apps.gsa.unifiedime;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.unifiedime.c */
/* compiled from: PG */
public enum C118585c implements C62957cd {
    RECOGNITION(0),
    POST_RECOGNITION(1),
    TOP_CONTACTS(2);
    

    /* renamed from: d */
    public final int f330852d;

    private C118585c(int i) {
        this.f330852d = i;
    }

    /* renamed from: a */
    public static C118585c m196888a(int i) {
        if (i == 0) {
            return RECOGNITION;
        }
        if (i == 1) {
            return POST_RECOGNITION;
        }
        if (i != 2) {
            return null;
        }
        return TOP_CONTACTS;
    }

    /* renamed from: b */
    public static C62959cf m196889b() {
        return C118584b.f330847a;
    }

    public final int getNumber() {
        return this.f330852d;
    }

    public final String toString() {
        return Integer.toString(this.f330852d);
    }
}
