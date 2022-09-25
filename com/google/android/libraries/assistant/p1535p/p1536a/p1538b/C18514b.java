package com.google.android.libraries.assistant.p1535p.p1536a.p1538b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.p.a.b.b */
/* compiled from: PG */
public enum C18514b implements C62957cd {
    QUICK_PHRASES_OPEN_TAB_UNSPECIFIED(0),
    MOBILE(1),
    SHARED_DEVICES(2);
    

    /* renamed from: d */
    public final int f52473d;

    private C18514b(int i) {
        this.f52473d = i;
    }

    /* renamed from: a */
    public static C18514b m35980a(int i) {
        if (i == 0) {
            return QUICK_PHRASES_OPEN_TAB_UNSPECIFIED;
        }
        if (i == 1) {
            return MOBILE;
        }
        if (i != 2) {
            return null;
        }
        return SHARED_DEVICES;
    }

    /* renamed from: b */
    public static C62959cf m35981b() {
        return C18513a.f52468a;
    }

    public final int getNumber() {
        return this.f52473d;
    }

    public final String toString() {
        return Integer.toString(this.f52473d);
    }
}
