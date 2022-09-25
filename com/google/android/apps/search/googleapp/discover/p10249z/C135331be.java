package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.TreeBinder$getStreamSubtree$2$2", mo61344c = "TreeBinder.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.be */
/* compiled from: PG */
final class C135331be extends C69572j implements C69630p {

    /* renamed from: a */
    int f368699a;

    /* renamed from: b */
    final /* synthetic */ C135335bi f368700b;

    /* renamed from: c */
    final /* synthetic */ C135336bj f368701c;

    /* renamed from: d */
    final /* synthetic */ C134766q f368702d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135331be(C135335bi biVar, C135336bj bjVar, C134766q qVar, C69577g gVar) {
        super(2, gVar);
        this.f368700b = biVar;
        this.f368701c = bjVar;
        this.f368702d = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135331be) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368699a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135335bi biVar = this.f368700b;
            C135336bj bjVar = this.f368701c;
            C134766q qVar = this.f368702d;
            this.f368699a = 1;
            if (biVar.mo112272f(bjVar, qVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135331be(this.f368700b, this.f368701c, this.f368702d, gVar);
    }
}
