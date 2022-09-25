package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestBuilder$buildGrpcFeedback$2", mo61344c = "RequestBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.du */
/* compiled from: PG */
final class C135047du extends C69572j implements C69630p {

    /* renamed from: a */
    int f367753a;

    /* renamed from: b */
    final /* synthetic */ C135049dw f367754b;

    /* renamed from: c */
    final /* synthetic */ C58485gu f367755c;

    /* renamed from: d */
    final /* synthetic */ C57303dd f367756d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135047du(C135049dw dwVar, C58485gu guVar, C57303dd ddVar, C69577g gVar) {
        super(2, gVar);
        this.f367754b = dwVar;
        this.f367755c = guVar;
        this.f367756d = ddVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135047du) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367753a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135049dw dwVar = this.f367754b;
            C58485gu guVar = this.f367755c;
            C57303dd ddVar = this.f367756d;
            this.f367753a = 1;
            obj = C71423ax.m104196a(new C135045ds(ddVar, dwVar, guVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135047du(this.f367754b, this.f367755c, this.f367756d, gVar);
    }
}
