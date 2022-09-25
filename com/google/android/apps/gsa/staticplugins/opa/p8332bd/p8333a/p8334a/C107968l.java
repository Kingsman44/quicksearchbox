package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.content.ComponentName;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8839t.p8847h.C118423bp;
import com.google.android.apps.gsa.p8839t.p8847h.C118424bq;
import com.google.android.apps.gsa.p8839t.p8847h.C118425br;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8839t.p8847h.C118435k;
import com.google.android.apps.gsa.p8839t.p8847h.C118443s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C107968l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300412a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f300413b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f300414c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f300415d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f300416e;

    /* renamed from: f */
    public final /* synthetic */ List f300417f;

    public /* synthetic */ C107968l(C107970n nVar, C58833ax axVar, C53306j jVar, C2164c cVar, C58833ax axVar2, List list) {
        this.f300412a = nVar;
        this.f300413b = axVar;
        this.f300414c = jVar;
        this.f300415d = cVar;
        this.f300416e = axVar2;
        this.f300417f = list;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        ComponentName componentName;
        C31164au auVar;
        C107970n nVar = this.f300412a;
        C58833ax axVar = this.f300413b;
        C53306j jVar = this.f300414c;
        C2164c cVar = this.f300415d;
        C58833ax axVar2 = this.f300416e;
        List list = this.f300417f;
        List list2 = (List) obj;
        if ((axVar.mo56113h() || list2.isEmpty()) && (!axVar.mo56113h() || !list2.contains(axVar.mo56107c()))) {
            if (axVar.mo56113h()) {
                componentName = (ComponentName) axVar.mo56107c();
            } else {
                componentName = !list.isEmpty() ? (ComponentName) list.get(0) : null;
            }
            C60870cx i = C60856cj.m92900i(C58836b.f156633a);
            C31164au b = C31164au.m58092b("PcpV0OnDeviceMediaPerApp_NULL");
            if (componentName != null) {
                i = nVar.f300427f.mo24192a(componentName, C53306j.MAIN_APP, C58485gu.m89845m());
                auVar = C31164au.m58091a(C31164au.m58093c("PcpV0OnDeviceMediaPerApp_", C118443s.m196633a(componentName)), C31164au.m58092b("_"));
            } else {
                auVar = b;
            }
            C118435k kVar = nVar.f300430i;
            C71208ar arVar = (C71208ar) C71209as.f190080g.createBuilder();
            arVar.mo62657b(9);
            arVar.copyOnWrite();
            C71209as asVar = (C71209as) arVar.instance;
            asVar.f190083a |= 1;
            asVar.f190085c = false;
            kVar.mo103700c(i, axVar2, arVar, jVar, auVar);
            new C90873ag(nVar.f300431j.mo28209i(i, "Transform to ClientMediaRecommendations", new C107967k(nVar, jVar)), nVar.f300431j, "Get client media from new fetch future", new C107959c(cVar)).mo85223a(new C107960d(cVar));
            return;
        }
        C118426bs bsVar = nVar.f300425d;
        C60870cx i2 = bsVar.f328693n.mo28209i(C60856cj.m92906o((List) Collection.EL.stream(list2).filter(new C118423bp(new HashSet())).map(new C118424bq(bsVar, C53306j.MAIN_APP)).collect(Collectors.toList())), "Query on-device media apps", C118425br.f328678a);
        new C90873ag(i2, nVar.f300431j, "Get client media recommendations future", new C107957a(nVar, jVar, axVar, cVar)).mo85223a(new C107958b(cVar));
        C118435k kVar2 = nVar.f300430i;
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        C62940bt btVar = C71209as.f190081h;
        C71208ar arVar2 = (C71208ar) C71209as.f190080g.createBuilder();
        arVar2.mo62657b(9);
        arVar2.copyOnWrite();
        C71209as asVar2 = (C71209as) arVar2.instance;
        asVar2.f190083a = 1 | asVar2.f190083a;
        asVar2.f190085c = false;
        apVar.mo58885m(btVar, (C71209as) arVar2.build());
        kVar2.mo103699b(i2, axVar2, (C71207aq) apVar.build(), jVar, C31164au.m58092b("PcpV0OnDeviceMediaGetProactiveContent_"));
    }
}
