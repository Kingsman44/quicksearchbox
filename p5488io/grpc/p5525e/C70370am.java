package p5488io.grpc.p5525e;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.am */
/* compiled from: PG */
final class C70370am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70371an f187554a;

    /* renamed from: b */
    private final long f187555b;

    public C70370am(C70371an anVar, long j) {
        this.f187554a = anVar;
        this.f187555b = j;
    }

    public final void run() {
        C70469ed edVar = new C70469ed();
        this.f187554a.f187561e.mo61756b(edVar);
        long abs = Math.abs(this.f187555b) / TimeUnit.SECONDS.toNanos(1);
        long abs2 = Math.abs(this.f187555b) % TimeUnit.SECONDS.toNanos(1);
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (this.f187555b < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        sb.append("s. ");
        sb.append(edVar);
        this.f187554a.f187561e.mo61757c(Status.f186907e.mo61677b(sb.toString()));
    }
}
