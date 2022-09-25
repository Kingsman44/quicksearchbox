package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.android.libraries.search.p3055n.C39659cm;
import com.google.android.libraries.search.p3055n.p3056a.C39241a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.b.b.av */
/* compiled from: PG */
public final /* synthetic */ class C39301av implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39318bl f103531a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f103532b;

    public /* synthetic */ C39301av(C39318bl blVar, C70862aj ajVar) {
        this.f103531a = blVar;
        this.f103532b = ajVar;
    }

    public final C60870cx apply(Object obj) {
        C39318bl blVar = this.f103531a;
        C70862aj ajVar = this.f103532b;
        C39659cm cmVar = (C39659cm) obj;
        C39658cl a = C39658cl.m69121a(cmVar.f104401b);
        if (a == null) {
            a = C39658cl.DEFAULT_UNKNOWN;
        }
        if (a.equals(C39658cl.SUCCESS)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        if (blVar.f103563d.f103572i.isPresent() && ((C39241a) blVar.f103563d.f103572i.get()).mo41745d() && !((C39241a) blVar.f103563d.f103572i.get()).mo41746e()) {
            C39658cl a2 = C39658cl.m69121a(cmVar.f104401b);
            if (a2 == null) {
                a2 = C39658cl.DEFAULT_UNKNOWN;
            }
            if (a2.equals(C39658cl.SUCCESS)) {
                C39319bm bmVar = blVar.f103563d;
                C60870cx cxVar = bmVar.f103574k;
                C39298as asVar = new C39298as(blVar);
                bmVar.f103574k = C60922j.m93045h(cxVar, C47810es.m84966f(asVar), bmVar.f103566c);
                C46459k.m82829b(blVar.f103563d.f103574k, "Failed to connect to ArtModelService!", new Object[0]);
            }
        }
        C39319bm bmVar2 = blVar.f103563d;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        knVar.mo58885m(C39659cm.f104398f, cmVar);
        return bmVar2.mo41773f(ajVar, (C67087ko) knVar.build());
    }
}
