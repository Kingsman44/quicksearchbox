package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.android.apps.gsa.binaries.satin.app.C74257ri;
import com.google.android.apps.gsa.binaries.satin.app.rk;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.p4450a.C57934a;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5294a.C68225k;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C123233f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123237j f340941a;

    /* renamed from: b */
    public final /* synthetic */ C66607ce f340942b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f340943c;

    /* renamed from: d */
    public final /* synthetic */ C70862aj f340944d;

    public /* synthetic */ C123233f(C123237j jVar, C66607ce ceVar, C70862aj ajVar, C70862aj ajVar2) {
        this.f340941a = jVar;
        this.f340942b = ceVar;
        this.f340943c = ajVar;
        this.f340944d = ajVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123237j jVar = this.f340941a;
        C66607ce ceVar = this.f340942b;
        C70862aj ajVar = this.f340943c;
        C70862aj ajVar2 = this.f340944d;
        C123238k kVar = jVar.f340952c;
        ((C59052c) ((C59052c) C123238k.f340954a.mo56224b()).mo56372aa(34957)).mo56386p("Start mutating initial request to S3");
        C74257ri riVar = (C74257ri) kVar.f340955b.mo17428b();
        riVar.f207707d = kVar.f340957d.mo54628a("InitialRequest");
        C66606cd cdVar = (C66606cd) ceVar.toBuilder();
        cdVar.getClass();
        riVar.f207706c = cdVar;
        C68225k.m98529a(riVar.f207706c, C66606cd.class);
        C68225k.m98529a(riVar.f207707d, C57934a.class);
        C60870cx gq = new rk(riVar.f207704a, riVar.f207705b, riVar.f207706c, riVar.f207707d).b.mo60297gq();
        C123231d dVar = new C123231d(ajVar);
        C60870cx g = C60922j.m93044g(gq, C47810es.m84963c(dVar), C60826bg.f164896a);
        C123232e eVar = new C123232e(ajVar2, ajVar);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(eVar), C60826bg.f164896a);
    }
}
