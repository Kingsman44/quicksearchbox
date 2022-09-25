package com.google.android.apps.search.googleapp.discover.p10249z;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.StreamProvider$runWithPrechecks$2", mo61344c = "StreamProvider.kt", mo61345d = "invokeSuspend", mo61346e = {266})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.as */
/* compiled from: PG */
final class C135312as extends C69572j implements C69630p {

    /* renamed from: a */
    int f368643a;

    /* renamed from: b */
    final /* synthetic */ C69630p f368644b;

    /* renamed from: c */
    private /* synthetic */ Object f368645c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135312as(C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f368644b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135312as) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368643a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69630p pVar = this.f368644b;
            this.f368643a = 1;
            obj = pVar.mo5192a((C71422aw) this.f368645c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135312as asVar = new C135312as(this.f368644b, gVar);
        asVar.f368645c = obj;
        return asVar;
    }
}
