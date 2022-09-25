package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ep */
/* compiled from: PG */
public enum C82900ep implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    CANCEL(3);
    

    /* renamed from: e */
    public final int f226138e;

    private C82900ep(int i) {
        this.f226138e = i;
    }

    /* renamed from: a */
    public static C82900ep m132421a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return FAILURE;
        }
        if (i != 3) {
            return null;
        }
        return CANCEL;
    }

    /* renamed from: b */
    public static C62959cf m132422b() {
        return C82899eo.f226132a;
    }

    public final int getNumber() {
        return this.f226138e;
    }

    public final String toString() {
        return Integer.toString(this.f226138e);
    }
}
