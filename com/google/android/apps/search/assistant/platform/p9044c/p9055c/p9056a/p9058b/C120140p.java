package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.p */
/* compiled from: PG */
public enum C120140p implements C62957cd {
    UNKNOWN(0),
    NAVIGATION(1);
    

    /* renamed from: c */
    public final int f334383c;

    private C120140p(int i) {
        this.f334383c = i;
    }

    /* renamed from: a */
    public static C120140p m199079a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return NAVIGATION;
    }

    /* renamed from: b */
    public static C62959cf m199080b() {
        return C120139o.f334379a;
    }

    public final int getNumber() {
        return this.f334383c;
    }

    public final String toString() {
        return Integer.toString(this.f334383c);
    }
}
