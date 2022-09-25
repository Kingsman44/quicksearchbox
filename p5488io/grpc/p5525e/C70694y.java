package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70896k;

/* renamed from: io.grpc.e.y */
/* compiled from: PG */
final class C70694y implements C70377at {

    /* renamed from: a */
    public final Executor f188439a;

    /* renamed from: b */
    private final C70377at f188440b;

    public C70694y(C70377at atVar, Executor executor) {
        C58838bb.m90866a(atVar, "delegate");
        this.f188440b = atVar;
        C58838bb.m90866a(executor, "appExecutor");
        this.f188439a = executor;
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        return new C70693x(this, this.f188440b.mo57960a(socketAddress, asVar, kVar), asVar.f187579a);
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f188440b.mo57961b();
    }

    public final void close() {
        this.f188440b.close();
    }
}
