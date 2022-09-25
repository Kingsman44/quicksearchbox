package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71706an;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.dy */
/* compiled from: PG */
final class C71689dy extends C71706an implements Runnable {

    /* renamed from: b */
    public final long f191141b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71689dy(long j, C69577g gVar) {
        super(gVar.mo61340lY(), gVar);
        C69664n.m101061g(gVar, "uCont");
        this.f191141b = j;
    }

    /* renamed from: md */
    public final String mo62687md() {
        String md = super.mo62687md();
        long j = this.f191141b;
        return md + "(timeMillis=" + j + ")";
    }

    public final void run() {
        long j = this.f191141b;
        mo62907M(new C71688dx("Timed out waiting for " + j + " ms", this));
    }
}
