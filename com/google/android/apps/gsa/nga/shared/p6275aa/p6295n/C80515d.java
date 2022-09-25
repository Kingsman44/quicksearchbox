package com.google.android.apps.gsa.nga.shared.p6275aa.p6295n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.n.d */
/* compiled from: PG */
public enum C80515d implements C62957cd {
    UNKNOWN(0),
    TEST(1),
    GINA(2),
    CANTEEN(3),
    TELEPORT(4),
    FUZZY_MATCHER(5),
    GENIE(6),
    APP_SEARCH_CLASSIFIER(7),
    CACHED_ANSWERS(8),
    DICTATION(9),
    WARM_ACTIONS(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: m */
    private final int f221035m;

    private C80515d(int i) {
        this.f221035m = i;
    }

    /* renamed from: a */
    public static C80515d m128185a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TEST;
            case 2:
                return GINA;
            case 3:
                return CANTEEN;
            case 4:
                return TELEPORT;
            case 5:
                return FUZZY_MATCHER;
            case 6:
                return GENIE;
            case 7:
                return APP_SEARCH_CLASSIFIER;
            case 8:
                return CACHED_ANSWERS;
            case 9:
                return DICTATION;
            case 11:
                return WARM_ACTIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128186b() {
        return C80514c.f221021a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221035m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
