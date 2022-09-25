package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.ae */
/* compiled from: PG */
final class C70044ae implements Runnable {

    /* renamed from: a */
    private final Runnable f186712a;

    /* renamed from: b */
    private final C70047ah f186713b;

    /* renamed from: c */
    private final long f186714c;

    public C70044ae(Runnable runnable, C70047ah ahVar, long j) {
        this.f186712a = runnable;
        this.f186713b = ahVar;
        this.f186714c = j;
    }

    public final void run() {
        if (!this.f186713b.f186723c) {
            long d = C70047ah.m102070d(TimeUnit.MILLISECONDS);
            long j = this.f186714c;
            if (j > d) {
                try {
                    Thread.sleep(j - d);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C70101a.m102023e(e);
                    return;
                }
            }
            if (!this.f186713b.f186723c) {
                this.f186712a.run();
            }
        }
    }
}
