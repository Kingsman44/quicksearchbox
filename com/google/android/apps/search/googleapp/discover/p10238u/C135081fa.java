package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$getNextPageRequestMaker$2$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {441})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.fa */
/* compiled from: PG */
final class C135081fa extends C69572j implements C69630p {

    /* renamed from: a */
    int f367902a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367903b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367904c;

    /* renamed from: d */
    final /* synthetic */ UUID f367905d;

    /* renamed from: e */
    final /* synthetic */ C57259bn f367906e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135081fa(C135086ff ffVar, C57303dd ddVar, UUID uuid, C57259bn bnVar, C69577g gVar) {
        super(2, gVar);
        this.f367903b = ffVar;
        this.f367904c = ddVar;
        this.f367905d = uuid;
        this.f367906e = bnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135081fa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367902a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134980bl blVar = this.f367903b.f367918c;
            C57303dd ddVar = this.f367904c;
            UUID uuid = this.f367905d;
            C57259bn bnVar = this.f367906e;
            this.f367902a = 1;
            obj = C71803m.m105040a(blVar.f367552d, new C134973be(blVar, uuid, bnVar, ddVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135081fa(this.f367903b, this.f367904c, this.f367905d, this.f367906e, gVar);
    }
}
