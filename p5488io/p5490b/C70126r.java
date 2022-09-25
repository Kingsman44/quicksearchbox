package p5488io.p5490b;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69831g;

/* renamed from: io.b.r */
/* compiled from: PG */
final class C70126r implements Runnable {

    /* renamed from: a */
    final Runnable f186894a;

    /* renamed from: b */
    final C69831g f186895b;

    /* renamed from: c */
    final long f186896c;

    /* renamed from: d */
    long f186897d;

    /* renamed from: e */
    long f186898e;

    /* renamed from: f */
    long f186899f;

    /* renamed from: g */
    final /* synthetic */ C70127s f186900g;

    public C70126r(C70127s sVar, long j, Runnable runnable, long j2, C69831g gVar, long j3) {
        this.f186900g = sVar;
        this.f186894a = runnable;
        this.f186895b = gVar;
        this.f186896c = j3;
        this.f186898e = j2;
        this.f186899f = j;
    }

    public final void run() {
        long j;
        this.f186894a.run();
        if (!C69828d.m101306b((C69803b) this.f186895b.get())) {
            long d = C70127s.m102070d(TimeUnit.NANOSECONDS);
            long j2 = C70128t.f186901a;
            long j3 = this.f186898e;
            if (j2 + d >= j3) {
                long j4 = this.f186896c;
                if (d < j3 + j4 + C70128t.f186901a) {
                    long j5 = this.f186899f;
                    long j6 = this.f186897d + 1;
                    this.f186897d = j6;
                    j = j5 + (j6 * j4);
                    this.f186898e = d;
                    C69828d.m101310g(this.f186895b, this.f186900g.mo61456b(this, j - d, TimeUnit.NANOSECONDS));
                }
            }
            long j7 = this.f186896c;
            j = d + j7;
            long j8 = this.f186897d + 1;
            this.f186897d = j8;
            this.f186899f = j - (j7 * j8);
            this.f186898e = d;
            C69828d.m101310g(this.f186895b, this.f186900g.mo61456b(this, j - d, TimeUnit.NANOSECONDS));
        }
    }
}
