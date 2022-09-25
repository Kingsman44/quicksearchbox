package androidx.work.impl;

import androidx.work.impl.p207b.C4509r;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.q */
/* compiled from: PG */
final class C4561q implements Runnable {

    /* renamed from: a */
    private final C4539d f14394a;

    /* renamed from: b */
    private final C4509r f14395b;

    /* renamed from: c */
    private final C60870cx f14396c;

    public C4561q(C4539d dVar, C4509r rVar, C60870cx cxVar) {
        this.f14394a = dVar;
        this.f14395b = rVar;
        this.f14396c = cxVar;
    }

    public final void run() {
        boolean z;
        try {
            z = ((Boolean) this.f14396c.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        this.f14394a.mo9473a(this.f14395b, z);
    }
}
