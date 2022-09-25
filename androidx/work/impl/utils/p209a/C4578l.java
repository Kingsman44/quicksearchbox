package androidx.work.impl.utils.p209a;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.a.l */
/* compiled from: PG */
enum C4578l implements Executor {
    ;

    private C4578l() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "DirectExecutor";
    }
}
