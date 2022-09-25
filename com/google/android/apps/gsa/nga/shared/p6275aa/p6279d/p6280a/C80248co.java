package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.co */
/* compiled from: PG */
public enum C80248co implements C62957cd {
    USECASE_TYPE_UNKNOWN(0),
    NEW_APP_EDUCATION(1),
    MAPS_EDUCATION_USECASE(2),
    TRY_SAYING_QUERY_USECASE(3),
    MULTI_STEP_EDUCATION(4),
    FAKE_USECASE_TYPE(100);
    

    /* renamed from: g */
    public final int f220171g;

    private C80248co(int i) {
        this.f220171g = i;
    }

    /* renamed from: a */
    public static C80248co m128104a(int i) {
        if (i == 0) {
            return USECASE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NEW_APP_EDUCATION;
        }
        if (i == 2) {
            return MAPS_EDUCATION_USECASE;
        }
        if (i == 3) {
            return TRY_SAYING_QUERY_USECASE;
        }
        if (i == 4) {
            return MULTI_STEP_EDUCATION;
        }
        if (i != 100) {
            return null;
        }
        return FAKE_USECASE_TYPE;
    }

    /* renamed from: b */
    public static C62959cf m128105b() {
        return C80247cn.f220163a;
    }

    public final int getNumber() {
        return this.f220171g;
    }

    public final String toString() {
        return Integer.toString(this.f220171g);
    }
}
