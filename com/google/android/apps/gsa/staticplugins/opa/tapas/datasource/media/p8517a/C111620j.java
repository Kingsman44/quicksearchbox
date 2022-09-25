package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0277n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.j */
/* compiled from: PG */
final class C111620j extends C0277n {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f310371a;

    /* renamed from: b */
    final /* synthetic */ C111622l f310372b;

    public C111620j(C111622l lVar, SettableFuture settableFuture) {
        this.f310372b = lVar;
        this.f310371a = settableFuture;
    }

    /* renamed from: a */
    public final void mo849a() {
        C59071e eVar = C111622l.f310374a;
        C58976aa aaVar = C58975e.f156826a;
        this.f310371a.mo57356n(C113408es.f314036b);
    }

    /* renamed from: b */
    public final void mo850b(List list) {
        C59071e eVar = C111622l.f310374a;
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = this.f310371a;
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(list).filter(C111617g.f310368a).map(C111618h.f310369a).distinct().map(new C111619i(this)).limit(3).collect(C58370cn.f155946a))));
        settableFuture.mo57356n(p.mo100091a());
    }
}
