package kotlinx.coroutines.p5574b;

import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.dt */
/* compiled from: PG */
public final class C71570dt implements C71562dl {

    /* renamed from: b */
    public final long f190990b;

    /* renamed from: c */
    public final long f190991c;

    public C71570dt(long j, long j2) {
        this.f190990b = j;
        this.f190991c = j2;
    }

    /* renamed from: a */
    public final C71587n mo62813a(C71571du duVar) {
        C69664n.m101061g(duVar, "subscriptionCount");
        return C71471ab.m104286a(new C71487ar(C71506bj.m104339e(duVar, new C71568dr(this, (C69577g) null)), new C71569ds((C69577g) null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C71570dt)) {
            return false;
        }
        C71570dt dtVar = (C71570dt) obj;
        return this.f190990b == dtVar.f190990b && this.f190991c == dtVar.f190991c;
    }

    public final int hashCode() {
        long j = this.f190990b;
        long j2 = this.f190991c;
        return (((int) j) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        C69469c cVar = new C69469c(2);
        long j = this.f190990b;
        if (j > 0) {
            cVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.f190991c;
        if (j2 < Long.MAX_VALUE) {
            cVar.add("replayExpiration=" + j2 + "ms");
        }
        String ag = C69540x.m100851ag(C69540x.m100943a(cVar), (CharSequence) null, (CharSequence) null, (CharSequence) null, (C69626l) null, 63);
        return "SharingStarted.WhileSubscribed(" + ag + ")";
    }
}
