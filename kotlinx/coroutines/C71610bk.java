package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71706an;
import kotlinx.coroutines.p5579e.C71729k;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71343f;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bk */
/* compiled from: PG */
public final class C71610bk extends C71706an {

    /* renamed from: b */
    public final C71340c f191045b = new C71340c(0, C71343f.f190534a);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71610bk(C69585o oVar, C69577g gVar) {
        super(oVar, gVar);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(gVar, "uCont");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62830b(Object obj) {
        mo62685ma(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ma */
    public final void mo62685ma(Object obj) {
        C71340c cVar = this.f191045b;
        do {
            int i = cVar.f190526b;
            if (i != 0) {
                if (i == 1) {
                    C71729k.m104890a(C69555b.m100961b(this.f191173e), C71400ag.m104164a(obj, this.f191173e), (C69626l) null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.f191045b.mo62672a(0, 2));
    }
}
