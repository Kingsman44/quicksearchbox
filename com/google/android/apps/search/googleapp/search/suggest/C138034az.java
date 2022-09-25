package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.az */
/* compiled from: PG */
public enum C138034az implements C62957cd {
    NONE(0),
    COMPLETE_SERVER(1),
    ICING(3),
    NOW_PROMO(5),
    PIXEL_LAUNCHER(19),
    SUGGEST_2G_LITE(22),
    ASSISTANT_SUGGEST(28),
    ONE_SEARCH_ON_DEVICE(29);
    

    /* renamed from: i */
    public final int f375590i;

    private C138034az(int i) {
        this.f375590i = i;
    }

    /* renamed from: a */
    public static C138034az m224336a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return COMPLETE_SERVER;
        }
        if (i == 3) {
            return ICING;
        }
        if (i == 5) {
            return NOW_PROMO;
        }
        if (i == 19) {
            return PIXEL_LAUNCHER;
        }
        if (i == 22) {
            return SUGGEST_2G_LITE;
        }
        if (i == 28) {
            return ASSISTANT_SUGGEST;
        }
        if (i != 29) {
            return null;
        }
        return ONE_SEARCH_ON_DEVICE;
    }

    /* renamed from: b */
    public static C62959cf m224337b() {
        return C138033ay.f375580a;
    }

    public final int getNumber() {
        return this.f375590i;
    }

    public final String toString() {
        return Integer.toString(this.f375590i);
    }
}
