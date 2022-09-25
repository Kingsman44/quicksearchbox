package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.i */
/* compiled from: PG */
public final class C34619i implements C34616f {

    /* renamed from: a */
    private final C34636z f91937a;

    /* renamed from: b */
    private final C71422aw f91938b;

    public C34619i(C34636z zVar, C71422aw awVar) {
        C69664n.m101061g(zVar, "stub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91937a = zVar;
        this.f91938b = awVar;
    }

    /* renamed from: a */
    public final C34618h mo39452a(C34623m mVar) {
        C69664n.m101061g(mVar, "mode");
        C34611a aVar = (C34611a) C34613c.f91928d.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        if (C34617g.f91935a[mVar.ordinal()] == 1) {
            C34612b bVar = C34612b.MODE_DEFAULT;
            C69664n.m101061g(bVar, "value");
            aVar.copyOnWrite();
            C34613c cVar = (C34613c) aVar.instance;
            cVar.f91931b = bVar.getNumber();
            cVar.f91930a |= 1;
            aVar.copyOnWrite();
            C34613c cVar2 = (C34613c) aVar.instance;
            cVar2.f91930a |= 2;
            cVar2.f91932c = "Listening to user query";
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C34613c cVar3 = (C34613c) build;
            C34636z zVar = this.f91937a;
            C70334de deVar = new C70334de();
            C69664n.m101061g(cVar3, "request");
            return new C34618h(C71594u.m104517d(C70748n.m103449b(zVar.f189039a, C34633w.m63360a(), cVar3, zVar.f189040b, deVar), this.f91938b));
        }
        throw new C69677g();
    }
}
