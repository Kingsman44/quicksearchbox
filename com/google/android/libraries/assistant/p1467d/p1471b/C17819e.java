package com.google.android.libraries.assistant.p1467d.p1471b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.b.e */
/* compiled from: PG */
public enum C17819e implements C62957cd {
    UNKNOWN(0),
    ELIGIBLE(1),
    NOT_ELIGIBLE(2),
    ELIGIBLE_SHOW_DIALOG(3),
    ELIGIBLE_SHOW_DIALOG_OPT_IN_2(9),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A(4),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B(5),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A(6),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B(7),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_3(8);
    

    /* renamed from: k */
    public final int f51132k;

    private C17819e(int i) {
        this.f51132k = i;
    }

    /* renamed from: a */
    public static C17819e m35067a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ELIGIBLE;
            case 2:
                return NOT_ELIGIBLE;
            case 3:
                return ELIGIBLE_SHOW_DIALOG;
            case 4:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A;
            case 5:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B;
            case 6:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A;
            case 7:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B;
            case 8:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_3;
            case 9:
                return ELIGIBLE_SHOW_DIALOG_OPT_IN_2;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m35068b() {
        return C17818d.f51120a;
    }

    public final int getNumber() {
        return this.f51132k;
    }

    public final String toString() {
        return Integer.toString(this.f51132k);
    }
}
