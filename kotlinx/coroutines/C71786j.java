package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.j */
/* compiled from: PG */
final class C71786j extends C71345a {

    /* renamed from: b */
    public final C71619bt f191308b;

    /* renamed from: e */
    private final Thread f191309e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71786j(C69585o oVar, Thread thread, C71619bt btVar) {
        super(oVar, true, true);
        C69664n.m101061g(oVar, "parentContext");
        C69664n.m101061g(thread, "blockedThread");
        this.f191309e = thread;
        this.f191308b = btVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62830b(Object obj) {
        if (!C69664n.m101066l(Thread.currentThread(), this.f191309e)) {
            LockSupport.unpark(this.f191309e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ml */
    public final boolean mo62915ml() {
        return true;
    }
}
