package p5488io.grpc.binder;

import android.content.Context;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70896k;
import p5488io.grpc.binder.p5522a.C70204i;
import p5488io.grpc.p5525e.C70376as;
import p5488io.grpc.p5525e.C70377at;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70567hu;

/* renamed from: io.grpc.binder.d */
/* compiled from: PG */
final class C70224d implements C70377at {

    /* renamed from: a */
    private final Context f187187a;

    /* renamed from: b */
    private final Executor f187188b;

    /* renamed from: c */
    private final C70567hu f187189c;

    /* renamed from: d */
    private final C70567hu f187190d;

    /* renamed from: e */
    private final C70235o f187191e;

    /* renamed from: f */
    private final C70229i f187192f;

    /* renamed from: g */
    private final C70222b f187193g;

    /* renamed from: h */
    private ScheduledExecutorService f187194h;

    /* renamed from: i */
    private Executor f187195i;

    /* renamed from: j */
    private boolean f187196j;

    public C70224d(Context context, Executor executor, C70567hu huVar, C70567hu huVar2, C70235o oVar, C70222b bVar, C70229i iVar) {
        this.f187187a = context;
        this.f187188b = executor;
        this.f187189c = huVar;
        this.f187190d = huVar2;
        this.f187191e = oVar;
        this.f187193g = bVar;
        this.f187192f = iVar;
        this.f187194h = (ScheduledExecutorService) huVar.mo62162a();
        this.f187195i = (Executor) huVar2.mo62162a();
    }

    /* renamed from: a */
    public final C70387bc mo57960a(SocketAddress socketAddress, C70376as asVar, C70896k kVar) {
        if (!this.f187196j) {
            return new C70204i(this.f187187a, (C70175a) socketAddress, this.f187188b, this.f187189c, this.f187190d, this.f187191e, this.f187192f, asVar.f187580b);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    /* renamed from: b */
    public final ScheduledExecutorService mo57961b() {
        return this.f187194h;
    }

    public final void close() {
        this.f187196j = true;
        this.f187194h = (ScheduledExecutorService) this.f187189c.mo62163b(this.f187194h);
        this.f187195i = (Executor) this.f187190d.mo62163b(this.f187195i);
    }
}
