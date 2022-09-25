package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$createNew$2$1$params$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.m */
/* compiled from: PG */
final class C126590m extends C69572j implements C69630p {

    /* renamed from: a */
    int f348605a;

    /* renamed from: b */
    final /* synthetic */ C126449aa f348606b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126590m(C126449aa aaVar, C69577g gVar) {
        super(2, gVar);
        this.f348606b = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126590m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348605a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126449aa aaVar = this.f348606b;
            C18460aw awVar = aaVar.f348253h;
            C126436e eVar = aaVar.f348252g;
            this.f348605a = 1;
            obj = aaVar.mo107618c(awVar, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126590m(this.f348606b, gVar);
    }
}
