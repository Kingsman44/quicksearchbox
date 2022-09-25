package com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.k.a.c */
/* compiled from: PG */
public enum C121177c implements C62957cd {
    UNSPECIFIED(0),
    VERBOSE(1),
    ON(2),
    HANDS_FREE_ONLY(3);
    

    /* renamed from: e */
    public final int f336681e;

    private C121177c(int i) {
        this.f336681e = i;
    }

    /* renamed from: a */
    public static C121177c m200468a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return VERBOSE;
        }
        if (i == 2) {
            return ON;
        }
        if (i != 3) {
            return null;
        }
        return HANDS_FREE_ONLY;
    }

    /* renamed from: b */
    public static C62959cf m200469b() {
        return C121176b.f336675a;
    }

    public final int getNumber() {
        return this.f336681e;
    }

    public final String toString() {
        return Integer.toString(this.f336681e);
    }
}
