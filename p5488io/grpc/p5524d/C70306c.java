package p5488io.grpc.p5524d;

import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70896k;
import p5488io.grpc.p5525e.C70376as;
import p5488io.grpc.p5525e.C70377at;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70668ln;

/* renamed from: io.grpc.d.c */
/* compiled from: PG */
final class C70306c implements C70377at {

    /* renamed from: a */
    private final ScheduledExecutorService f187418a;

    /* renamed from: b */
    private final boolean f187419b;

    /* renamed from: c */
    private boolean f187420c;

    /* renamed from: d */
    private final boolean f187421d;

    public C70306c(ScheduledExecutorService scheduledExecutorService, boolean z) {
        boolean z2 = scheduledExecutorService == null;
        this.f187419b = z2;
        this.f187418a = z2 ? (ScheduledExecutorService) C70668ln.f188396a.mo62410a(C70460dv.f187798q) : scheduledExecutorService;
        this.f187421d = z;
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        if (!this.f187420c) {
            return new C70304ae(socketAddress, asVar.f187579a, asVar.f187581c, asVar.f187580b, this.f187421d);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f187418a;
    }

    public final void close() {
        if (!this.f187420c) {
            this.f187420c = true;
            if (this.f187419b) {
                C70668ln.f188396a.mo62411b(C70460dv.f187798q, this.f187418a);
            }
        }
    }
}
