package com.google.android.libraries.p590as.p593b.p596b.p604g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.as.b.b.g.b */
/* compiled from: PG */
public enum C10874b implements C62957cd {
    SETTING_UNSPECIFIED(0),
    MANUAL_UPDATES_ONLY(1),
    WIFI_ONLY(2),
    WIFI_AND_CELLULAR(3);
    

    /* renamed from: e */
    private final int f35952e;

    private C10874b(int i) {
        this.f35952e = i;
    }

    /* renamed from: a */
    public static C10874b m25893a(int i) {
        if (i == 0) {
            return SETTING_UNSPECIFIED;
        }
        if (i == 1) {
            return MANUAL_UPDATES_ONLY;
        }
        if (i == 2) {
            return WIFI_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return WIFI_AND_CELLULAR;
    }

    /* renamed from: b */
    public static C62959cf m25894b() {
        return C10873a.f35946a;
    }

    public final int getNumber() {
        return this.f35952e;
    }

    public final String toString() {
        return Integer.toString(this.f35952e);
    }
}
