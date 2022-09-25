package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.nj */
/* compiled from: PG */
public enum C7880nj implements C62957cd {
    ACCEPT(1),
    DECLINE(2),
    SKIP(3),
    OPT_OUT_DEVICE(4),
    OPT_OUT_COMPLETE(5),
    DELETE_DATA(6),
    AUTO_ACTIVATION(7),
    ACTIVATION(9),
    AUTO_ACTIVATION_SKIP(10),
    RESET_NOW_PREFERENCES(11),
    DEFER_OPT_IN(12),
    IN_DEFER_OPT_IN_EXPERIMENT(13),
    IN_DEFER_OPT_IN_CONTROL(14),
    IN_UOS_CONTROL(15),
    IN_UOS_EXPERIMENT_WITH_SKIP(16),
    IN_UOS_EXPERIMENT_WITHOUT_SKIP(17),
    IN_UOS_EXPERIMENT_WITHOUT_DISMISS(18),
    IN_MOE_CONTROL(19),
    IN_MOE_NO_VALUE_PROP_EXPERIMENT(20),
    IN_MOE_UOS_EXPERIMENT(21),
    IN_MOE_DEFERRED_BY_DAYS_EXPERIMENT(22),
    IN_MOE_DEFERRED_BY_SEARCH_NUM_EXPERIMENT(23),
    IN_MOE_NO_ONBOARDING_EXPERIMENT(24),
    CANCEL(25),
    WAA_ON(26),
    WAA_ON_IN_UDC(27),
    WAA_OFF(28),
    WAA_OPT_IN(29),
    WAA_OPT_IN_SKIP(30);
    

    /* renamed from: D */
    public final int f27650D;

    private C7880nj(int i) {
        this.f27650D = i;
    }

    /* renamed from: a */
    public static C7880nj m22884a(int i) {
        switch (i) {
            case 1:
                return ACCEPT;
            case 2:
                return DECLINE;
            case 3:
                return SKIP;
            case 4:
                return OPT_OUT_DEVICE;
            case 5:
                return OPT_OUT_COMPLETE;
            case 6:
                return DELETE_DATA;
            case 7:
                return AUTO_ACTIVATION;
            case 9:
                return ACTIVATION;
            case 10:
                return AUTO_ACTIVATION_SKIP;
            case 11:
                return RESET_NOW_PREFERENCES;
            case 12:
                return DEFER_OPT_IN;
            case 13:
                return IN_DEFER_OPT_IN_EXPERIMENT;
            case 14:
                return IN_DEFER_OPT_IN_CONTROL;
            case 15:
                return IN_UOS_CONTROL;
            case 16:
                return IN_UOS_EXPERIMENT_WITH_SKIP;
            case 17:
                return IN_UOS_EXPERIMENT_WITHOUT_SKIP;
            case 18:
                return IN_UOS_EXPERIMENT_WITHOUT_DISMISS;
            case 19:
                return IN_MOE_CONTROL;
            case 20:
                return IN_MOE_NO_VALUE_PROP_EXPERIMENT;
            case 21:
                return IN_MOE_UOS_EXPERIMENT;
            case 22:
                return IN_MOE_DEFERRED_BY_DAYS_EXPERIMENT;
            case 23:
                return IN_MOE_DEFERRED_BY_SEARCH_NUM_EXPERIMENT;
            case 24:
                return IN_MOE_NO_ONBOARDING_EXPERIMENT;
            case 25:
                return CANCEL;
            case 26:
                return WAA_ON;
            case 27:
                return WAA_ON_IN_UDC;
            case 28:
                return WAA_OFF;
            case 29:
                return WAA_OPT_IN;
            case 30:
                return WAA_OPT_IN_SKIP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22885b() {
        return C7879ni.f27619a;
    }

    public final int getNumber() {
        return this.f27650D;
    }

    public final String toString() {
        return Integer.toString(this.f27650D);
    }
}
