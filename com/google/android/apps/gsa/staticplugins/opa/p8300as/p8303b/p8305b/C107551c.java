package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.b.c */
/* compiled from: PG */
public enum C107551c implements C62957cd {
    UNKNOWN(0),
    NOTIFICATION(1),
    ASSISTANT_ASYNC_EVENT(2);
    

    /* renamed from: d */
    public final int f299203d;

    private C107551c(int i) {
        this.f299203d = i;
    }

    /* renamed from: a */
    public static C107551c m178396a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOTIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return ASSISTANT_ASYNC_EVENT;
    }

    /* renamed from: b */
    public static C62959cf m178397b() {
        return C107550b.f299198a;
    }

    public final int getNumber() {
        return this.f299203d;
    }

    public final String toString() {
        return Integer.toString(this.f299203d);
    }
}
