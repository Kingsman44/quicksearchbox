package com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.d.a.c */
/* compiled from: PG */
public enum C121040c implements C62957cd {
    UNSPECIFIED(0),
    VOICE(1),
    TOUCH(2);
    

    /* renamed from: d */
    public final int f336425d;

    private C121040c(int i) {
        this.f336425d = i;
    }

    /* renamed from: a */
    public static C121040c m200335a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return VOICE;
        }
        if (i != 2) {
            return null;
        }
        return TOUCH;
    }

    /* renamed from: b */
    public static C62959cf m200336b() {
        return C121039b.f336420a;
    }

    public final int getNumber() {
        return this.f336425d;
    }

    public final String toString() {
        return Integer.toString(this.f336425d);
    }
}
