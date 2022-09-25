package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.p */
/* compiled from: PG */
public enum C13054p implements C62957cd {
    IDLE(0),
    ONGOING(1),
    STOPPED(2);
    

    /* renamed from: d */
    public final int f40526d;

    private C13054p(int i) {
        this.f40526d = i;
    }

    /* renamed from: a */
    public static C13054p m29247a(int i) {
        if (i == 0) {
            return IDLE;
        }
        if (i == 1) {
            return ONGOING;
        }
        if (i != 2) {
            return null;
        }
        return STOPPED;
    }

    /* renamed from: b */
    public static C62959cf m29248b() {
        return C13053o.f40521a;
    }

    public final int getNumber() {
        return this.f40526d;
    }

    public final String toString() {
        return Integer.toString(this.f40526d);
    }
}
