package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.impl.p207b.C4509r;

/* renamed from: androidx.work.impl.utils.al */
/* compiled from: PG */
public final class C4591al implements Runnable {

    /* renamed from: a */
    private final C4592am f14476a;

    /* renamed from: b */
    private final C4509r f14477b;

    public C4591al(C4592am amVar, C4509r rVar) {
        this.f14476a = amVar;
        this.f14477b = rVar;
    }

    public final void run() {
        synchronized (this.f14476a.f14482e) {
            if (((C4591al) this.f14476a.f14480c.remove(this.f14477b)) != null) {
                C4590ak akVar = (C4590ak) this.f14476a.f14481d.remove(this.f14477b);
                if (akVar != null) {
                    akVar.mo9486b(this.f14477b);
                }
            } else {
                C4380ad.m12560h().mo9309a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f14477b}));
            }
        }
    }
}
