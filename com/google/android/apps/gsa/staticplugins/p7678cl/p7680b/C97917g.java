package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.g */
/* compiled from: PG */
public enum C97917g implements C62957cd {
    DOWNLOAD(0),
    CANCEL(1),
    REMOVE(2),
    RETRY(3),
    SET_INVALID(4);
    

    /* renamed from: f */
    public final int f273411f;

    private C97917g(int i) {
        this.f273411f = i;
    }

    /* renamed from: a */
    public static C97917g m162192a(int i) {
        if (i == 0) {
            return DOWNLOAD;
        }
        if (i == 1) {
            return CANCEL;
        }
        if (i == 2) {
            return REMOVE;
        }
        if (i == 3) {
            return RETRY;
        }
        if (i != 4) {
            return null;
        }
        return SET_INVALID;
    }

    /* renamed from: b */
    public static C62959cf m162193b() {
        return C97916f.f273404a;
    }

    public final int getNumber() {
        return this.f273411f;
    }

    public final String toString() {
        return Integer.toString(this.f273411f);
    }
}
