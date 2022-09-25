package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.hotword.architecture.HotwordArchitectureAccessor$getHotwordArchitecture$1", mo61344c = "HotwordArchitectureAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.h */
/* compiled from: PG */
final class C34135h extends C69572j implements C69630p {

    /* renamed from: a */
    int f90891a;

    /* renamed from: b */
    final /* synthetic */ C34137j f90892b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34135h(C34137j jVar, C69577g gVar) {
        super(2, gVar);
        this.f90892b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34135h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90891a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34145r rVar = this.f90892b.f90894a;
            C34149v vVar = (C34149v) C34150w.f90916a.createBuilder();
            C69664n.m101060f(vVar, "newBuilder()");
            C69664n.m101061g(vVar, "builder");
            C62942bv build = vVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f90891a = 1;
            obj = rVar.mo39230b((C34150w) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C34153z zVar = (C34153z) obj;
        C34152y a = C34152y.m62768a(zVar.f90926a);
        if (a == null) {
            a = C34152y.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return C34134g.LEGACY;
        }
        if (ordinal == 2) {
            return C34134g.HDM;
        }
        C34152y a2 = C34152y.m62768a(zVar.f90926a);
        if (a2 == null) {
            a2 = C34152y.UNRECOGNIZED;
        }
        throw new IllegalStateException("Unexpected value received: " + a2 + ".");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34135h(this.f90892b, gVar);
    }
}
