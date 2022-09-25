package androidx.work;

import androidx.work.impl.p207b.C4470ae;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.an */
/* compiled from: PG */
public final class C4390an extends C4399aw {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4390an(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        C69664n.m101061g(timeUnit, "repeatIntervalTimeUnit");
        C4470ae aeVar = this.f14042c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            C4380ad.m12560h().mo9314f(C4470ae.f14216a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        aeVar.mo9414c(millis < 900000 ? 900000 : millis, millis < 900000 ? 900000 : millis);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4400ax mo9316a() {
        if (this.f14040a && this.f14042c.f14226k.f14083d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        } else if (!this.f14042c.f14233r) {
            return new C4391ao(this);
        } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4390an(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        C69664n.m101061g(timeUnit, "repeatIntervalTimeUnit");
        C69664n.m101061g(timeUnit2, "flexIntervalTimeUnit");
        this.f14042c.mo9414c(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
