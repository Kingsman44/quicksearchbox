package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85348q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import p3186j$.util.Collection;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ft */
/* compiled from: PG */
public final /* synthetic */ class C115358ft implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115368gc f320072a;

    public /* synthetic */ C115358ft(C115368gc gcVar) {
        this.f320072a = gcVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115368gc gcVar = this.f320072a;
        C23251a aVar = (C23251a) gcVar.f320085f.mo102028c();
        C68189by byVar = ((C85348q) obj).f231144c;
        if (byVar == null) {
            byVar = C68189by.f184505b;
        }
        aVar.mo28730f((C68185bu) Collection.EL.stream(byVar.f184507a).filter(new C115363fy(gcVar)).map(C115364fz.f320078a).findFirst().orElse(C68185bu.f184497d), false);
    }
}
