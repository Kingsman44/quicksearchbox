package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71729k;
import kotlinx.coroutines.p5580f.C71753a;
import kotlinx.coroutines.p5583i.C71783i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5467a.C69556c;
import p5462h.p5466c.p5467a.C69557d;
import p5462h.p5466c.p5468b.p5469a.C69563a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.dp */
/* compiled from: PG */
public final class C71680dp extends C71648cu {

    /* renamed from: a */
    private final C71783i f191137a;

    /* renamed from: b */
    private final C69626l f191138b;

    public C71680dp(C71783i iVar, C69626l lVar) {
        this.f191137a = iVar;
        this.f191138b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62762b((Throwable) obj);
        return C69788q.f186170a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.coroutines.i.i, h.c.g, java.lang.Object] */
    /* renamed from: b */
    public final void mo62762b(Throwable th) {
        C69577g gVar;
        if (this.f191137a.mo63015A()) {
            C69626l lVar = this.f191138b;
            ? r0 = this.f191137a;
            C69664n.m101061g(lVar, "<this>");
            C69664n.m101061g(r0, "completion");
            try {
                C69664n.m101061g(lVar, "<this>");
                C69664n.m101061g(r0, "completion");
                C69664n.m101061g(r0, "completion");
                if (lVar instanceof C69563a) {
                    gVar = ((C69563a) lVar).mo61334d(r0);
                } else {
                    C69585o lY = r0.mo61340lY();
                    if (lY == C69586p.f185991a) {
                        gVar = new C69556c(r0, lVar);
                    } else {
                        gVar = new C69557d(r0, lY, lVar);
                    }
                }
                C71729k.m104890a(C69555b.m100961b(gVar), C69788q.f186170a, (C69626l) null);
            } catch (Throwable th2) {
                C71753a.m104939a(r0, th2);
            }
        }
    }
}
