package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.el */
/* compiled from: PG */
public enum C87811el implements C62957cd {
    UNKNOWN(0),
    NO_ENROLLED_FINGERPRINT(1),
    KEYGUARD_NOT_SECURE(2),
    NEW_FINGERPRINT_ADDED(3);
    

    /* renamed from: e */
    public final int f237613e;

    private C87811el(int i) {
        this.f237613e = i;
    }

    /* renamed from: a */
    public static C87811el m142769a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_ENROLLED_FINGERPRINT;
        }
        if (i == 2) {
            return KEYGUARD_NOT_SECURE;
        }
        if (i != 3) {
            return null;
        }
        return NEW_FINGERPRINT_ADDED;
    }

    /* renamed from: b */
    public static C62959cf m142770b() {
        return C87810ek.f237607a;
    }

    public final int getNumber() {
        return this.f237613e;
    }

    public final String toString() {
        return Integer.toString(this.f237613e);
    }
}
