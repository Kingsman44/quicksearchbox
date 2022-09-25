package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bc */
/* compiled from: PG */
public enum C13750bc implements C62957cd {
    UNSPECIFIED(0),
    OFFLINE_ONLY(1),
    ONLINE_ONLY(2),
    HYBRID(3);
    

    /* renamed from: e */
    private final int f41926e;

    private C13750bc(int i) {
        this.f41926e = i;
    }

    /* renamed from: a */
    public static C13750bc m29999a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OFFLINE_ONLY;
        }
        if (i == 2) {
            return ONLINE_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return HYBRID;
    }

    /* renamed from: b */
    public static C62959cf m30000b() {
        return C13749bb.f41920a;
    }

    public final int getNumber() {
        return this.f41926e;
    }

    public final String toString() {
        return Integer.toString(this.f41926e);
    }
}
