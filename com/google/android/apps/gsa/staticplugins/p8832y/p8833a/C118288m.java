package com.google.android.apps.gsa.staticplugins.p8832y.p8833a;

import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;

/* renamed from: com.google.android.apps.gsa.staticplugins.y.a.m */
/* compiled from: PG */
public final class C118288m implements C85983e {

    /* renamed from: a */
    private final C21370a f328361a;

    public C118288m(C21370a aVar) {
        this.f328361a = aVar;
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        if (query.mo84392cY()) {
            long b = this.f328361a.mo26870b();
            if (query.mo84316bA()) {
                b = C21383f.m40448a(this.f328361a, query.f252747E);
            } else if (query.mo84317bB()) {
                b = query.f252745C;
            }
            cVar.mo79638d("qsubts", Long.toString(b));
        }
    }
}
