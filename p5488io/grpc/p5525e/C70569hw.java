package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;
import p5488io.grpc.C70138ab;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70280ci;
import p5488io.grpc.C70281cj;

/* renamed from: io.grpc.e.hw */
/* compiled from: PG */
final class C70569hw implements C70281cj {

    /* renamed from: a */
    final /* synthetic */ C70279ch f188131a;

    /* renamed from: b */
    final /* synthetic */ C70574ia f188132b;

    public C70569hw(C70574ia iaVar, C70279ch chVar) {
        this.f188132b = iaVar;
        this.f188131a = chVar;
    }

    /* renamed from: a */
    public final void mo61958a(C70138ab abVar) {
        C70280ci ciVar;
        C70574ia iaVar = this.f188132b;
        C70279ch chVar = this.f188131a;
        C70137aa aaVar = abVar.f186972a;
        if (aaVar != C70137aa.SHUTDOWN) {
            if (aaVar == C70137aa.TRANSIENT_FAILURE || aaVar == C70137aa.IDLE) {
                iaVar.f188145b.mo61942b();
            }
            int ordinal = aaVar.ordinal();
            if (ordinal == 0) {
                ciVar = new C70570hx(C70276ce.f187346a);
            } else if (ordinal == 1) {
                ciVar = new C70570hx(C70276ce.m102451c(chVar));
            } else if (ordinal == 2) {
                ciVar = new C70570hx(C70276ce.m102450b(abVar.f186973b));
            } else if (ordinal == 3) {
                ciVar = new C70572hz(iaVar, chVar);
            } else {
                new StringBuilder("Unsupported state:").append(aaVar);
                throw new IllegalArgumentException("Unsupported state:".concat(aaVar.toString()));
            }
            iaVar.f188145b.mo61943c(aaVar, ciVar);
        }
    }
}
