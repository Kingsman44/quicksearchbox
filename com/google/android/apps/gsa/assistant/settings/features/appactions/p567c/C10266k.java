package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.k */
/* compiled from: PG */
public enum C10266k implements C62957cd {
    UNKNOWN(0),
    MAIN_PAGE(1),
    APP_SPECIFIC_PAGE(2);
    

    /* renamed from: d */
    public final int f34801d;

    private C10266k(int i) {
        this.f34801d = i;
    }

    /* renamed from: a */
    public static C10266k m25161a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MAIN_PAGE;
        }
        if (i != 2) {
            return null;
        }
        return APP_SPECIFIC_PAGE;
    }

    /* renamed from: b */
    public static C62959cf m25162b() {
        return C10265j.f34796a;
    }

    public final int getNumber() {
        return this.f34801d;
    }

    public final String toString() {
        return Integer.toString(this.f34801d);
    }
}
