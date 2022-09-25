package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.v */
/* compiled from: PG */
final class C95316v implements C95319y {

    /* renamed from: a */
    private final long f266696a;

    /* renamed from: b */
    private final C21370a f266697b;

    public C95316v(long j, C21370a aVar) {
        this.f266696a = j;
        this.f266697b = aVar;
    }

    /* renamed from: a */
    public final boolean mo89211a(int i, C96628d dVar) {
        long a = dVar.mo90289a("TaperingHelper", "interaction-timestamp-" + C95293ae.m157509a(i), -1);
        Long valueOf = a >= 0 ? Long.valueOf(a) : null;
        boolean z = true;
        if (valueOf == null) {
            return true;
        }
        if (this.f266697b.mo26870b() - valueOf.longValue() < this.f266696a) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }
}
