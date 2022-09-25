package androidx.core.p095g;

import android.os.Process;

/* renamed from: androidx.core.g.q */
/* compiled from: PG */
final class C1919q extends Thread {

    /* renamed from: a */
    private final int f5813a = 10;

    public C1919q(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.f5813a);
        super.run();
    }
}
