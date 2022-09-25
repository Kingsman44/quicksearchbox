package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.w */
/* compiled from: PG */
final class C95317w implements C95319y {

    /* renamed from: a */
    private final long f266698a;

    /* renamed from: b */
    private final C21370a f266699b;

    public C95317w(long j, C21370a aVar) {
        this.f266698a = j;
        this.f266699b = aVar;
    }

    /* renamed from: a */
    public final boolean mo89211a(int i, C96628d dVar) {
        Long h = C95293ae.m157512h(i, dVar);
        boolean z = true;
        if (h == null) {
            return true;
        }
        if (this.f266699b.mo26870b() - h.longValue() < this.f266698a) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }
}
