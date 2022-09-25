package p5488io.grpc.p5525e;

import java.lang.Thread;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ip */
/* compiled from: PG */
final class C70589ip implements Thread.UncaughtExceptionHandler {
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new C70761fa(Status.m102100d(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown."), (C70334de) null, true);
    }
}
