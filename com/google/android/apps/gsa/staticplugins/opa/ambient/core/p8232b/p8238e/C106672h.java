package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e;

import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.C106617a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106722b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106724d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106725e;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.h */
/* compiled from: PG */
public final class C106672h extends C106725e implements C106617a {

    /* renamed from: a */
    public final C106724d f297339a;

    /* renamed from: b */
    public final C60887da f297340b;

    /* renamed from: c */
    public final C83807w f297341c;

    /* renamed from: d */
    public final C130895ag f297342d;

    /* renamed from: e */
    public final C60950i f297343e;

    /* renamed from: f */
    private final C106722b f297344f = new C106722b();

    public C106672h(C106724d dVar, C60887da daVar, C83807w wVar, C130895ag agVar, C60950i iVar) {
        this.f297339a = dVar;
        this.f297340b = daVar;
        this.f297341c = wVar;
        this.f297342d = agVar;
        this.f297343e = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo95601a() {
        C60870cx c = mo95610c();
        C106668d dVar = C106668d.f297335a;
        return C60922j.m93044g(c, C47810es.m84963c(dVar), this.f297340b);
    }

    /* renamed from: b */
    public final void mo95606b(C65753ak akVar) {
        if (akVar == C65753ak.HABITS_AA_PROFILES) {
            this.f297344f.mo95628b(new C106669e(this));
        }
    }

    /* renamed from: c */
    public final C60870cx mo95610c() {
        return (C60870cx) this.f297344f.mo95627a(new C106669e(this));
    }
}
