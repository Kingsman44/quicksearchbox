package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.bz */
/* compiled from: PG */
public abstract class C71625bz extends C71619bt {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Thread mo62820c();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo62822i(long j, C71622bw bwVar) {
        C71602bc.f191039c.mo62859r(j, bwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo62861t() {
        Thread c = mo62820c();
        if (Thread.currentThread() != c) {
            LockSupport.unpark(c);
        }
    }
}
