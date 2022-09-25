package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71345a;
import kotlinx.coroutines.C71400ag;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.an */
/* compiled from: PG */
public class C71706an extends C71345a implements C69566d {

    /* renamed from: e */
    public final C69577g f191173e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71706an(C69585o oVar, C69577g gVar) {
        super(oVar, true, true);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(gVar, "uCont");
        this.f191173e = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62830b(Object obj) {
        C71729k.m104890a(C69555b.m100961b(this.f191173e), C71400ag.m104164a(obj, this.f191173e), (C69626l) null);
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* renamed from: eM */
    public final C69566d mo61336eM() {
        C69577g gVar = this.f191173e;
        if (gVar instanceof C69566d) {
            return (C69566d) gVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ma */
    public void mo62685ma(Object obj) {
        C69577g gVar = this.f191173e;
        gVar.mo61338mb(C71400ag.m104164a(obj, gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ml */
    public final boolean mo62915ml() {
        return true;
    }
}
