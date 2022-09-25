package com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.e.a.d */
/* compiled from: PG */
public enum C121053d implements C62957cd {
    STANDBY_UNSPECIFIED(1),
    DISABLED(2),
    ENABLED(3);
    

    /* renamed from: d */
    public final int f336451d;

    private C121053d(int i) {
        this.f336451d = i;
    }

    /* renamed from: a */
    public static C121053d m200347a(int i) {
        if (i == 1) {
            return STANDBY_UNSPECIFIED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m200348b() {
        return C121052c.f336446a;
    }

    public final int getNumber() {
        return this.f336451d;
    }

    public final String toString() {
        return Integer.toString(this.f336451d);
    }
}
