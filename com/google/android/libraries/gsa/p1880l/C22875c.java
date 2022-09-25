package com.google.android.libraries.gsa.p1880l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.gsa.l.c */
/* compiled from: PG */
public enum C22875c implements C62957cd {
    IMAGE(0),
    PAGE(1),
    SCREENSHOT(2),
    PLACE(3);
    

    /* renamed from: e */
    public final int f62943e;

    private C22875c(int i) {
        this.f62943e = i;
    }

    /* renamed from: a */
    public static C22875c m42745a(int i) {
        if (i == 0) {
            return IMAGE;
        }
        if (i == 1) {
            return PAGE;
        }
        if (i == 2) {
            return SCREENSHOT;
        }
        if (i != 3) {
            return null;
        }
        return PLACE;
    }

    /* renamed from: b */
    public static C62959cf m42746b() {
        return C22874b.f62937a;
    }

    public final int getNumber() {
        return this.f62943e;
    }

    public final String toString() {
        return Integer.toString(this.f62943e);
    }
}
