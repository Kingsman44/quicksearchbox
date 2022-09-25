package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bb */
/* compiled from: PG */
public enum C139077bb implements C62957cd {
    BAR_RADIUS_UNKNOWN(0),
    BAR_RADIUS_2(1),
    BAR_RADIUS_8(2),
    BAR_RADIUS_24(3);
    

    /* renamed from: e */
    public final int f378239e;

    private C139077bb(int i) {
        this.f378239e = i;
    }

    /* renamed from: a */
    public static C139077bb m225892a(int i) {
        if (i == 0) {
            return BAR_RADIUS_UNKNOWN;
        }
        if (i == 1) {
            return BAR_RADIUS_2;
        }
        if (i == 2) {
            return BAR_RADIUS_8;
        }
        if (i != 3) {
            return null;
        }
        return BAR_RADIUS_24;
    }

    /* renamed from: b */
    public static C62959cf m225893b() {
        return C139076ba.f378233a;
    }

    public final int getNumber() {
        return this.f378239e;
    }

    public final String toString() {
        return Integer.toString(this.f378239e);
    }
}
