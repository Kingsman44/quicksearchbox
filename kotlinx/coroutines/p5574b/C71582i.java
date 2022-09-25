package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71440al;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import kotlinx.p5572a.C71339b;
import kotlinx.p5572a.C71343f;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.i */
/* compiled from: PG */
final class C71582i extends C71450g {

    /* renamed from: d */
    private final C71363aq f191011d;

    /* renamed from: e */
    private final C71339b f191012e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71582i(C71363aq aqVar, C69585o oVar, int i, C71387t tVar) {
        super(oVar, i, tVar);
        C69664n.m101061g(aqVar, "channel");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f191011d = aqVar;
        this.f191012e = new C71339b(false, C71343f.f190534a);
    }

    /* renamed from: g */
    private final void m104488g() {
        if (C71339b.f190522a.getAndSet(this.f191012e, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71582i(this.f191011d, oVar, i, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo62794c(C71361ao aoVar, C69577g gVar) {
        Object b = C71592s.m104508b(new C71440al(aoVar), this.f191011d, true, gVar);
        return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo62795d() {
        C71363aq aqVar = this.f191011d;
        new StringBuilder("channel=").append(aqVar);
        return "channel=".concat(String.valueOf(aqVar));
    }

    /* renamed from: e */
    public final C71363aq mo62796e(C71422aw awVar) {
        C69664n.m101061g(awVar, "scope");
        m104488g();
        if (this.f190677b == -3) {
            return this.f191011d;
        }
        return super.mo62796e(awVar);
    }

    /* renamed from: f */
    public final C71587n mo62797f() {
        return new C71582i(this.f191011d);
    }

    public /* synthetic */ C71582i(C71363aq aqVar) {
        this(aqVar, C69586p.f185991a, -3, C71387t.SUSPEND);
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        if (this.f190677b == -3) {
            m104488g();
            Object b = C71592s.m104508b(oVar, this.f191011d, true, gVar);
            return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
        }
        Object h = C71450g.m104241h(this, oVar, gVar);
        return h == C69554a.COROUTINE_SUSPENDED ? h : C69788q.f186170a;
    }
}
