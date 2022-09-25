package android.support.p033v7.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.app.ax */
/* compiled from: PG */
final class C0363ax implements Executor {

    /* renamed from: a */
    final Queue f1236a = new ArrayDeque();

    /* renamed from: b */
    final Executor f1237b;

    /* renamed from: c */
    Runnable f1238c;

    /* renamed from: d */
    private final Object f1239d = new Object();

    public C0363ax(Executor executor) {
        this.f1237b = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1217a() {
        synchronized (this.f1239d) {
            Runnable runnable = (Runnable) this.f1236a.poll();
            this.f1238c = runnable;
            if (runnable != null) {
                this.f1237b.execute(runnable);
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f1239d) {
            this.f1236a.add(new C0362aw(this, runnable));
            if (this.f1238c == null) {
                mo1217a();
            }
        }
    }
}
