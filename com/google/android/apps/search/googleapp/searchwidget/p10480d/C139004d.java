package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.d */
/* compiled from: PG */
public enum C139004d implements C62957cd {
    UNKNOWN(0),
    URI_BASED(1),
    CLASS_BASED(2),
    ACTION_BASED(3);
    

    /* renamed from: e */
    private final int f378036e;

    private C139004d(int i) {
        this.f378036e = i;
    }

    /* renamed from: a */
    public static C139004d m225805a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return URI_BASED;
        }
        if (i == 2) {
            return CLASS_BASED;
        }
        if (i != 3) {
            return null;
        }
        return ACTION_BASED;
    }

    /* renamed from: b */
    public static C62959cf m225806b() {
        return C139003c.f378030a;
    }

    public final int getNumber() {
        return this.f378036e;
    }

    public final String toString() {
        return Integer.toString(this.f378036e);
    }
}
