package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.ac */
/* compiled from: PG */
final class C111607ac extends C0282s {

    /* renamed from: d */
    final /* synthetic */ SettableFuture f310352d;

    /* renamed from: e */
    final /* synthetic */ C111611ag f310353e;

    public C111607ac(C111611ag agVar, SettableFuture settableFuture) {
        this.f310353e = agVar;
        this.f310352d = settableFuture;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        C59071e eVar = C111611ag.f310358a;
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = this.f310352d;
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(list).filter(C111605aa.f310350a).map(new C111606ab(this)).limit(3).collect(C58370cn.f155946a))));
        settableFuture.mo57356n(p.mo100091a());
        this.f310353e.f310360b.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        C59104x b = C111611ag.f310358a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "YtbMusicMediaBrowser");
        ((C59052c) ((C59052c) b).mo56372aa(27263)).mo56389s("#onError(): parentId=%s", str);
        this.f310352d.mo57356n(C113408es.f314036b);
        this.f310353e.f310360b.mo804h(str);
    }
}
