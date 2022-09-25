package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.zp */
/* compiled from: PG */
public enum C60700zp implements C62957cd {
    UNKNOWN_INTEGRATION_MODE(0),
    AGSA_INTENT(1),
    LENSVIEW_STATIC(2),
    LENSVIEW_DYNAMIC(3),
    DIRECT_INTENT(4);
    

    /* renamed from: f */
    public final int f164695f;

    private C60700zp(int i) {
        this.f164695f = i;
    }

    /* renamed from: a */
    public static C60700zp m92636a(int i) {
        if (i == 0) {
            return UNKNOWN_INTEGRATION_MODE;
        }
        if (i == 1) {
            return AGSA_INTENT;
        }
        if (i == 2) {
            return LENSVIEW_STATIC;
        }
        if (i == 3) {
            return LENSVIEW_DYNAMIC;
        }
        if (i != 4) {
            return null;
        }
        return DIRECT_INTENT;
    }

    /* renamed from: b */
    public static C62959cf m92637b() {
        return C60699zo.f164688a;
    }

    public final int getNumber() {
        return this.f164695f;
    }

    public final String toString() {
        return Integer.toString(this.f164695f);
    }
}
