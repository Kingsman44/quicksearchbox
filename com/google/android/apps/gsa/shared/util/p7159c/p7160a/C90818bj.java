package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bj */
/* compiled from: PG */
public final class C90818bj implements Executor {

    /* renamed from: a */
    private static final C59071e f253969a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.bj");

    /* renamed from: b */
    private final Executor f253970b;

    /* renamed from: c */
    private final int f253971c;

    /* renamed from: d */
    private final Object f253972d = new Object();

    /* renamed from: e */
    private int f253973e = 0;

    /* renamed from: f */
    private final Queue f253974f = new ArrayDeque();

    public C90818bj(Executor executor, int i) {
        this.f253970b = executor;
        this.f253971c = i;
    }

    /* renamed from: a */
    public final void mo85160a() {
        synchronized (this.f253972d) {
            Runnable runnable = (Runnable) this.f253974f.poll();
            if (runnable == null) {
                this.f253973e--;
                return;
            }
            try {
                this.f253970b.execute(new C90817bi(this, runnable));
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f253969a.mo56225c()).mo56382g(th)).mo56372aa(11390)).mo56389s("Task submission failed: %s", runnable);
                synchronized (this.f253972d) {
                    this.f253973e--;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f253972d) {
            int i = this.f253973e;
            if (i < this.f253971c) {
                this.f253973e = i + 1;
                try {
                    this.f253970b.execute(new C90817bi(this, runnable));
                } catch (Throwable th) {
                    synchronized (this.f253972d) {
                        this.f253973e--;
                        throw th;
                    }
                }
            } else {
                this.f253974f.add(runnable);
            }
        }
    }
}
