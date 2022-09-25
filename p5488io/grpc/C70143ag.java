package p5488io.grpc;

import java.util.concurrent.Executor;

/* renamed from: io.grpc.ag */
/* compiled from: PG */
enum C70143ag implements Executor {
    ;

    private C70143ag() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "Context.DirectExecutor";
    }
}
