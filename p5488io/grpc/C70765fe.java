package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.concurrent.ScheduledFuture;

/* renamed from: io.grpc.fe */
/* compiled from: PG */
public final class C70765fe {

    /* renamed from: a */
    public final C70764fd f188580a;

    /* renamed from: b */
    private final ScheduledFuture f188581b;

    public C70765fe(C70764fd fdVar, ScheduledFuture scheduledFuture) {
        this.f188580a = fdVar;
        C58838bb.m90866a(scheduledFuture, "future");
        this.f188581b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo62443a() {
        this.f188580a.f188578b = true;
        this.f188581b.cancel(false);
    }
}
