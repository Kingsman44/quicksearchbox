package p5488io.grpc.p5523c;

import com.google.common.base.C58838bb;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70896k;
import p5488io.grpc.p5525e.C70376as;
import p5488io.grpc.p5525e.C70377at;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70668ln;
import p5488io.grpc.p5525e.C70679ly;

/* renamed from: io.grpc.c.b */
/* compiled from: PG */
final class C70258b implements C70377at {

    /* renamed from: a */
    private final ScheduledExecutorService f187258a;

    /* renamed from: b */
    private final Executor f187259b;

    /* renamed from: c */
    private final int f187260c;

    /* renamed from: d */
    private final C70259c f187261d;

    /* renamed from: e */
    private final C70679ly f187262e;

    /* renamed from: f */
    private final boolean f187263f;

    public C70258b(C70259c cVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, C70679ly lyVar) {
        boolean z = scheduledExecutorService == null;
        this.f187263f = z;
        this.f187258a = z ? (ScheduledExecutorService) C70668ln.f188396a.mo62410a(C70460dv.f187798q) : scheduledExecutorService;
        this.f187260c = i;
        this.f187261d = cVar;
        C58838bb.m90866a(executor, "executor");
        this.f187259b = executor;
        this.f187262e = lyVar;
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        return new C70269m(this.f187261d, (InetSocketAddress) socketAddress, asVar.f187579a, asVar.f187581c, asVar.f187580b, this.f187259b, this.f187260c, this.f187262e);
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f187258a;
    }

    public final void close() {
        if (this.f187263f) {
            C70668ln.f188396a.mo62411b(C70460dv.f187798q, this.f187258a);
        }
    }
}
