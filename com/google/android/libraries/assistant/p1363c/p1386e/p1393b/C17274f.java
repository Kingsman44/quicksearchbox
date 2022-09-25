package com.google.android.libraries.assistant.p1363c.p1386e.p1393b;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17233b;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17250o;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1391d.C17265g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52429rk;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64301at;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64302au;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64303av;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64304aw;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64324bp;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b.C65425a;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b.C65426b;
import com.google.speech.p5208h.C66652ds;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.e.b.f */
/* compiled from: PG */
public final class C17274f implements C17269a {

    /* renamed from: a */
    private final C60887da f50063a;

    /* renamed from: b */
    private final C17265g f50064b;

    /* renamed from: c */
    private final C66652ds f50065c;

    /* renamed from: d */
    private final C17250o f50066d;

    public C17274f(C17250o oVar, C60887da daVar, C17265g gVar, C66652ds dsVar) {
        C69664n.m101061g(daVar, "lightweightExecutor");
        C69664n.m101061g(dsVar, "s3StubbyClientConnectorService");
        this.f50066d = oVar;
        this.f50063a = daVar;
        this.f50064b = gVar;
        this.f50065c = dsVar;
    }

    /* renamed from: a */
    public final C60870cx mo23259a(C64302au auVar) {
        C69664n.m101061g(auVar, "request");
        C62934bn builder = auVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C64301at atVar = (C64301at) builder;
        C69664n.m101061g(atVar, "builder");
        C65425a aVar = (C65425a) C65426b.f177860c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C52429rk rkVar = (C52429rk) C52432rn.f137634c.createBuilder();
        C69664n.m101060f(rkVar, "newBuilder()");
        C69664n.m101061g(rkVar, "builder");
        C52431rm rmVar = C52431rm.OPA_AGSA;
        C69664n.m101061g(rmVar, "value");
        rkVar.copyOnWrite();
        C52432rn rnVar = (C52432rn) rkVar.instance;
        rnVar.f137637b = rmVar.f137633ah;
        rnVar.f137636a |= 1;
        C62942bv build = rkVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C52432rn rnVar2 = (C52432rn) build;
        C69664n.m101061g(rnVar2, "value");
        aVar.copyOnWrite();
        C65426b bVar = (C65426b) aVar.instance;
        rnVar2.getClass();
        bVar.f177863b = rnVar2;
        bVar.f177862a |= 1;
        C62942bv build2 = aVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C65426b bVar2 = (C65426b) build2;
        C69664n.m101061g(bVar2, "value");
        atVar.copyOnWrite();
        C64302au auVar2 = (C64302au) atVar.instance;
        bVar2.getClass();
        auVar2.f173859e = bVar2;
        auVar2.f173855a |= 64;
        C62942bv build3 = atVar.build();
        C69664n.m101060f(build3, "_builder.build()");
        C64302au auVar3 = (C64302au) build3;
        C64303av avVar = (C64303av) C64304aw.f173865b.createBuilder();
        C69664n.m101060f(avVar, "newBuilder()");
        C17250o oVar = this.f50066d;
        C64279a aVar2 = (C64279a) C64308b.f173874c.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C64324bp a = C69664n.m101061g(aVar2, "builder");
        a.mo59272b(auVar3);
        return C60922j.m93044g(oVar.mo23251a(C69540x.m100947e(this.f50064b.mo23255a(auVar3.f173858d, false), new C17271c(a.mo59271a())), C69540x.m100944b(new C17273e(avVar)), this.f50065c, (C17233b) null).mo23243a(), C47810es.m84963c(new C17272d(avVar)), this.f50063a);
    }
}
