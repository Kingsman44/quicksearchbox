package p5488io.grpc.p5525e;

import com.google.common.base.C58872ci;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.io */
/* compiled from: PG */
final class C70588io {

    /* renamed from: a */
    public final ScheduledExecutorService f188169a;

    /* renamed from: b */
    public final Executor f188170b;

    /* renamed from: c */
    public final Runnable f188171c;

    /* renamed from: d */
    public long f188172d;

    /* renamed from: e */
    public boolean f188173e;

    /* renamed from: f */
    public ScheduledFuture f188174f;

    /* renamed from: g */
    private final C58872ci f188175g;

    public C70588io(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C58872ci ciVar) {
        this.f188171c = runnable;
        this.f188170b = executor;
        this.f188169a = scheduledExecutorService;
        this.f188175g = ciVar;
        ciVar.mo56161f();
    }

    /* renamed from: a */
    public final long mo62340a() {
        return this.f188175g.mo56158a(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62341b(boolean z) {
        ScheduledFuture scheduledFuture;
        this.f188173e = false;
        if (z && (scheduledFuture = this.f188174f) != null) {
            scheduledFuture.cancel(false);
            this.f188174f = null;
        }
    }
}
