package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bd */
/* compiled from: PG */
public enum C139079bd implements C62957cd {
    THEME_UNKNOWN(0),
    STANDARD_COLOR(1),
    MONOCHROME_LIGHT(2),
    MONOCHROME_DARK(3),
    CUSTOM_COLOR(4);
    

    /* renamed from: f */
    public final int f378247f;

    private C139079bd(int i) {
        this.f378247f = i;
    }

    /* renamed from: a */
    public static C139079bd m225894a(int i) {
        if (i == 0) {
            return THEME_UNKNOWN;
        }
        if (i == 1) {
            return STANDARD_COLOR;
        }
        if (i == 2) {
            return MONOCHROME_LIGHT;
        }
        if (i == 3) {
            return MONOCHROME_DARK;
        }
        if (i != 4) {
            return null;
        }
        return CUSTOM_COLOR;
    }

    /* renamed from: b */
    public static C62959cf m225895b() {
        return C139078bc.f378240a;
    }

    public final int getNumber() {
        return this.f378247f;
    }

    public final String toString() {
        return Integer.toString(this.f378247f);
    }
}
