package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.apps.gsa.binaries.satin.app.C73931amp;
import com.google.android.apps.gsa.binaries.satin.app.amq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32778a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32832c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32859e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32860f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32862h;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32917b;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32914i;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32922e;
import com.google.android.libraries.search.assistant.p2703l.C34790d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.p2703l.C34794h;
import com.google.android.libraries.search.assistant.p2703l.C34798l;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5479i.C69690e;
import p5462h.p5479i.C69691f;
import p5488io.grpc.C70888j;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bw */
/* compiled from: PG */
public final class C32654bw implements C32777d {
    @Deprecated

    /* renamed from: b */
    private static final C59071e f87523b = C59071e.m91331h();

    /* renamed from: c */
    private final C34798l f87524c;

    /* renamed from: d */
    private final C34790d f87525d;

    /* renamed from: e */
    private final C32758k f87526e;

    /* renamed from: f */
    private final C58889cz f87527f;

    /* renamed from: g */
    private final C73931amp f87528g;

    /* renamed from: h */
    private final amq f87529h;

    public C32654bw(C34798l lVar, C34790d dVar, C73931amp amp, amq amq, C32758k kVar, C58889cz czVar) {
        C69664n.m101061g(lVar, "serviceRegistry");
        C69664n.m101061g(dVar, "dynamicServiceConnector");
        C69664n.m101061g(amp, "appFlowLoggerFactory");
        C69664n.m101061g(amq, "accessSessionRootServiceFactory");
        C69664n.m101061g(kVar, "accessSessionImplFactory");
        C69664n.m101061g(czVar, "ticker");
        this.f87524c = lVar;
        this.f87525d = dVar;
        this.f87528g = amp;
        this.f87529h = amq;
        this.f87526e = kVar;
        this.f87527f = czVar;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [com.google.android.libraries.search.assistant.f.a.d.d, com.google.net.a.a.b] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* renamed from: a */
    public final C32603b mo38218a(String str, C32849cq cqVar, C32774c cVar) {
        ? r12;
        C32849cq cqVar2;
        C32805b bVar;
        C71816z zVar;
        C62722b bVar2;
        C32849cq cqVar3 = cqVar;
        C69664n.m101061g(cqVar3, "sessionToken");
        C58872ci d = C58872ci.m90947d(this.f87527f);
        C32718ef a = C32717ee.m60644a(str);
        C32778a aVar = (C32778a) C32805b.f87984c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C69690e eVar = C69691f.f186056a;
        byte[] bArr = new byte[32];
        C69691f.f186057b.mo61404e(bArr);
        C63088z A = C63088z.m96139A(bArr);
        aVar.copyOnWrite();
        ((C32805b) aVar.instance).f87986a = A;
        String str2 = a.f87696a;
        C69664n.m101061g(str2, "value");
        aVar.copyOnWrite();
        str2.getClass();
        ((C32805b) aVar.instance).f87987b = str2;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32805b bVar3 = (C32805b) build;
        C71816z zVar2 = new C71816z();
        try {
            amq amq = this.f87529h;
            C69585o oVar = (C69585o) amq.f197989a.a.G.mo17428b();
            C34790d dVar = (C34790d) amq.f197989a.b.f198135cB.mo17428b();
            C71422aw awVar = (C71422aw) amq.f197989a.a.H.mo17428b();
            C32914i iVar = (C32914i) amq.f197989a.a.b.f200095dC.mo17428b();
            C58889cz czVar = (C58889cz) amq.f197989a.a.bB.mo17428b();
            C32920c cVar2 = (C32920c) amq.f197989a.b.f198136cC.mo17428b();
            C32752fm eX = amq.f197989a.b.mo66237eX();
            C58872ci ciVar = d;
            C32636be beVar = r2;
            C32914i iVar2 = iVar;
            C32805b bVar4 = bVar3;
            C71816z zVar3 = zVar2;
            String str3 = "_builder.build()";
            try {
                C32636be beVar2 = new C32636be(oVar, dVar, awVar, cqVar, zVar2, iVar2, czVar, cVar2, eX);
                C34794h a2 = this.f87524c.mo39515a(beVar);
                C34793g gVar = a2.f92324a;
                C32859e eVar2 = (C32859e) C32860f.f88085b.createBuilder();
                C69664n.m101060f(eVar2, "newBuilder()");
                C69664n.m101061g(eVar2, "builder");
                C69664n.m101060f(gVar, "rootAddress");
                C69664n.m101061g(gVar, "value");
                eVar2.copyOnWrite();
                gVar.getClass();
                ((C32860f) eVar2.instance).f88087a = gVar;
                C62942bv build2 = eVar2.build();
                C69664n.m101060f(build2, str3);
                C32832c cVar3 = (C32832c) C32858d.f88081c.createBuilder();
                C69664n.m101060f(cVar3, "newBuilder()");
                C32862h a3 = C69664n.m101061g(cVar3, "builder");
                C63088z byteString = ((C32860f) build2).toByteString();
                C69664n.m101060f(byteString, "internals.toByteString()");
                a3.mo38326b(byteString);
                C32858d a4 = a3.mo38325a();
                zVar3.mo62909P(a4);
                C32805b bVar5 = bVar4;
                C32917b a5 = this.f87528g.mo65969a(bVar5, a4, cqVar);
                a5.mo38348c();
                try {
                    C70888j a6 = this.f87525d.mo39512a(gVar);
                    C69664n.m101060f(a6, "dynamicServiceConnector.connectTo(rootAddress)");
                    bVar2 = null;
                    try {
                        C32607ac a7 = this.f87526e.mo38284a(a4, bVar5, new C32870p(a6), cVar, a5, new C32653bv(beVar, a2, (C69577g) null));
                        Duration ofNanos = Duration.ofNanos(ciVar.mo56159b());
                        C69664n.m101060f(ofNanos, "startupStopwatch.elapsed()");
                        C69664n.m101061g(ofNanos, "contextApiLatency");
                        C32922e.m60928a(a7.f87324o, new C32772y(a7, ofNanos));
                        C59052c cVar4 = (C59052c) f87523b.mo56224b();
                        cVar4.mo56378ag(C58975e.f156826a, "Context.Consumer");
                        C69664n.m101060f(cVar4, "logger\n            .atInfo()");
                        C59052c a8 = C32692dg.m60595a(cVar4, a7.f87318i);
                        String c = C32692dg.m60597c(cqVar);
                        a8.mo56379ah(new C59094n(50590));
                        a8.mo56389s("Created AccessSession (Session: %s)", c);
                        return a7;
                    } catch (Throwable th) {
                        th = th;
                        a5.mo38347b(th, bVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = null;
                    a5.mo38347b(th, bVar2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cqVar2 = cqVar;
                zVar = zVar3;
                bVar = bVar4;
                r12 = 0;
                zVar.mo63050j(th);
                C32917b a9 = this.f87528g.mo65969a(bVar, r12, cqVar2);
                a9.mo38348c();
                a9.mo38347b(th, r12);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            zVar = zVar2;
            bVar = bVar3;
            cqVar2 = cqVar3;
            r12 = 0;
            zVar.mo63050j(th);
            C32917b a92 = this.f87528g.mo65969a(bVar, r12, cqVar2);
            a92.mo38348c();
            a92.mo38347b(th, r12);
            throw th;
        }
    }
}
