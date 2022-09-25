package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ax */
/* compiled from: PG */
public enum C138032ax implements C62957cd {
    INVALID(0),
    TALL_TOP_SLOT_SINGLE_PROMO(4),
    PRIMARY(5),
    TRENDING(8),
    APP_STRIP(40),
    SECONDARY(80),
    ONBOARDING(40001),
    TRENDS(40002),
    VASCO(40006),
    PROACTIVE_ZPS_GROUP(40009),
    IN_CONTEXT_CONTROL_GROUP(40021),
    REPEATED_HISTORY_1_GROUP(45051),
    REPEATED_HISTORY_2_GROUP(45052),
    GEMINI_APP_STRIP(80010),
    GEMINI_LIGHT(80020),
    POLARIS_GROUP1(90000),
    POLARIS_GROUP2(90001),
    POLARIS_GROUP3(90002),
    POLARIS_GROUP4(90003),
    POLARIS_GROUP5(90004),
    POLARIS_GROUP6(90005),
    POLARIS_GROUP7(90006),
    POLARIS_GROUP8(90007),
    POLARIS_GROUP9(90008),
    POLARIS_GROUP10(90009),
    POLARIS_GROUP10000(99999),
    NOW_PROMO_GROUP(100000);
    

    /* renamed from: B */
    public final int f375579B;

    private C138032ax(int i) {
        this.f375579B = i;
    }

    /* renamed from: a */
    public static C138032ax m224334a(int i) {
        if (i == 0) {
            return INVALID;
        }
        if (i == 8) {
            return TRENDING;
        }
        if (i == 40) {
            return APP_STRIP;
        }
        if (i == 80) {
            return SECONDARY;
        }
        if (i == 40006) {
            return VASCO;
        }
        if (i == 40009) {
            return PROACTIVE_ZPS_GROUP;
        }
        if (i == 40021) {
            return IN_CONTEXT_CONTROL_GROUP;
        }
        if (i == 80010) {
            return GEMINI_APP_STRIP;
        }
        if (i == 80020) {
            return GEMINI_LIGHT;
        }
        if (i == 4) {
            return TALL_TOP_SLOT_SINGLE_PROMO;
        }
        if (i == 5) {
            return PRIMARY;
        }
        switch (i) {
            case 40001:
                return ONBOARDING;
            case 40002:
                return TRENDS;
            default:
                switch (i) {
                    case 45051:
                        return REPEATED_HISTORY_1_GROUP;
                    case 45052:
                        return REPEATED_HISTORY_2_GROUP;
                    default:
                        switch (i) {
                            case 90000:
                                return POLARIS_GROUP1;
                            case 90001:
                                return POLARIS_GROUP2;
                            case 90002:
                                return POLARIS_GROUP3;
                            case 90003:
                                return POLARIS_GROUP4;
                            case 90004:
                                return POLARIS_GROUP5;
                            case 90005:
                                return POLARIS_GROUP6;
                            case 90006:
                                return POLARIS_GROUP7;
                            case 90007:
                                return POLARIS_GROUP8;
                            case 90008:
                                return POLARIS_GROUP9;
                            case 90009:
                                return POLARIS_GROUP10;
                            default:
                                switch (i) {
                                    case 99999:
                                        return POLARIS_GROUP10000;
                                    case 100000:
                                        return NOW_PROMO_GROUP;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m224335b() {
        return C138031aw.f375550a;
    }

    public final int getNumber() {
        return this.f375579B;
    }

    public final String toString() {
        return Integer.toString(this.f375579B);
    }
}
