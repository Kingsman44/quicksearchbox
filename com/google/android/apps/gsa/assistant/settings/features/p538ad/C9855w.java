package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.w */
/* compiled from: PG */
public enum C9855w implements C62957cd {
    STANDBY(1),
    DISABLED(2),
    ENABLED(3);
    

    /* renamed from: d */
    public final int f33882d;

    private C9855w(int i) {
        this.f33882d = i;
    }

    /* renamed from: a */
    public static C9855w m24617a(int i) {
        if (i == 1) {
            return STANDBY;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m24618b() {
        return C9854v.f33877a;
    }

    public final int getNumber() {
        return this.f33882d;
    }

    public final String toString() {
        return Integer.toString(this.f33882d);
    }
}
