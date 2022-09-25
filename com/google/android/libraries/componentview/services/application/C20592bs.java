package com.google.android.libraries.componentview.services.application;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.componentview.services.application.bs */
/* compiled from: PG */
public enum C20592bs implements C62957cd {
    UNKNOWN(0),
    ON(1),
    OFF(2),
    SCROLL_LEFT(3),
    SCROLL_RIGHT(4);
    

    /* renamed from: f */
    public final int f57795f;

    private C20592bs(int i) {
        this.f57795f = i;
    }

    /* renamed from: a */
    public static C20592bs m38633a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ON;
        }
        if (i == 2) {
            return OFF;
        }
        if (i == 3) {
            return SCROLL_LEFT;
        }
        if (i != 4) {
            return null;
        }
        return SCROLL_RIGHT;
    }

    /* renamed from: b */
    public static C62959cf m38634b() {
        return C20591br.f57788a;
    }

    public final int getNumber() {
        return this.f57795f;
    }

    public final String toString() {
        return Integer.toString(this.f57795f);
    }
}
