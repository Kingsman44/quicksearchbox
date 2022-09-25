package kotlinx.coroutines;

import kotlinx.coroutines.p5580f.C71753a;
import kotlinx.coroutines.p5583i.C71783i;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.do */
/* compiled from: PG */
final class C71679do extends C71648cu {

    /* renamed from: a */
    private final C71783i f191135a;

    /* renamed from: b */
    private final C69630p f191136b;

    public C71679do(C71783i iVar, C69630p pVar) {
        this.f191135a = iVar;
        this.f191136b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62762b((Throwable) obj);
        return C69788q.f186170a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.coroutines.i.i, h.c.g, java.lang.Object] */
    /* renamed from: b */
    public final void mo62762b(Throwable th) {
        if (this.f191135a.mo63015A()) {
            C71665da e = mo62883e();
            ? r0 = this.f191135a;
            C69630p pVar = this.f191136b;
            C69664n.m101061g(r0, "select");
            C69664n.m101061g(pVar, "block");
            Object mh = e.mo62913mh();
            if (mh instanceof C71396ac) {
                r0.mo63022y(((C71396ac) mh).f190604b);
            } else {
                C71753a.m104941c(pVar, C71666db.m104742b(mh), r0, (C69626l) null);
            }
        }
    }
}
