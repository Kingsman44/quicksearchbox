package com.google.android.libraries.mdi.download.p2230c.p2234c;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.c.c.h */
/* compiled from: PG */
public final class C28768h implements Executor {

    /* renamed from: a */
    private final Executor f78204a;

    /* renamed from: b */
    private final int f78205b;

    /* renamed from: c */
    private final Object f78206c = new Object();

    /* renamed from: d */
    private int f78207d = 0;

    /* renamed from: e */
    private final Queue f78208e = new ArrayDeque();

    public C28768h(Executor executor, int i) {
        this.f78204a = executor;
        this.f78205b = i;
    }

    /* renamed from: a */
    public final void mo34379a() {
        synchronized (this.f78206c) {
            Runnable runnable = (Runnable) this.f78208e.poll();
            if (runnable == null) {
                this.f78207d--;
                return;
            }
            try {
                this.f78204a.execute(new C28767g(this, runnable));
            } catch (Throwable th) {
                C29045l.m53938j(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.f78206c) {
                    this.f78207d--;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f78206c) {
            int i = this.f78207d;
            if (i < this.f78205b) {
                this.f78207d = i + 1;
                try {
                    this.f78204a.execute(new C28767g(this, runnable));
                } catch (Throwable th) {
                    synchronized (this.f78206c) {
                        this.f78207d--;
                        throw th;
                    }
                }
            } else {
                this.f78208e.add(runnable);
            }
        }
    }
}
