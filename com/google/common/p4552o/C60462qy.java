package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.qy */
/* compiled from: PG */
public enum C60462qy implements C62957cd {
    UPDATED(1),
    UPDATED_OPTIONS_CHANGED(2),
    DELETED(3),
    USER_PRESENT(4),
    PROVIDER_ENABLED(5),
    PROVIDER_DISABLED(6),
    WIDGET_STATE(7);
    

    /* renamed from: h */
    public final int f163634h;

    private C60462qy(int i) {
        this.f163634h = i;
    }

    /* renamed from: a */
    public static C60462qy m92590a(int i) {
        switch (i) {
            case 1:
                return UPDATED;
            case 2:
                return UPDATED_OPTIONS_CHANGED;
            case 3:
                return DELETED;
            case 4:
                return USER_PRESENT;
            case 5:
                return PROVIDER_ENABLED;
            case 6:
                return PROVIDER_DISABLED;
            case 7:
                return WIDGET_STATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92591b() {
        return C60461qx.f163625a;
    }

    public final int getNumber() {
        return this.f163634h;
    }

    public final String toString() {
        return Integer.toString(this.f163634h);
    }
}
