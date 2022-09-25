package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5574b.C71517bu;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;

/* renamed from: io.grpc.f.n */
/* compiled from: PG */
public final class C70748n {
    /* renamed from: d */
    private static final C71587n m103451d(C70888j jVar, C70338di diVar, C70851i iVar, C70334de deVar, C70741g gVar) {
        return new C71552db(new C70747m(jVar, diVar, iVar, deVar, gVar, (C69577g) null));
    }

    /* renamed from: a */
    public static final C71587n m103448a(C70888j jVar, C70338di diVar, C71587n nVar, C70851i iVar, C70334de deVar) {
        if (diVar.f187496a == C70337dh.BIDI_STREAMING) {
            return m103451d(jVar, diVar, iVar, deVar, new C70739e(nVar));
        }
        new StringBuilder("Expected a bidi streaming method, but got ").append(diVar);
        throw new IllegalStateException("Expected a bidi streaming method, but got ".concat(diVar.toString()));
    }

    /* renamed from: b */
    public static final C71587n m103449b(C70888j jVar, C70338di diVar, Object obj, C70851i iVar, C70334de deVar) {
        if (diVar.f187496a == C70337dh.SERVER_STREAMING) {
            return m103451d(jVar, diVar, iVar, deVar, new C70740f(obj));
        }
        new StringBuilder("Expected a server streaming RPC method, but got ").append(diVar);
        throw new IllegalArgumentException("Expected a server streaming RPC method, but got ".concat(diVar.toString()));
    }

    /* renamed from: c */
    public static final Object m103450c(C70888j jVar, C70338di diVar, Object obj, C70851i iVar, C70334de deVar, C69577g gVar) {
        if (diVar.f187496a == C70337dh.UNARY) {
            return C71517bu.m104353d(C70754t.m103459a(m103451d(jVar, diVar, iVar, deVar, new C70740f(obj)), diVar), gVar);
        }
        new StringBuilder("Expected a unary RPC method, but got ").append(diVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(diVar.toString()));
    }
}
