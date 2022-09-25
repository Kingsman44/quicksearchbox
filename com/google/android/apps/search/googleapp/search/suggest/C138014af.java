package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.af */
/* compiled from: PG */
public enum C138014af implements C62957cd {
    UNKNOWN(0),
    CORE(1),
    HEADER(2),
    APP_STRIP(3),
    UNIVERSAL(4),
    DIVIDER(5),
    DISCOVER_PROMO(6),
    MANAGE_ACTIVITY(7),
    GEMINI_LIGHT(8),
    GEMINI_APP_STRIP(9),
    SPYW_IN_CONTEXT_CONTROL(10),
    SPYW_IN_CONTEXT_CONTROL_HEADER(11),
    XUIKIT(12),
    WEATHER(13);
    

    /* renamed from: o */
    public final int f375478o;

    private C138014af(int i) {
        this.f375478o = i;
    }

    /* renamed from: a */
    public static C138014af m224326a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CORE;
            case 2:
                return HEADER;
            case 3:
                return APP_STRIP;
            case 4:
                return UNIVERSAL;
            case 5:
                return DIVIDER;
            case 6:
                return DISCOVER_PROMO;
            case 7:
                return MANAGE_ACTIVITY;
            case 8:
                return GEMINI_LIGHT;
            case 9:
                return GEMINI_APP_STRIP;
            case 10:
                return SPYW_IN_CONTEXT_CONTROL;
            case 11:
                return SPYW_IN_CONTEXT_CONTROL_HEADER;
            case 12:
                return XUIKIT;
            case 13:
                return WEATHER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m224327b() {
        return C138013ae.f375462a;
    }

    public final int getNumber() {
        return this.f375478o;
    }

    public final String toString() {
        return Integer.toString(this.f375478o);
    }
}
