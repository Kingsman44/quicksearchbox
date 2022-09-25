package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bl */
/* compiled from: PG */
public enum C124646bl implements C62957cd {
    SOUND_UNKNOWN(0),
    SOUND_ENABLED(1),
    SOUND_DISABLED(2);
    

    /* renamed from: d */
    public final int f343888d;

    private C124646bl(int i) {
        this.f343888d = i;
    }

    /* renamed from: a */
    public static C124646bl m204307a(int i) {
        if (i == 0) {
            return SOUND_UNKNOWN;
        }
        if (i == 1) {
            return SOUND_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return SOUND_DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m204308b() {
        return C124645bk.f343883a;
    }

    public final int getNumber() {
        return this.f343888d;
    }

    public final String toString() {
        return Integer.toString(this.f343888d);
    }
}
