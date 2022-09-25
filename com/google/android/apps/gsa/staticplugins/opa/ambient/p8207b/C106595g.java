package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.g */
/* compiled from: PG */
public enum C106595g implements C62957cd {
    UNSPECIFIED(0),
    HEADSET_STATE(1),
    SCREEN_STATE(2),
    LAUNCHER_VISIBILITY(5),
    RESET(7),
    PCP_EVENT(8),
    MEDIA_SESSION(9),
    SLICE_UPDATE(11);
    

    /* renamed from: i */
    public final int f297203i;

    private C106595g(int i) {
        this.f297203i = i;
    }

    /* renamed from: a */
    public static C106595g m177369a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return HEADSET_STATE;
        }
        if (i == 2) {
            return SCREEN_STATE;
        }
        if (i == 5) {
            return LAUNCHER_VISIBILITY;
        }
        if (i == 11) {
            return SLICE_UPDATE;
        }
        if (i == 7) {
            return RESET;
        }
        if (i == 8) {
            return PCP_EVENT;
        }
        if (i != 9) {
            return null;
        }
        return MEDIA_SESSION;
    }

    /* renamed from: b */
    public static C62959cf m177370b() {
        return C106594f.f297193a;
    }

    public final int getNumber() {
        return this.f297203i;
    }

    public final String toString() {
        return Integer.toString(this.f297203i);
    }
}
