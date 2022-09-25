package p5488io.grpc.p5520a;

import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59326i;
import java.util.List;
import java.util.Map;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70356e;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70565hs;

/* renamed from: io.grpc.a.a */
/* compiled from: PG */
public final class C70133a {

    /* renamed from: a */
    public final /* synthetic */ C70356e f186948a;

    /* renamed from: b */
    final /* synthetic */ C70136d f186949b;

    public C70133a(C70136d dVar, C70356e eVar) {
        this.f186949b = dVar;
        this.f186948a = eVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo61689a(Map map) {
        C70334de deVar;
        try {
            synchronized (this.f186949b) {
                C70136d dVar = this.f186949b;
                Map map2 = dVar.f186963e;
                if (map2 == null || map2 != map) {
                    C70334de deVar2 = new C70334de();
                    if (map != null) {
                        for (String str : map.keySet()) {
                            if (str.endsWith("-bin")) {
                                C70297cz c = C70297cz.m102495c(str, C70334de.f187480b);
                                for (String k : (List) map.get(str)) {
                                    deVar2.mo62033h(c, C59326i.f157516d.mo56836k(k));
                                }
                            } else {
                                C70290cs csVar = new C70290cs(str, C70334de.f187481c);
                                for (String h : (List) map.get(str)) {
                                    deVar2.mo62033h(csVar, h);
                                }
                            }
                        }
                    }
                    dVar.f186962d = deVar2;
                    this.f186949b.f186963e = map;
                }
                deVar = this.f186949b.f186962d;
            }
            C70356e eVar = this.f186948a;
            C70565hs hsVar = (C70565hs) eVar;
            C58838bb.m90884s(!hsVar.f188127i, "apply() or fail() already called");
            C58838bb.m90866a(deVar, "headers");
            hsVar.f188121c.mo62032g(deVar);
            C70148al a = hsVar.f188123e.mo61696a();
            try {
                C70372ao e = ((C70565hs) eVar).f188119a.mo61824e(((C70565hs) eVar).f188120b, ((C70565hs) eVar).f188121c, ((C70565hs) eVar).f188122d, ((C70565hs) eVar).f188124f);
                hsVar.f188123e.mo61702f(a);
                hsVar.mo62319b(e);
            } catch (Throwable th) {
                hsVar.f188123e.mo61702f(a);
                throw th;
            }
        } catch (Throwable th2) {
            this.f186948a.mo62072a(Status.f186910h.withDescription("Failed to convert credential metadata").mo61678e(th2));
        }
    }
}
