package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57282cj;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57312dm;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57313dn;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientInfoBuilder$getTngDiscoverAndroidClientInfo$2", mo61344c = "ClientInfoBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.u */
/* compiled from: PG */
final class C135122u extends C69572j implements C69630p {

    /* renamed from: a */
    int f368018a;

    /* renamed from: b */
    final /* synthetic */ C135123v f368019b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135122u(C135123v vVar, C69577g gVar) {
        super(2, gVar);
        this.f368019b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135122u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368018a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135123v vVar = this.f368019b;
            this.f368018a = 1;
            obj = C71803m.m105040a(vVar.f368022c, new C135121t(vVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C57282cj cjVar = (C57282cj) obj;
        if (cjVar == null) {
            return null;
        }
        C57312dm dmVar = (C57312dm) C57313dn.f152981c.createBuilder();
        C69664n.m101060f(dmVar, "newBuilder()");
        C69664n.m101061g(dmVar, "builder");
        dmVar.copyOnWrite();
        C57313dn dnVar = (C57313dn) dmVar.instance;
        dnVar.f152985b = cjVar;
        dnVar.f152984a |= 1;
        C62942bv build = dmVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C57313dn) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135122u(this.f368019b, gVar);
    }
}
