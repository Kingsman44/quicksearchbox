package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.cm */
/* compiled from: PG */
public enum C80246cm implements C62957cd {
    UI_STATE_UNKNOWN(0),
    NO_UI(1),
    SUCCESS(2),
    FAILURE(3),
    SWIPE_INVOCATION(4),
    ASSISTANT_IS_ACTIVE(5),
    LIGHTWEIGHT_INVOCATION(6),
    LIGHTWEIGHT_TRY_SAYING(7),
    LIGHTWEIGHT_SWIPE_FAILURE(8),
    LIGHTWEIGHT_GENERIC_FAILURE(9),
    ASSIST_SHELF(10),
    MULTISTEP_EDUCATION(11),
    MULTISTEP_EDUCATION_END(12);
    

    /* renamed from: n */
    public final int f220162n;

    private C80246cm(int i) {
        this.f220162n = i;
    }

    /* renamed from: a */
    public static C80246cm m128102a(int i) {
        switch (i) {
            case 0:
                return UI_STATE_UNKNOWN;
            case 1:
                return NO_UI;
            case 2:
                return SUCCESS;
            case 3:
                return FAILURE;
            case 4:
                return SWIPE_INVOCATION;
            case 5:
                return ASSISTANT_IS_ACTIVE;
            case 6:
                return LIGHTWEIGHT_INVOCATION;
            case 7:
                return LIGHTWEIGHT_TRY_SAYING;
            case 8:
                return LIGHTWEIGHT_SWIPE_FAILURE;
            case 9:
                return LIGHTWEIGHT_GENERIC_FAILURE;
            case 10:
                return ASSIST_SHELF;
            case 11:
                return MULTISTEP_EDUCATION;
            case 12:
                return MULTISTEP_EDUCATION_END;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128103b() {
        return C80245cl.f220147a;
    }

    public final int getNumber() {
        return this.f220162n;
    }

    public final String toString() {
        return Integer.toString(this.f220162n);
    }
}
