package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.l */
/* compiled from: PG */
public final class C89118l {
    /* renamed from: a */
    public static final int m144972a(boolean z, C89107a aVar) {
        C63490p pVar = C63490p.UNSPECIFIED;
        int i = aVar.f241540b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return !z ? 1 : 3;
        } else {
            if (i2 == 2) {
                return z ? 2 : 3;
            }
            if (i2 != 3) {
                return 3;
            }
            return z ? 2 : 1;
        }
    }
}
