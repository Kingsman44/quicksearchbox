package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.a.g */
/* compiled from: PG */
public enum C135914g implements C62957cd {
    READABILITY_STATE_UNKNOWN(0),
    READABILITY_STATE_READABLE(1),
    READABILITY_STATE_NON_READABLE(2),
    READABILITY_STATE_PENDING(3),
    READABILITY_STATE_CHECK_DISABLED(4);
    

    /* renamed from: f */
    public final int f370167f;

    private C135914g(int i) {
        this.f370167f = i;
    }

    /* renamed from: a */
    public static C135914g m220526a(int i) {
        if (i == 0) {
            return READABILITY_STATE_UNKNOWN;
        }
        if (i == 1) {
            return READABILITY_STATE_READABLE;
        }
        if (i == 2) {
            return READABILITY_STATE_NON_READABLE;
        }
        if (i == 3) {
            return READABILITY_STATE_PENDING;
        }
        if (i != 4) {
            return null;
        }
        return READABILITY_STATE_CHECK_DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m220527b() {
        return C135913f.f370160a;
    }

    public final int getNumber() {
        return this.f370167f;
    }

    public final String toString() {
        return Integer.toString(this.f370167f);
    }
}
