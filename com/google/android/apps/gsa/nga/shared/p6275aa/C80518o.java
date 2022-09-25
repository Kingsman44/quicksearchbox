package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.o */
/* compiled from: PG */
public enum C80518o implements C62957cd {
    PARAM_UNKNOWN(0),
    MEDIA(1);
    

    /* renamed from: c */
    public final int f221047c;

    private C80518o(int i) {
        this.f221047c = i;
    }

    /* renamed from: a */
    public static C80518o m128189a(int i) {
        if (i == 0) {
            return PARAM_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return MEDIA;
    }

    /* renamed from: b */
    public static C62959cf m128190b() {
        return C80511n.f221013a;
    }

    public final int getNumber() {
        return this.f221047c;
    }

    public final String toString() {
        return Integer.toString(this.f221047c);
    }
}
