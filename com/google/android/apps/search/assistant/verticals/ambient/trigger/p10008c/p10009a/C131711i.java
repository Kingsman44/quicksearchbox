package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130679b;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130683e;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130692n;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130693o;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131687a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.i */
/* compiled from: PG */
final class C131711i implements C131713d {

    /* renamed from: a */
    final Function f359823a;

    /* renamed from: b */
    final /* synthetic */ C131712j f359824b;

    public C131711i(C131712j jVar, Function function) {
        this.f359824b = jVar;
        this.f359823a = function;
    }

    /* renamed from: a */
    public final C60870cx mo110075a(C131701c cVar) {
        C130679b bVar = this.f359824b.f359829e;
        C130692n nVar = (C130692n) C130693o.f357860d.createBuilder();
        C53715bm bmVar = (C53715bm) this.f359823a.apply(cVar);
        nVar.copyOnWrite();
        C130693o oVar = (C130693o) nVar.instance;
        bmVar.getClass();
        oVar.f357863b = bmVar;
        oVar.f357862a |= 1;
        long j = ((C131687a) cVar).f359795b;
        nVar.copyOnWrite();
        C130693o oVar2 = (C130693o) nVar.instance;
        oVar2.f357862a |= 2;
        oVar2.f357864c = j;
        C60870cx a = C70876o.m103760a(bVar.f189039a.mo39510a(C130683e.m213079c(), bVar.f189040b), (C130693o) nVar.build());
        C60856cj.m92911t(a, C47810es.m84974n(new C131710h(this)), this.f359824b.f359828d);
        return C60922j.m93044g(a, C47810es.m84963c(C131709g.f359821a), this.f359824b.f359828d);
    }
}
