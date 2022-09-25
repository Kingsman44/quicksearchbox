package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gf */
/* compiled from: PG */
public enum C82944gf implements C62957cd {
    USER_TYPE_UNKNOWN(0),
    OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER(1),
    NGA_SEARCH_SERVICE_CLIENT_USER(2);
    

    /* renamed from: d */
    public final int f226303d;

    private C82944gf(int i) {
        this.f226303d = i;
    }

    /* renamed from: a */
    public static C82944gf m132435a(int i) {
        if (i == 0) {
            return USER_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER;
        }
        if (i != 2) {
            return null;
        }
        return NGA_SEARCH_SERVICE_CLIENT_USER;
    }

    /* renamed from: b */
    public static C62959cf m132436b() {
        return C82943ge.f226298a;
    }

    public final int getNumber() {
        return this.f226303d;
    }

    public final String toString() {
        return Integer.toString(this.f226303d);
    }
}
