package com.google.android.libraries.web.contrib.contextmenu.p3363b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.b.e */
/* compiled from: PG */
public enum C43445e implements C62957cd {
    UNKNOWN(0),
    LINK(1),
    IMAGE(2),
    IMAGE_LINK(3),
    PHONE_NUMBER(4),
    EMAIL_ADDRESS(5),
    GEO_ADDRESS(6);
    

    /* renamed from: h */
    public final int f113497h;

    private C43445e(int i) {
        this.f113497h = i;
    }

    /* renamed from: a */
    public static C43445e m76673a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LINK;
            case 2:
                return IMAGE;
            case 3:
                return IMAGE_LINK;
            case 4:
                return PHONE_NUMBER;
            case 5:
                return EMAIL_ADDRESS;
            case 6:
                return GEO_ADDRESS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m76674b() {
        return C43444d.f113488a;
    }

    public final int getNumber() {
        return this.f113497h;
    }

    public final String toString() {
        return Integer.toString(this.f113497h);
    }
}
