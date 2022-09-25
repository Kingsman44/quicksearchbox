package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.gms.p10725a.p10730b.C142677d;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientInfoBuilder$getAdvertisingInfoId$2", mo61344c = "ClientInfoBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.p */
/* compiled from: PG */
final class C135117p extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C135123v f368004a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135117p(C135123v vVar, C69577g gVar) {
        super(2, gVar);
        this.f368004a = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135117p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        try {
            return C142677d.m231497b(this.f368004a.f368024e);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135117p(this.f368004a, gVar);
    }
}
