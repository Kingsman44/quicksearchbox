package com.google.android.apps.gsa.shared.p6984ai.p6985a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ai.a.c */
/* compiled from: PG */
public enum C89164c implements C62957cd {
    UNKNOWN_REASON(0),
    NO_ENROLLED_FINGERPRINT(1),
    KEYGUARD_NOT_SECURE(2),
    NEW_FINGERPRINT_ADDED(3),
    EXCEEDED_MAX_ATTEMPTS(4);
    

    /* renamed from: f */
    public final int f241736f;

    private C89164c(int i) {
        this.f241736f = i;
    }

    /* renamed from: a */
    public static C89164c m145043a(int i) {
        if (i == 0) {
            return UNKNOWN_REASON;
        }
        if (i == 1) {
            return NO_ENROLLED_FINGERPRINT;
        }
        if (i == 2) {
            return KEYGUARD_NOT_SECURE;
        }
        if (i == 3) {
            return NEW_FINGERPRINT_ADDED;
        }
        if (i != 4) {
            return null;
        }
        return EXCEEDED_MAX_ATTEMPTS;
    }

    /* renamed from: b */
    public static C62959cf m145044b() {
        return C89163b.f241729a;
    }

    public final int getNumber() {
        return this.f241736f;
    }

    public final String toString() {
        return Integer.toString(this.f241736f);
    }
}
