package p5488io.grpc.p5525e;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.im */
/* compiled from: PG */
final class C70586im implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70588io f188167a;

    public C70586im(C70588io ioVar) {
        this.f188167a = ioVar;
    }

    public final void run() {
        C70588io ioVar = this.f188167a;
        if (!ioVar.f188173e) {
            ioVar.f188174f = null;
            return;
        }
        long a = ioVar.mo62340a();
        C70588io ioVar2 = this.f188167a;
        long j = ioVar2.f188172d - a;
        if (j > 0) {
            ioVar2.f188174f = ioVar2.f188169a.schedule(new C70587in(ioVar2), j, TimeUnit.NANOSECONDS);
            return;
        }
        ioVar2.f188173e = false;
        ioVar2.f188174f = null;
        ioVar2.f188171c.run();
    }
}
