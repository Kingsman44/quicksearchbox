package com.google.android.libraries.web.contrib.p3390j.p3396d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.contrib.j.d.g */
/* compiled from: PG */
public enum C43659g implements C62957cd {
    UNDEFINED(0),
    CENTER(1),
    START(2);
    

    /* renamed from: d */
    public final int f113928d;

    private C43659g(int i) {
        this.f113928d = i;
    }

    /* renamed from: a */
    public static C43659g m77037a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return CENTER;
        }
        if (i != 2) {
            return null;
        }
        return START;
    }

    /* renamed from: b */
    public static C62959cf m77038b() {
        return C43658f.f113923a;
    }

    public final int getNumber() {
        return this.f113928d;
    }

    public final String toString() {
        return Integer.toString(this.f113928d);
    }
}
