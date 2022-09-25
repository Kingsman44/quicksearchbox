package com.google.android.apps.gsa.search.core.state.p6866c.p6870d;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86366d;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.d.c */
/* compiled from: PG */
public final class C86871c extends C86354a implements C86366d {

    /* renamed from: a */
    private Double f234605a = null;

    protected C86871c() {
    }

    /* renamed from: a */
    public final void mo80136a(double d) {
        Double d2 = this.f234605a;
        if (d2 == null || d2.doubleValue() < d) {
            this.f234605a = Double.valueOf(d);
        }
    }
}
