package p5488io.grpc.p5524d;

import java.lang.Thread;

/* renamed from: io.grpc.d.i */
/* compiled from: PG */
final class C70312i implements Thread.UncaughtExceptionHandler {
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof Error) {
            throw new Error(th);
        }
        throw new RuntimeException(th);
    }
}
