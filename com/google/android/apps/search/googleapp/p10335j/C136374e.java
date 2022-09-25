package com.google.android.apps.search.googleapp.p10335j;

import com.google.android.apps.search.googleapp.incognito.p10323d.C136246d;
import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;

/* renamed from: com.google.android.apps.search.googleapp.j.e */
/* compiled from: PG */
public final class C136374e {

    /* renamed from: a */
    private final C136246d f371286a;

    /* renamed from: b */
    private final C137419h f371287b;

    /* renamed from: c */
    private final C136139t f371288c;

    public C136374e(C136246d dVar, C137419h hVar, C136139t tVar) {
        this.f371286a = dVar;
        this.f371287b = hVar;
        this.f371288c = tVar;
    }

    /* renamed from: a */
    public final boolean mo112951a() {
        C38510a a = this.f371288c.mo112792a();
        if (a == C38510a.OPT_OUT) {
            return false;
        }
        if (a == C38510a.OPT_IN) {
            return true;
        }
        return this.f371286a.mo112858a() && this.f371287b.mo113716a();
    }
}
