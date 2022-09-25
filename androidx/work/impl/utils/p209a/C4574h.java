package androidx.work.impl.utils.p209a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.impl.utils.a.h */
/* compiled from: PG */
final class C4574h implements Runnable {

    /* renamed from: a */
    final C4577k f14435a;

    /* renamed from: b */
    final C60870cx f14436b;

    public C4574h(C4577k kVar, C60870cx cxVar) {
        this.f14435a = kVar;
        this.f14436b = cxVar;
    }

    public final void run() {
        if (this.f14435a.f14444d == this) {
            if (C4577k.f14441b.mo9525d(this.f14435a, this, C4577k.m12972a(this.f14436b))) {
                C4577k.m12973c(this.f14435a);
            }
        }
    }
}
