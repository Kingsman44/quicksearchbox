package com.google.android.apps.search.googleapp.p10335j;

import com.google.android.apps.search.googleapp.incognito.p10323d.C136246d;
import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.j.d */
/* compiled from: PG */
public final class C136373d {

    /* renamed from: a */
    private final C136139t f371284a;

    /* renamed from: b */
    private final C136246d f371285b;

    public C136373d(C136139t tVar, C136246d dVar) {
        this.f371284a = tVar;
        this.f371285b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo112950a() {
        boolean b = this.f371285b.mo112859b();
        C38510a a = this.f371284a.mo112792a();
        if (a == C38510a.OPT_OUT) {
            b = false;
        } else if (a == C38510a.OPT_IN) {
            b = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(b));
    }
}
