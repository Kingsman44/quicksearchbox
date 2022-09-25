package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10203o.C134472a;
import com.google.android.apps.search.googleapp.discover.p10203o.C134475d;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57281ci;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57282cj;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientInfoBuilder$getMinusOneInfo$2", mo61344c = "ClientInfoBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {119})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.t */
/* compiled from: PG */
final class C135121t extends C69572j implements C69630p {

    /* renamed from: a */
    int f368016a;

    /* renamed from: b */
    final /* synthetic */ C135123v f368017b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135121t(C135123v vVar, C69577g gVar) {
        super(2, gVar);
        this.f368017b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135121t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368016a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134475d dVar = this.f368017b.f368026g;
            this.f368016a = 1;
            obj = C71803m.m105040a(dVar.f366235d, new C134472a(dVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Instant instant = (Instant) obj;
        if (C69664n.m101066l(instant, Instant.EPOCH)) {
            return null;
        }
        C135123v vVar = this.f368017b;
        C57281ci ciVar = (C57281ci) C57282cj.f152915c.createBuilder();
        C69664n.m101060f(ciVar, "newBuilder()");
        C69664n.m101061g(ciVar, "builder");
        Duration between = Duration.between(instant, vVar.f368028i.mo57444a());
        C69664n.m101060f(between, "between(lastLoadTime, timeSource.now())");
        C62910ar a = C62949a.m95466a(between);
        C69664n.m101061g(a, "value");
        ciVar.copyOnWrite();
        C57282cj cjVar = (C57282cj) ciVar.instance;
        a.getClass();
        cjVar.f152918b = a;
        cjVar.f152917a |= 1;
        C62942bv build = ciVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C57282cj) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135121t(this.f368017b, gVar);
    }
}
