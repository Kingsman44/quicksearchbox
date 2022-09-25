package com.google.android.apps.search.googleapp.tabs.p10523a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.tabs.a.c */
/* compiled from: PG */
public enum C139711c implements C62957cd {
    UNKNOWN(0),
    BOTTOM_NAVIGATION(1),
    GOOGLE_APP_BROWSER(2);
    

    /* renamed from: d */
    public final int f379747d;

    private C139711c(int i) {
        this.f379747d = i;
    }

    /* renamed from: a */
    public static C139711c m227153a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return BOTTOM_NAVIGATION;
        }
        if (i != 2) {
            return null;
        }
        return GOOGLE_APP_BROWSER;
    }

    /* renamed from: b */
    public static C62959cf m227154b() {
        return C139710b.f379742a;
    }

    public final int getNumber() {
        return this.f379747d;
    }

    public final String toString() {
        return Integer.toString(this.f379747d);
    }
}
