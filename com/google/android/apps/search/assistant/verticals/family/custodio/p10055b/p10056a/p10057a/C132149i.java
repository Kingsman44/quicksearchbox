package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p427am.p432b.p433a.C8648b;
import com.google.p427am.p432b.p433a.C8658bj;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8673c;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C132149i implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C132161u f360699a;

    /* renamed from: b */
    public final /* synthetic */ C8658bj f360700b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f360701c;

    /* renamed from: d */
    public final /* synthetic */ C132160t f360702d;

    public /* synthetic */ C132149i(C132161u uVar, C8658bj bjVar, C58485gu guVar, C132160t tVar) {
        this.f360699a = uVar;
        this.f360700b = bjVar;
        this.f360701c = guVar;
        this.f360702d = tVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C132161u uVar = this.f360699a;
        C8658bj bjVar = this.f360700b;
        C58485gu guVar = this.f360701c;
        C132160t tVar = this.f360702d;
        C8648b bVar = uVar.f360725c;
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C8673c.f29987a;
        if (diVar == null) {
            synchronized (C8673c.class) {
                diVar = C8673c.f29987a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.home.foyer.v1.AssistantFamilyService", "GetAccountCustodioInfo");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8658bj.f29956d);
                    d.f187486b = C70850d.m103697c(C8660bl.f29961c);
                    diVar = d.mo62040a();
                    C8673c.f29987a = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), bjVar);
        C132148h hVar = new C132148h(uVar, guVar, tVar);
        return C60922j.m93045h(a, C47810es.m84966f(hVar), C60826bg.f164896a);
    }
}
