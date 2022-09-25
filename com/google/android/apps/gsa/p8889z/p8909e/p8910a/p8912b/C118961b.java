package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.b */
/* compiled from: PG */
public final class C118961b implements C118960a {

    /* renamed from: a */
    protected final Query f331739a;

    /* renamed from: b */
    private final C92194i f331740b;

    /* renamed from: c */
    private final C86124t f331741c;

    public C118961b(Query query, C92194i iVar, C86124t tVar) {
        this.f331740b = iVar;
        this.f331739a = query;
        this.f331741c = tVar;
    }

    /* renamed from: a */
    public final void mo91334a() {
        if (this.f331739a.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
            return;
        }
        if (this.f331739a.mo84412cs()) {
            this.f331740b.mo86848d();
        } else {
            this.f331740b.mo86847c(C92207r.m151409a(this.f331739a, this.f331741c));
        }
    }

    /* renamed from: b */
    public final void mo91335b() {
        C92194i iVar = this.f331740b;
        Query query = this.f331739a;
        boolean a = C92207r.m151409a(query, this.f331741c);
        if (query.mo84412cs()) {
            iVar.mo86851g();
        } else if (query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
        } else {
            if ((!query.mo84338bW() && !query.mo84403cj()) || query.mo84337bV()) {
                iVar.mo86850f(a);
            }
        }
    }
}
