package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8839t.p8847h.C118435k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57738b;
import com.google.protobuf.C62940bt;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C107969m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300418a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f300419b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f300420c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f300421d;

    public /* synthetic */ C107969m(C107970n nVar, C58833ax axVar, C53306j jVar, C2164c cVar) {
        this.f300418a = nVar;
        this.f300419b = axVar;
        this.f300420c = jVar;
        this.f300421d = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107970n nVar = this.f300418a;
        C58833ax axVar = this.f300419b;
        C53306j jVar = this.f300420c;
        C2164c cVar = this.f300421d;
        ((C59052c) ((C59052c) ((C59052c) C107970n.f300422a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(26925)).mo56386p("Failure in retrieving canFetchFromCache.");
        C118435k kVar = nVar.f300430i;
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        C62940bt btVar = C71209as.f190081h;
        C71208ar arVar = (C71208ar) C71209as.f190080g.createBuilder();
        arVar.mo62657b(9);
        arVar.copyOnWrite();
        C71209as asVar = (C71209as) arVar.instance;
        asVar.f190083a |= 1;
        asVar.f190085c = false;
        apVar.mo58885m(btVar, (C71209as) arVar.build());
        kVar.mo103702e(axVar, (C71207aq) apVar.build(), 3, jVar, C31164au.m58092b("PcpV0OnDeviceMediaGetProactiveContent_"));
        cVar.mo5437b(C57738b.f154252b);
    }
}
