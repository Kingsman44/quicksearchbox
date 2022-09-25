package com.google.protos.p4985f.p4988b.p4990b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.b.b.b */
/* compiled from: PG */
public enum C64736b implements C62957cd {
    UNKNOWN_ASSIST_DATA_REQUIRED_TYPE(0),
    WEB_URI(1),
    APP_PACKAGE_METADATA(2),
    SCREENSHOT(3),
    DIRECT_ACTION_DATA(4);
    

    /* renamed from: f */
    private final int f175489f;

    private C64736b(int i) {
        this.f175489f = i;
    }

    /* renamed from: a */
    public static C64736b m96451a(int i) {
        if (i == 0) {
            return UNKNOWN_ASSIST_DATA_REQUIRED_TYPE;
        }
        if (i == 1) {
            return WEB_URI;
        }
        if (i == 2) {
            return APP_PACKAGE_METADATA;
        }
        if (i == 3) {
            return SCREENSHOT;
        }
        if (i != 4) {
            return null;
        }
        return DIRECT_ACTION_DATA;
    }

    /* renamed from: b */
    public static C62959cf m96452b() {
        return C64721a.f175442a;
    }

    public final int getNumber() {
        return this.f175489f;
    }

    public final String toString() {
        return Integer.toString(this.f175489f);
    }
}
