package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.v */
/* compiled from: PG */
public final class C4615v implements Executor {

    /* renamed from: a */
    public final ArrayDeque f14507a = new ArrayDeque();

    /* renamed from: b */
    public final Object f14508b = new Object();

    /* renamed from: c */
    private final Executor f14509c;

    /* renamed from: d */
    private Runnable f14510d;

    public C4615v(Executor executor) {
        this.f14509c = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9556a() {
        Runnable runnable = (Runnable) this.f14507a.poll();
        this.f14510d = runnable;
        if (runnable != null) {
            this.f14509c.execute(runnable);
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f14508b) {
            this.f14507a.add(new C4614u(this, runnable));
            if (this.f14510d == null) {
                mo9556a();
            }
        }
    }
}
