package p5488io.grpc.p5526f;

import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70709en;

/* renamed from: io.grpc.f.al */
/* compiled from: PG */
public final class C70735al {
    /* renamed from: a */
    public static final C70709en m103423a(C69585o oVar, C70338di diVar, C69626l lVar) {
        C69664n.m101061g(oVar, "context");
        if (diVar.f187496a == C70337dh.BIDI_STREAMING) {
            return m103426d(oVar, diVar, lVar);
        }
        new StringBuilder("Expected a bidi streaming method descriptor but got ").append(diVar);
        throw new IllegalArgumentException("Expected a bidi streaming method descriptor but got ".concat(diVar.toString()));
    }

    /* renamed from: b */
    public static final C70709en m103424b(C69585o oVar, C70338di diVar, C69626l lVar) {
        C69664n.m101061g(oVar, "context");
        if (diVar.f187496a == C70337dh.SERVER_STREAMING) {
            return m103426d(oVar, diVar, new C70730ag(diVar, lVar));
        }
        new StringBuilder("Expected a server streaming method descriptor but got ").append(diVar);
        throw new IllegalArgumentException("Expected a server streaming method descriptor but got ".concat(diVar.toString()));
    }

    /* renamed from: c */
    public static final C70709en m103425c(C69585o oVar, C70338di diVar, C69630p pVar) {
        C69664n.m101061g(oVar, "context");
        if (diVar.f187496a == C70337dh.UNARY) {
            return m103426d(oVar, diVar, new C70734ak(diVar, pVar));
        }
        new StringBuilder("Expected a unary method descriptor but got ").append(diVar);
        throw new IllegalArgumentException("Expected a unary method descriptor but got ".concat(diVar.toString()));
    }

    /* renamed from: d */
    private static final C70709en m103426d(C69585o oVar, C70338di diVar, C69626l lVar) {
        return new C70709en(diVar, new C70757w(oVar, lVar));
    }
}
