package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestBuilder$buildGrpc$2", mo61344c = "RequestBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.dt */
/* compiled from: PG */
final class C135046dt extends C69572j implements C69630p {

    /* renamed from: a */
    int f367745a;

    /* renamed from: b */
    final /* synthetic */ C135049dw f367746b;

    /* renamed from: c */
    final /* synthetic */ C57259bn f367747c;

    /* renamed from: d */
    final /* synthetic */ C57340w f367748d;

    /* renamed from: e */
    final /* synthetic */ C134991bw f367749e;

    /* renamed from: f */
    final /* synthetic */ C57252bg f367750f;

    /* renamed from: g */
    final /* synthetic */ String f367751g;

    /* renamed from: h */
    final /* synthetic */ C57286cn f367752h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135046dt(C135049dw dwVar, C57259bn bnVar, C57340w wVar, C134991bw bwVar, C57252bg bgVar, String str, C57286cn cnVar, C69577g gVar) {
        super(2, gVar);
        this.f367746b = dwVar;
        this.f367747c = bnVar;
        this.f367748d = wVar;
        this.f367749e = bwVar;
        this.f367750f = bgVar;
        this.f367751g = str;
        this.f367752h = cnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135046dt) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367745a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135049dw dwVar = this.f367746b;
            C57259bn bnVar = this.f367747c;
            C57340w wVar = this.f367748d;
            C134991bw bwVar = this.f367749e;
            C57252bg bgVar = this.f367750f;
            String str = this.f367751g;
            C57286cn cnVar = this.f367752h;
            this.f367745a = 1;
            obj = dwVar.mo112110b(bnVar, wVar, bwVar, bgVar, true, str, cnVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135046dt(this.f367746b, this.f367747c, this.f367748d, this.f367749e, this.f367750f, this.f367751g, this.f367752h, gVar);
    }
}
