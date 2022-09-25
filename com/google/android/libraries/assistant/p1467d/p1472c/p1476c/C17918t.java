package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.c.c.t */
/* compiled from: PG */
public enum C17918t implements C62957cd {
    UNSPECIFIED(0),
    SUPPORT_ON_VOICE_PLATE_STATE_CHANGED(1),
    SUPPORT_UNBIND_INTEGRATION_SERVICE(2);
    

    /* renamed from: d */
    public final int f51334d;

    private C17918t(int i) {
        this.f51334d = i;
    }

    /* renamed from: a */
    public static C17918t m35111a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return SUPPORT_ON_VOICE_PLATE_STATE_CHANGED;
        }
        if (i != 2) {
            return null;
        }
        return SUPPORT_UNBIND_INTEGRATION_SERVICE;
    }

    /* renamed from: b */
    public static C62959cf m35112b() {
        return C17917s.f51329a;
    }

    public final int getNumber() {
        return this.f51334d;
    }

    public final String toString() {
        return Integer.toString(this.f51334d);
    }
}
