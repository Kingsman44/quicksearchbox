package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.eg */
/* compiled from: PG */
public enum C87806eg implements C62957cd {
    UNKNOWN(0),
    VERIFY(1),
    CHECK_AVAILABILITY(2);
    

    /* renamed from: d */
    public final int f237601d;

    private C87806eg(int i) {
        this.f237601d = i;
    }

    /* renamed from: a */
    public static C87806eg m142767a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VERIFY;
        }
        if (i != 2) {
            return null;
        }
        return CHECK_AVAILABILITY;
    }

    /* renamed from: b */
    public static C62959cf m142768b() {
        return C87805ef.f237596a;
    }

    public final int getNumber() {
        return this.f237601d;
    }

    public final String toString() {
        return Integer.toString(this.f237601d);
    }
}
