package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.e */
/* compiled from: PG */
public enum C138078e implements C62957cd {
    NONE(0),
    FIRST_RUN(1),
    AADC_SETTINGS_CHANGED(2);
    

    /* renamed from: d */
    public final int f375683d;

    private C138078e(int i) {
        this.f375683d = i;
    }

    /* renamed from: a */
    public static C138078e m224410a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return FIRST_RUN;
        }
        if (i != 2) {
            return null;
        }
        return AADC_SETTINGS_CHANGED;
    }

    /* renamed from: b */
    public static C62959cf m224411b() {
        return C138073d.f375668a;
    }

    public final int getNumber() {
        return this.f375683d;
    }

    public final String toString() {
        return Integer.toString(this.f375683d);
    }
}
