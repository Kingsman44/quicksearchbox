package com.google.android.apps.search.googleapp.compliance.p10145b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.compliance.b.l */
/* compiled from: PG */
public enum C133614l implements C62957cd {
    HINT_UNSPECIFIED(0),
    HINT_ROTATION_1(1),
    HINT_ROTATION_INTERMEDIATE_1(2),
    HINT_ROTATION_2(3),
    HINT_ROTATION_INTERMEDIATE_2(4),
    HINT_ROTATION_3(5),
    HINT_ROTATION_INTERMEDIATE_3(6);
    

    /* renamed from: h */
    public final int f363987h;

    private C133614l(int i) {
        this.f363987h = i;
    }

    /* renamed from: a */
    public static C133614l m216828a(int i) {
        switch (i) {
            case 0:
                return HINT_UNSPECIFIED;
            case 1:
                return HINT_ROTATION_1;
            case 2:
                return HINT_ROTATION_INTERMEDIATE_1;
            case 3:
                return HINT_ROTATION_2;
            case 4:
                return HINT_ROTATION_INTERMEDIATE_2;
            case 5:
                return HINT_ROTATION_3;
            case 6:
                return HINT_ROTATION_INTERMEDIATE_3;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m216829b() {
        return C133613k.f363978a;
    }

    public final int getNumber() {
        return this.f363987h;
    }

    public final String toString() {
        return Integer.toString(this.f363987h);
    }
}
