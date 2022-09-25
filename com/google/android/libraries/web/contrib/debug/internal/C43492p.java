package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4580v.C60950i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.p */
/* compiled from: PG */
public final class C43492p implements C44107h {

    /* renamed from: a */
    public final long f113595a;

    /* renamed from: b */
    public final C43476aa f113596b;

    public C43492p(C43948y yVar, C43477ab abVar, WebModelProvider webModelProvider, C43269t tVar) {
        DebugFeatureContract debugFeatureContract = (DebugFeatureContract) tVar.mo46384b().mo46298a(DebugFeatureContract.class);
        C43474f e = debugFeatureContract.mo46543e();
        int d = debugFeatureContract.mo46542d();
        C43476aa aaVar = (C43476aa) abVar.f113575a.get(e);
        if (aaVar == null) {
            C43476aa aaVar2 = new C43476aa((C60950i) abVar.f113576b.f199137a.a.bC.mo17428b(), d);
            abVar.f113575a.put(e, aaVar2);
            aaVar = aaVar2;
        } else {
            int size = aaVar.f113572a.size();
            C58425eo eoVar = aaVar.f113572a;
            C58838bb.m90868c(d == size + (eoVar.f156037a - eoVar.size()));
        }
        this.f113596b = aaVar;
        long a = tVar.mo46383a();
        this.f113595a = a;
        C43502z zVar = new C43502z(aaVar, a, new C43478b(tVar.mo46385c()), yVar.mo46936a());
        aaVar.f113574c.put(Long.valueOf(a), zVar);
        ((C43243b) webModelProvider.mo47072a(C43243b.class)).f113006a = Optional.m71637of(new C43490n(this, zVar, yVar));
    }

    /* renamed from: a */
    public final void mo44356a() {
        C43502z zVar = (C43502z) this.f113596b.f113574c.get(Long.valueOf(this.f113595a));
        if (zVar != null) {
            zVar.f113610b = false;
        }
    }
}
