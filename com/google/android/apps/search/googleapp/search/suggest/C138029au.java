package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.au */
/* compiled from: PG */
public enum C138029au implements C62957cd {
    QUERY(0),
    NAVIGATION(5),
    CALCULATOR_OB(19),
    TAIL(33),
    PERSONALIZED_QUERY(35),
    ENTITY(46),
    PERSONALIZED_NAVIGATION(83),
    ON_DEVICE_APP(84),
    ACCESS_NOW_PROMO(139),
    GEMINI_LIGHT(176),
    IN_CONTEXT_CONTROL(179),
    LENS_PROMO(183),
    ONE_SEARCH_ON_DEVICE(184);
    

    /* renamed from: n */
    public final int f375534n;

    private C138029au(int i) {
        this.f375534n = i;
    }

    /* renamed from: a */
    public static C138029au m224331a(int i) {
        if (i == 0) {
            return QUERY;
        }
        if (i == 5) {
            return NAVIGATION;
        }
        if (i == 19) {
            return CALCULATOR_OB;
        }
        if (i == 33) {
            return TAIL;
        }
        if (i == 35) {
            return PERSONALIZED_QUERY;
        }
        if (i == 46) {
            return ENTITY;
        }
        if (i == 139) {
            return ACCESS_NOW_PROMO;
        }
        if (i == 176) {
            return GEMINI_LIGHT;
        }
        if (i == 179) {
            return IN_CONTEXT_CONTROL;
        }
        if (i == 83) {
            return PERSONALIZED_NAVIGATION;
        }
        if (i == 84) {
            return ON_DEVICE_APP;
        }
        if (i == 183) {
            return LENS_PROMO;
        }
        if (i != 184) {
            return null;
        }
        return ONE_SEARCH_ON_DEVICE;
    }

    /* renamed from: b */
    public static C62959cf m224332b() {
        return C138028at.f375519a;
    }

    public final int getNumber() {
        return this.f375534n;
    }

    public final String toString() {
        return Integer.toString(this.f375534n);
    }
}
