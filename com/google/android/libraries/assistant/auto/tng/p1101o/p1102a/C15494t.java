package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.t */
/* compiled from: PG */
public final class C15494t {

    /* renamed from: a */
    public static final C59071e f46447a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.o.a.t");

    /* renamed from: b */
    public final C15481g f46448b;

    /* renamed from: c */
    public final Executor f46449c;

    /* renamed from: d */
    public final C15478d f46450d;

    /* renamed from: e */
    public final C15487m f46451e;

    /* renamed from: f */
    public final C69464a f46452f;

    /* renamed from: g */
    public final C69464a f46453g;

    public C15494t(C15481g gVar, Executor executor, C15487m mVar, C69464a aVar, C69464a aVar2) {
        this.f46448b = gVar;
        this.f46449c = executor;
        this.f46450d = new C15478d(executor);
        this.f46451e = mVar;
        this.f46452f = aVar;
        this.f46453g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo22363a(C37252a aVar, C12991i iVar, Optional optional, Optional optional2) {
        C15481g gVar = this.f46448b;
        C15480f.m32212a(aVar, optional2);
        gVar.mo22353c(aVar, Optional.m71637of(this.f46451e.mo22362a(iVar, optional, optional2.map(C15490p.f46435a))));
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo22364b(C12991i iVar) {
        C15478d dVar = this.f46450d;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        return dVar.mo22361a(Long.valueOf(yVar.f40416b));
    }

    /* renamed from: c */
    public final void mo22365c(C37259h hVar, C12991i iVar, C62722b bVar) {
        C15478d dVar = this.f46450d;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        C15470b bVar2 = new C15470b(dVar, Long.valueOf(yVar.f40416b));
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(bVar2), dVar.f46428c);
        C15492r rVar = new C15492r(this, hVar, bVar, iVar);
        C60922j.m93045h(m, C47810es.m84966f(rVar), this.f46449c);
    }

    /* renamed from: d */
    public final void mo22366d(C37252a aVar, C12991i iVar) {
        C15478d dVar = this.f46450d;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        C60870cx a = dVar.mo22361a(Long.valueOf(yVar.f40416b));
        C15491q qVar = new C15491q(this, aVar, iVar);
        C60922j.m93045h(a, C47810es.m84966f(qVar), this.f46449c);
    }
}
