package com.google.android.apps.gsa.shared.speech.hotword.p7143a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.a.f */
/* compiled from: PG */
public enum C90584f implements C62957cd {
    UNKNOWN(0),
    OK_GOOGLE(1),
    OK_HEY_GOOGLE(2);
    

    /* renamed from: d */
    public final int f253255d;

    private C90584f(int i) {
        this.f253255d = i;
    }

    /* renamed from: a */
    public static C90584f m147800a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OK_GOOGLE;
        }
        if (i != 2) {
            return null;
        }
        return OK_HEY_GOOGLE;
    }

    /* renamed from: b */
    public static C62959cf m147801b() {
        return C90583e.f253250a;
    }

    public final int getNumber() {
        return this.f253255d;
    }

    public final String toString() {
        return Integer.toString(this.f253255d);
    }
}
