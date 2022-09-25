package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.e */
/* compiled from: PG */
final class C111615e extends C0282s {

    /* renamed from: d */
    final /* synthetic */ C111616f f310365d;

    public C111615e(C111616f fVar) {
        this.f310365d = fVar;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        C59071e eVar = C111622l.f310374a;
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = this.f310365d.f310366d;
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(list).filter(C111612b.f310362a).map(C111613c.f310363a).distinct().map(new C111614d(this)).limit(3).collect(C58370cn.f155946a))));
        settableFuture.mo57356n(p.mo100091a());
        this.f310365d.f310367e.f310376b.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        C59071e eVar = C111622l.f310374a;
        C58976aa aaVar = C58975e.f156826a;
        this.f310365d.f310366d.mo57356n(C113408es.f314036b);
        this.f310365d.f310367e.f310376b.mo804h(str);
    }
}
