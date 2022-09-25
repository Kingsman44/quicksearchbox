package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b.C126481f;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$createNew$2$1$clientInfoAsync$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {112})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.k */
/* compiled from: PG */
final class C126588k extends C69572j implements C69630p {

    /* renamed from: a */
    int f348599a;

    /* renamed from: b */
    final /* synthetic */ C126449aa f348600b;

    /* renamed from: c */
    final /* synthetic */ C71604be f348601c;

    /* renamed from: d */
    final /* synthetic */ C71604be f348602d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126588k(C126449aa aaVar, C71604be beVar, C71604be beVar2, C69577g gVar) {
        super(2, gVar);
        this.f348600b = aaVar;
        this.f348601c = beVar;
        this.f348602d = beVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126588k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348599a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126449aa aaVar = this.f348600b;
            C126481f fVar = aaVar.f348255j;
            C71604be beVar = this.f348601c;
            C71604be beVar2 = this.f348602d;
            C18460aw awVar = aaVar.f348253h;
            this.f348599a = 1;
            obj = fVar.mo107620a(beVar, beVar2, awVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126588k(this.f348600b, this.f348601c, this.f348602d, gVar);
    }
}
