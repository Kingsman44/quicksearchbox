package com.google.android.libraries.lens.view.p2092c;

import com.google.android.libraries.lens.view.p2067ak.C25266e;
import com.google.android.libraries.lens.view.p2067ak.C25267f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.view.c.j */
/* compiled from: PG */
public final /* synthetic */ class C25714j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C25720p f69917a;

    public /* synthetic */ C25714j(C25720p pVar) {
        this.f69917a = pVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C25720p pVar = this.f69917a;
        C25267f d = pVar.f69929e.mo30348d();
        long b = pVar.f69930f.mo26870b();
        long millis = Duration.ofDays(28).toMillis();
        C25266e eVar = (C25266e) d.toBuilder();
        eVar.copyOnWrite();
        ((C25267f) eVar.instance).f68740c = C25267f.emptyLongList();
        eVar.copyOnWrite();
        C25267f fVar = (C25267f) eVar.instance;
        fVar.mo30365a();
        C62947c.addAll((Iterable) Collection.EL.stream(d.f68740c).filter(new C25717m(b - millis)).limit(10).collect(Collectors.toCollection(C25718n.f69921a)), (List) fVar.f68740c);
        eVar.copyOnWrite();
        C25267f fVar2 = (C25267f) eVar.instance;
        fVar2.mo30365a();
        fVar2.f68740c.mo58929f(b);
        C25267f fVar3 = (C25267f) eVar.build();
        pVar.f69929e.mo30354j(fVar3);
        C25727w wVar = pVar.f69927c;
        C25722r rVar = new C25722r(wVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(rVar), wVar.f69952b);
        C25719o oVar = new C25719o(pVar, fVar3);
        return C60922j.m93044g(m, C47810es.m84963c(oVar), pVar.f69931g);
    }
}
