package androidx.p182p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.ar */
/* compiled from: PG */
public final class C3935ar implements Executor {

    /* renamed from: a */
    private final Executor f12591a;

    /* renamed from: b */
    private final ArrayDeque f12592b = new ArrayDeque();

    /* renamed from: c */
    private Runnable f12593c;

    /* renamed from: d */
    private final Object f12594d = new Object();

    public C3935ar(Executor executor) {
        this.f12591a = executor;
    }

    /* renamed from: a */
    public final synchronized void mo8217a() {
        synchronized (this.f12594d) {
            Object poll = this.f12592b.poll();
            Runnable runnable = (Runnable) poll;
            this.f12593c = runnable;
            if (poll != null) {
                this.f12591a.execute(runnable);
            }
        }
    }

    public final void execute(Runnable runnable) {
        C69664n.m101061g(runnable, "command");
        synchronized (this.f12594d) {
            this.f12592b.offer(new C3934aq(runnable, this));
            if (this.f12593c == null) {
                mo8217a();
            }
        }
    }
}
