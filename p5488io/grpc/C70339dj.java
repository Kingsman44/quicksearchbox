package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: io.grpc.dj */
/* compiled from: PG */
public final class C70339dj {

    /* renamed from: a */
    public final int f187503a;

    /* renamed from: b */
    public final C70699ed f187504b;

    /* renamed from: c */
    public final C70766ff f187505c;

    /* renamed from: d */
    public final C70344do f187506d;

    /* renamed from: e */
    public final Executor f187507e;

    /* renamed from: f */
    private final ScheduledExecutorService f187508f;

    /* renamed from: g */
    private final C70896k f187509g;

    public C70339dj(Integer num, C70699ed edVar, C70766ff ffVar, C70344do doVar, ScheduledExecutorService scheduledExecutorService, C70896k kVar, Executor executor) {
        this.f187503a = num.intValue();
        this.f187504b = edVar;
        this.f187505c = ffVar;
        this.f187506d = doVar;
        this.f187508f = scheduledExecutorService;
        this.f187509g = kVar;
        this.f187507e = executor;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("defaultPort", String.valueOf(this.f187503a));
        b.mo56102b("proxyDetector", this.f187504b);
        b.mo56102b("syncContext", this.f187505c);
        b.mo56102b("serviceConfigParser", this.f187506d);
        b.mo56102b("scheduledExecutorService", this.f187508f);
        b.mo56102b("channelLogger", this.f187509g);
        b.mo56102b("executor", this.f187507e);
        b.mo56102b("overrideAuthority", (Object) null);
        return b.toString();
    }
}
