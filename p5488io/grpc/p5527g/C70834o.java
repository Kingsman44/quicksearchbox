package p5488io.grpc.p5527g;

import com.google.common.base.C58881cr;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p5488io.grpc.C70239bj;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70896k;
import p5488io.grpc.p5525e.C70376as;
import p5488io.grpc.p5525e.C70377at;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70668ln;
import p5488io.grpc.p5525e.C70669lo;
import p5488io.grpc.p5525e.C70678lx;
import p5488io.grpc.p5525e.C70681m;
import p5488io.grpc.p5525e.C70683n;
import p5488io.grpc.p5527g.p5528a.C70790c;
import p5488io.grpc.p5527g.p5528a.p5529a.C70783l;

/* renamed from: io.grpc.g.o */
/* compiled from: PG */
final class C70834o implements C70377at {

    /* renamed from: a */
    final Executor f188908a;

    /* renamed from: b */
    final ScheduledExecutorService f188909b;

    /* renamed from: c */
    final C70678lx f188910c;

    /* renamed from: d */
    final SSLSocketFactory f188911d;

    /* renamed from: e */
    final HostnameVerifier f188912e;

    /* renamed from: f */
    final C70790c f188913f;

    /* renamed from: g */
    private final C70567hu f188914g;

    /* renamed from: h */
    private final C70567hu f188915h;

    /* renamed from: i */
    private final C70683n f188916i = new C70683n();

    /* renamed from: j */
    private boolean f188917j;

    public C70834o(C70567hu huVar, C70567hu huVar2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C70790c cVar, C70678lx lxVar) {
        this.f188914g = huVar;
        this.f188908a = (Executor) huVar.mo62162a();
        this.f188915h = huVar2;
        this.f188909b = (ScheduledExecutorService) C70668ln.f188396a.mo62410a(((C70669lo) huVar2).f188399a);
        this.f188911d = sSLSocketFactory;
        this.f188912e = hostnameVerifier;
        this.f188913f = cVar;
        this.f188910c = lxVar;
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        if (!this.f188917j) {
            C70683n nVar = this.f188916i;
            C70833n nVar2 = new C70833n(new C70681m(nVar, nVar.f188419c.get()));
            String str = asVar.f187579a;
            String str2 = asVar.f187581c;
            C70256c cVar = asVar.f187580b;
            C70239bj bjVar = asVar.f187582d;
            C58881cr crVar = C70460dv.f187799r;
            Logger logger = C70783l.f188760a;
            return new C70844y(this, (InetSocketAddress) socketAddress, str, str2, cVar, crVar, bjVar, nVar2);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f188909b;
    }

    public final void close() {
        if (!this.f188917j) {
            this.f188917j = true;
            this.f188914g.mo62163b(this.f188908a);
            C70567hu huVar = this.f188915h;
            ScheduledExecutorService scheduledExecutorService = this.f188909b;
            C70668ln.f188396a.mo62411b(((C70669lo) huVar).f188399a, scheduledExecutorService);
        }
    }
}
