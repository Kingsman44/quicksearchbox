package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auc */
/* compiled from: PG */
final class auc extends atz {

    /* renamed from: a */
    private final aub f21558a = new aub();

    /* renamed from: a */
    public final void mo15440a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f21558a.mo15445a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }

    /* renamed from: b */
    public final void mo15441b(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f21558a.mo15445a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }
}
