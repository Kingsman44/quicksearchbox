package p5488io.grpc.p5525e;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70286co;

/* renamed from: io.grpc.e.he */
/* compiled from: PG */
final class C70551he extends C70450dl {

    /* renamed from: b */
    public static final Logger f188063b = Logger.getLogger(C70551he.class.getName());

    /* renamed from: c */
    private static final ReferenceQueue f188064c = new ReferenceQueue();

    /* renamed from: d */
    private static final ConcurrentMap f188065d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C70550hd f188066e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70551he(C70286co coVar) {
        super(coVar);
        ReferenceQueue referenceQueue = f188064c;
        ConcurrentMap concurrentMap = f188065d;
        this.f188066e = new C70550hd(this, coVar, referenceQueue, concurrentMap);
    }

    /* renamed from: f */
    public final void mo61974f() {
        C70550hd hdVar = this.f188066e;
        int i = C70550hd.f188055a;
        hdVar.mo62295a();
        ((C70542gw) this.f187761a).mo61974f();
    }

    /* renamed from: g */
    public final void mo61975g() {
        C70550hd hdVar = this.f188066e;
        int i = C70550hd.f188055a;
        hdVar.mo62295a();
        ((C70542gw) this.f187761a).mo61975g();
    }
}
