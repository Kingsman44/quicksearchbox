package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.q */
/* compiled from: PG */
public enum C88467q implements C62957cd {
    UNSPECIFIED(0),
    EXTENDED(1);
    

    /* renamed from: c */
    private final int f239163c;

    private C88467q(int i) {
        this.f239163c = i;
    }

    /* renamed from: a */
    public static C88467q m142815a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return EXTENDED;
    }

    /* renamed from: b */
    public static C62959cf m142816b() {
        return C88466p.f239159a;
    }

    public final int getNumber() {
        return this.f239163c;
    }

    public final String toString() {
        return Integer.toString(this.f239163c);
    }
}
