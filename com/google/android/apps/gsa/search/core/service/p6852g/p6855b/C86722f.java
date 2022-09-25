package com.google.android.apps.gsa.search.core.service.p6852g.p6855b;

import com.google.android.apps.gsa.search.core.service.p6848e.C86675a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86723c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.b.f */
/* compiled from: PG */
public final class C86722f {

    /* renamed from: a */
    public final Observer f234258a = new C86720d(this);

    /* renamed from: b */
    public C86726f f234259b;

    /* renamed from: c */
    private final C86723c f234260c;

    /* renamed from: d */
    private final C86675a f234261d;

    /* renamed from: e */
    private final Observer f234262e;

    /* renamed from: f */
    private C86725e f234263f;

    public C86722f(C86723c cVar, C86675a aVar) {
        C86721e eVar = new C86721e(this);
        this.f234262e = eVar;
        this.f234259b = new C86726f(C86725e.m139700c(C86724d.IDLE));
        this.f234263f = C86725e.m139700c(C86724d.IDLE);
        this.f234260c = cVar;
        this.f234261d = aVar;
        aVar.addObserver(eVar);
    }

    /* renamed from: a */
    public final void mo80335a() {
        C86725e eVar = this.f234259b.f234274a;
        if (!this.f234263f.equals(eVar)) {
            this.f234263f = eVar;
            this.f234260c.mo80330b();
        }
    }
}
