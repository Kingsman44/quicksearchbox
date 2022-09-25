package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9552d;

import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32492e;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32493f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32813bh;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.protobuf.C62940bt;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.appactionsinventory.AppActionsInventoryProvider$fetchContext$1", mo61344c = "AppActionsInventoryProvider.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.d.a */
/* compiled from: PG */
final class C127213a extends C69572j implements C69630p {

    /* renamed from: a */
    int f350258a;

    /* renamed from: b */
    final /* synthetic */ C127215c f350259b;

    /* renamed from: c */
    final /* synthetic */ List f350260c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127213a(C127215c cVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f350259b = cVar;
        this.f350260c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127213a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350258a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127215c cVar = this.f350259b;
            List list = this.f350260c;
            this.f350258a = 1;
            obj = cVar.mo107996a(list, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32836cd cdVar = C127215c.f350264a;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32813bh bhVar = (C32813bh) C32814bi.f87999a.createBuilder();
        C62940bt btVar = C32493f.f87068e;
        C32492e eVar = (C32492e) C32493f.f87067d.createBuilder();
        eVar.mo38111a((List) obj);
        bhVar.mo58885m(btVar, eVar.build());
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32814bi biVar = (C32814bi) bhVar.build();
        biVar.getClass();
        awVar.f87981b = biVar;
        awVar.f87980a = 3;
        C62942bv build = auVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .setG… )\n      )\n      .build()");
        return (C32801aw) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127213a(this.f350259b, this.f350260c, gVar);
    }
}
