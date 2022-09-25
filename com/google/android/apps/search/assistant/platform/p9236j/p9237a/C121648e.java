package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$onDirectActionsInvalidated$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {90, 92})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.e */
/* compiled from: PG */
final class C121648e extends C69572j implements C69630p {

    /* renamed from: a */
    int f337515a;

    /* renamed from: b */
    final /* synthetic */ C121655l f337516b;

    /* renamed from: c */
    final /* synthetic */ C33883a f337517c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121648e(C121655l lVar, C33883a aVar, C69577g gVar) {
        super(2, gVar);
        this.f337516b = lVar;
        this.f337517c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121648e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f337515a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C121655l lVar = this.f337516b;
            this.f337515a = 1;
            obj = lVar.mo105282g(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return null;
        } else {
            C69714l.m101134b(obj);
        }
        C121633df dfVar = (C121633df) obj;
        C121551ae aeVar = (C121551ae) C121552af.f337295b.createBuilder();
        C69664n.m101060f(aeVar, "newBuilder()");
        C69664n.m101061g(aeVar, "builder");
        C62942bv build = aeVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C121552af afVar = (C121552af) build;
        C70334de deVar = new C70334de();
        C69664n.m101061g(afVar, "request");
        C71587n b = C70748n.m103449b(dfVar.f189039a, C121624cx.m200961a(), afVar, dfVar.f189040b, deVar);
        C121627d dVar = new C121627d(this.f337517c);
        this.f337515a = 2;
        if (b.mo38165mp(dVar, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121648e(this.f337516b, this.f337517c, gVar);
    }
}
