package com.google.android.libraries.mdi;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.mdi.e */
/* compiled from: PG */
public enum C29689e implements C62957cd {
    UNSPECIFIED(0),
    DOWNLOADED(1),
    PENDING(2),
    PENDING_CUSTOM_VALIDATION(3);
    

    /* renamed from: e */
    public final int f80407e;

    private C29689e(int i) {
        this.f80407e = i;
    }

    /* renamed from: a */
    public static C29689e m54781a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return DOWNLOADED;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i != 3) {
            return null;
        }
        return PENDING_CUSTOM_VALIDATION;
    }

    /* renamed from: b */
    public static C62959cf m54782b() {
        return C28611d.f77835a;
    }

    public final int getNumber() {
        return this.f80407e;
    }

    public final String toString() {
        return Integer.toString(this.f80407e);
    }
}
