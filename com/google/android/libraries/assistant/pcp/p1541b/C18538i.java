package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1552c.C18607b;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1554e.C18649as;
import com.google.android.libraries.assistant.pcp.p1554e.C18650at;
import com.google.android.libraries.assistant.pcp.p1554e.C18667r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.b.i */
/* compiled from: PG */
public final /* synthetic */ class C18538i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52527a;

    public /* synthetic */ C18538i(C18551v vVar) {
        this.f52527a = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18551v vVar = this.f52527a;
        C18579g gVar = (C18579g) obj;
        C18650at atVar = (C18650at) vVar.f52557a;
        C58528ij ijVar = atVar.f52679c;
        C60870cx d = atVar.mo24095d();
        C18649as asVar = new C18649as(gVar, ijVar);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(asVar), atVar.f52678b);
        C60870cx d2 = vVar.f52561e.f52632a.mo46042d();
        C18607b bVar = new C18607b(gVar);
        C60870cx g2 = C60922j.m93044g(d2, C47810es.m84963c(bVar), C60826bg.f164896a);
        C18650at atVar2 = (C18650at) vVar.f52557a;
        C58528ij ijVar2 = atVar2.f52679c;
        C60870cx d3 = atVar2.mo24095d();
        C18667r rVar = new C18667r(ijVar2, gVar);
        C60870cx g3 = C60922j.m93044g(d3, C47810es.m84963c(rVar), atVar2.f52678b);
        return C47638k.m84753d(g, g3, g2).mo51521b(new C18536g(g2, g3, g, gVar), vVar.f52560d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
