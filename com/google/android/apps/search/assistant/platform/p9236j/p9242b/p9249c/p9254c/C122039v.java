package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121950k;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$subscribeToEvents$subscription$1", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.v */
/* compiled from: PG */
final class C122039v extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C121992ab f338590a;

    /* renamed from: b */
    final /* synthetic */ C121950k f338591b;

    /* renamed from: c */
    private /* synthetic */ Object f338592c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122039v(C121992ab abVar, C121950k kVar, C69577g gVar) {
        super(2, gVar);
        this.f338590a = abVar;
        this.f338591b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122039v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C122000aj ajVar = this.f338590a.f338521c;
        C122027j jVar = (C122027j) C122028k.f338568a.createBuilder();
        C69664n.m101060f(jVar, "newBuilder()");
        C69664n.m101061g(jVar, "builder");
        C62942bv build = jVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C122028k kVar = (C122028k) build;
        C70334de deVar = new C70334de();
        C69664n.m101061g(kVar, "request");
        C71594u.m104517d(C121992ab.m201495d(C71536cm.m104384b(C71477ah.m104296c(C70748n.m103449b(ajVar.f189039a, C121995ae.m201502b(), kVar, ajVar.f189040b, deVar), new C122037t((C69577g) null)), new C122038u(this.f338591b, (C69577g) null)), "subscribeToEvents"), (C71422aw) this.f338592c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122039v vVar = new C122039v(this.f338590a, this.f338591b, gVar);
        vVar.f338592c = obj;
        return vVar;
    }
}
