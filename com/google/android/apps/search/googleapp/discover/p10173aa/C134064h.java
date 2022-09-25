package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.h */
/* compiled from: PG */
public enum C134064h implements C62957cd {
    UNKNOWN(0),
    SCHEDULED(1),
    WATCHDOG(2),
    APP_CLOSE(3),
    EAGER(4);
    

    /* renamed from: f */
    public final int f365196f;

    private C134064h(int i) {
        this.f365196f = i;
    }

    /* renamed from: a */
    public static C134064h m217476a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SCHEDULED;
        }
        if (i == 2) {
            return WATCHDOG;
        }
        if (i == 3) {
            return APP_CLOSE;
        }
        if (i != 4) {
            return null;
        }
        return EAGER;
    }

    /* renamed from: b */
    public static C62959cf m217477b() {
        return C134063g.f365189a;
    }

    public final int getNumber() {
        return this.f365196f;
    }

    public final String toString() {
        return Integer.toString(this.f365196f);
    }
}
