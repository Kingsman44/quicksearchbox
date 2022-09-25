package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8235c;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.C106617a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106722b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106724d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106725e;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.c.h */
/* compiled from: PG */
public final class C106644h extends C106725e implements C106617a {

    /* renamed from: a */
    public final C106724d f297299a;

    /* renamed from: b */
    public final C60887da f297300b;

    /* renamed from: c */
    public final C58974d f297301c;

    /* renamed from: d */
    private final C106722b f297302d = new C106722b();

    public C106644h(C106724d dVar, C83564a aVar, C60887da daVar) {
        this.f297299a = dVar;
        this.f297300b = daVar;
        this.f297301c = aVar.mo76901b(this);
    }

    /* renamed from: a */
    public final C60870cx mo95601a() {
        return (C60870cx) this.f297302d.mo95627a(new C106643g(this));
    }

    /* renamed from: b */
    public final void mo95606b(C65753ak akVar) {
        if (akVar == C65753ak.ASSISTANT_SETTINGS) {
            this.f297302d.mo95628b(new C106643g(this));
        }
    }
}
