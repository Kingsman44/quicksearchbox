package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9572x;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32813bh;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37029e;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37030f;
import com.google.protobuf.C62942bv;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.pkgcontextdata.PkgContextDataProvider$fetchContext$1", mo61344c = "PkgContextDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.x.c */
/* compiled from: PG */
final class C127273c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350512a;

    /* renamed from: b */
    int f350513b;

    /* renamed from: c */
    final /* synthetic */ C127275e f350514c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127273c(C127275e eVar, C69577g gVar) {
        super(2, gVar);
        this.f350514c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127273c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350513b != 0) {
            obj2 = this.f350512a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127275e eVar = this.f350514c;
            this.f350512a = eVar;
            this.f350513b = 1;
            Object a = eVar.mo108008a(this);
            if (a == aVar) {
                return aVar;
            }
            obj2 = eVar;
            obj = a;
        }
        C37029e eVar2 = (C37029e) C37030f.f96461d.createBuilder();
        C37026b bVar = ((C127275e) obj2).f350518a;
        eVar2.copyOnWrite();
        C37030f fVar = (C37030f) eVar2.instance;
        fVar.f96465b = bVar.f96455p;
        fVar.f96464a |= 1;
        eVar2.mo40544a((List) obj);
        C62942bv build = eVar2.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…extData)\n        .build()");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32813bh bhVar = (C32813bh) C32814bi.f87999a.createBuilder();
        bhVar.mo58885m(C37030f.f96462e, (C37030f) build);
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32814bi biVar = (C32814bi) bhVar.build();
        biVar.getClass();
        awVar.f87981b = biVar;
        awVar.f87980a = 3;
        C62942bv build2 = auVar.build();
        C69664n.m101060f(build2, "newBuilder()\n      .setG…e)\n      )\n      .build()");
        return (C32801aw) build2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127273c(this.f350514c, gVar);
    }
}
