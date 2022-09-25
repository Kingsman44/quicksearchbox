package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.apps.gsa.binaries.satin.app.amu;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import com.google.android.libraries.search.assistant.p2703l.C34790d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58479go;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70888j;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cj */
/* compiled from: PG */
public final class C32668cj implements C32904f {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f87557a = C59071e.m91331h();

    /* renamed from: b */
    private final C34790d f87558b;

    /* renamed from: c */
    private final C68214a f87559c;

    /* renamed from: d */
    private final boolean f87560d;

    /* renamed from: e */
    private final C58889cz f87561e;

    /* renamed from: f */
    private final amu f87562f;

    public C32668cj(C34790d dVar, amu amu, C68214a aVar, boolean z, C58889cz czVar) {
        C69664n.m101061g(dVar, "dynamicServiceConnector");
        C69664n.m101061g(amu, "sessionImplFactory");
        C69664n.m101061g(aVar, "lazyRootParentSessionStub");
        C69664n.m101061g(czVar, "ticker");
        this.f87558b = dVar;
        this.f87562f = amu;
        this.f87559c = aVar;
        this.f87560d = z;
        this.f87561e = czVar;
    }

    /* renamed from: d */
    private final C32870p m60561d(C32849cq cqVar) {
        C34793g gVar = C32681cw.m60576a(cqVar).f88065a;
        if (gVar == null) {
            gVar = C34793g.f92320c;
        }
        C69664n.m101060f(gVar, "parentSessionToken.parse…ls().sourceServiceAddress");
        try {
            C70888j a = this.f87558b.mo39512a(gVar);
            C69664n.m101060f(a, "dynamicServiceConnector.…ctTo(parentSourceAddress)");
            return new C32870p(a);
        } catch (Throwable th) {
            throw new IllegalStateException("Could not connect to the parent SourceService", th);
        }
    }

    /* renamed from: a */
    public final C32881e mo38224a(String str, Iterable iterable) {
        C69664n.m101061g(iterable, "providers");
        C58872ci d = C58872ci.m90947d(this.f87561e);
        C32716ed a = this.f87562f.a(C32717ee.m60644a(str), new C32666ch(this), C58479go.m89809a(iterable), 1500000);
        C34793g gVar = C32681cw.m60576a(a.mo38265b()).f88065a;
        if (gVar == null) {
            gVar = C34793g.f92320c;
        }
        String str2 = gVar.f92323b;
        C69664n.m101060f(str2, "session.sessionToken.par…erviceAddress.processName");
        C59052c cVar = (C59052c) f87557a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger.atInfo()");
        C59052c a2 = C32692dg.m60595a(cVar, a.f87687d);
        a2.mo56379ah(new C59094n(50592));
        a2.mo56389s("Created Session in :%s", str2);
        Duration ofNanos = Duration.ofNanos(d.mo56159b());
        C69664n.m101060f(ofNanos, "startupStopwatch.elapsed()");
        a.mo38268d(ofNanos);
        return a;
    }

    /* renamed from: b */
    public final C32881e mo38225b(C32849cq cqVar, Iterable iterable) {
        C69664n.m101061g(cqVar, "parentSessionToken");
        C69664n.m101061g(iterable, "providers");
        C58872ci d = C58872ci.m90947d(this.f87561e);
        C32716ed a = this.f87562f.a(C32717ee.m60644a("TNG:MA-child"), new C32665cg(m60561d(cqVar), cqVar, (C69577g) null), C58479go.m89809a(iterable), 1500000);
        C34793g gVar = C32681cw.m60576a(a.mo38265b()).f88065a;
        if (gVar == null) {
            gVar = C34793g.f92320c;
        }
        String str = gVar.f92323b;
        C69664n.m101060f(str, "session.sessionToken.par…erviceAddress.processName");
        C59052c cVar = (C59052c) f87557a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger\n      .atInfo()");
        C59052c a2 = C32692dg.m60595a(cVar, a.f87687d);
        String c = C32692dg.m60597c(cqVar);
        a2.mo56379ah(new C59094n(50591));
        a2.mo56354G("Created child Session (parent Session %s) in :%s", c, str);
        Duration ofNanos = Duration.ofNanos(d.mo56159b());
        C69664n.m101060f(ofNanos, "startupStopwatch.elapsed()");
        a.mo38268d(ofNanos);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38226c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32667ci
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.f.a.b.ci r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32667ci) r0
            int r1 = r0.f87556d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87556d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ci r0 = new com.google.android.libraries.search.assistant.f.a.b.ci
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f87554b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87556d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f87553a
            p5462h.C69714l.m101134b(r6)
            goto L_0x006d
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            boolean r6 = r5.f87560d
            if (r6 != 0) goto L_0x003a
            r6 = 0
            goto L_0x007b
        L_0x003a:
            dagger.a r6 = r5.f87559c
            java.lang.Object r6 = r6.mo27525b()
            java.lang.String r2 = "lazyRootParentSessionStub.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            com.google.android.libraries.search.assistant.f.a.d.co r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32847co) r6
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protobuf.as r2 = (com.google.protobuf.C62911as) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.protobuf.av r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.protobuf.at r2 = r2.mo58809a()
            r0.f87553a = r5
            r0.f87556d = r3
            io.grpc.de r3 = new io.grpc.de
            r3.<init>()
            java.lang.Object r6 = r6.mo38324b(r2, r3, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r0 = r5
        L_0x006d:
            com.google.android.libraries.search.assistant.f.a.d.cq r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r6
            com.google.android.libraries.search.assistant.f.a.b.cj r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32668cj) r0
            com.google.android.libraries.search.assistant.f.a.d.p r0 = r0.m60561d(r6)
            com.google.android.libraries.search.assistant.f.a.b.dw r1 = new com.google.android.libraries.search.assistant.f.a.b.dw
            r1.<init>(r0, r6)
            r6 = r1
        L_0x007b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32668cj.mo38226c(h.c.g):java.lang.Object");
    }
}
