package com.google.android.apps.gsa.shared.p6990an;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.shared.an.aa */
/* compiled from: PG */
public enum C89208aa implements C62957cd {
    NONE(0),
    SUGGEST(1),
    OPA(2),
    ALL_APPS(3),
    TAPAS(4);
    

    /* renamed from: f */
    public final int f241837f;

    private C89208aa(int i) {
        this.f241837f = i;
    }

    /* renamed from: a */
    public static C89208aa m145112a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return SUGGEST;
        }
        if (i == 2) {
            return OPA;
        }
        if (i == 3) {
            return ALL_APPS;
        }
        if (i != 4) {
            return null;
        }
        return TAPAS;
    }

    public final int getNumber() {
        return this.f241837f;
    }

    public final String toString() {
        return Integer.toString(this.f241837f);
    }
}
