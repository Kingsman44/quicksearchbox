package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.c */
/* compiled from: PG */
public enum C109926c implements C62957cd {
    UNKNOWN(0),
    CUSTOM_URL(1),
    TURN_OFF(2),
    SWIPE_DEMO(3),
    SUGGEST(4),
    NGA_PIE_SWIPE_DEMO(5),
    NGA_PIE_SUGGEST(6);
    

    /* renamed from: h */
    public final int f306289h;

    private C109926c(int i) {
        this.f306289h = i;
    }

    /* renamed from: a */
    public static C109926c m183097a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CUSTOM_URL;
            case 2:
                return TURN_OFF;
            case 3:
                return SWIPE_DEMO;
            case 4:
                return SUGGEST;
            case 5:
                return NGA_PIE_SWIPE_DEMO;
            case 6:
                return NGA_PIE_SUGGEST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m183098b() {
        return C109925b.f306280a;
    }

    public final int getNumber() {
        return this.f306289h;
    }

    public final String toString() {
        return Integer.toString(this.f306289h);
    }
}
