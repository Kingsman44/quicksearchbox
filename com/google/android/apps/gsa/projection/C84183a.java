package com.google.android.apps.gsa.projection;

import com.google.android.apps.gsa.binaries.satin.app.C74199om;
import com.google.android.apps.gsa.binaries.satin.app.oo;
import com.google.android.apps.gsa.projection.p6478b.C84186a;
import com.google.android.apps.gsa.projection.p6478b.C84187b;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.projection.a */
/* compiled from: PG */
public final /* synthetic */ class C84183a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C84185b f229160a;

    /* renamed from: b */
    public final /* synthetic */ C142660f f229161b;

    /* renamed from: c */
    public final /* synthetic */ CarAssistantSessionManager.Config f229162c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f229163d;

    /* renamed from: e */
    public final /* synthetic */ int f229164e;

    /* renamed from: f */
    public final /* synthetic */ C58485gu f229165f;

    public /* synthetic */ C84183a(C84185b bVar, C142660f fVar, CarAssistantSessionManager.Config config, C58485gu guVar, int i, C58485gu guVar2) {
        this.f229160a = bVar;
        this.f229161b = fVar;
        this.f229162c = config;
        this.f229163d = guVar;
        this.f229164e = i;
        this.f229165f = guVar2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C84185b bVar = this.f229160a;
        C142660f fVar = this.f229161b;
        CarAssistantSessionManager.Config config = this.f229162c;
        C58485gu guVar = this.f229163d;
        int i = this.f229164e;
        C58485gu guVar2 = this.f229165f;
        C74199om omVar = bVar.f229170a.f229151o;
        fVar.getClass();
        omVar.f207198b = fVar;
        omVar.f207199c = config;
        guVar.getClass();
        omVar.f207200d = guVar;
        omVar.f207201e = new C84187b(i);
        C68225k.m98529a(omVar.f207198b, C142660f.class);
        C68225k.m98529a(omVar.f207199c, CarAssistantSessionManager.Config.class);
        C68225k.m98529a(omVar.f207200d, C58485gu.class);
        C68225k.m98529a(omVar.f207201e, C84187b.class);
        C84186a aVar = (C84186a) new oo(omVar.f207197a, omVar.f207198b, omVar.f207199c, omVar.f207200d, omVar.f207201e).j.mo17428b();
        bVar.f229170a.f229141e.mo77651b(fVar, config);
        bVar.f229170a.f229143g.mo20070h(fVar);
        bVar.f229170a.f229143g.mo20072j(guVar2);
        bVar.f229170a.f229143g.mo20069g(i);
        bVar.f229170a.f229150n = aVar;
        return aVar.mo77655a();
    }
}
