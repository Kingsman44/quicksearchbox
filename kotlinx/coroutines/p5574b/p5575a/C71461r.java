package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.r */
/* compiled from: PG */
public final class C71461r extends C71450g {

    /* renamed from: d */
    private final Iterable f190705d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71461r(Iterable iterable, C69585o oVar, int i, C71387t tVar) {
        super(oVar, i, tVar);
        C69664n.m101061g(iterable, "flows");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190705d = iterable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71461r(this.f190705d, oVar, i, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo62794c(C71361ao aoVar, C69577g gVar) {
        C71440al alVar = new C71440al(aoVar);
        for (C71587n qVar : this.f190705d) {
            C71803m.m105043d(aoVar, (C69585o) null, (C71424ay) null, new C71460q(qVar, alVar, (C69577g) null), 3);
        }
        return C69788q.f186170a;
    }

    /* renamed from: e */
    public final C71363aq mo62796e(C71422aw awVar) {
        C69664n.m101061g(awVar, "scope");
        C69585o oVar = this.f190676a;
        int i = this.f190677b;
        C71449f fVar = new C71449f(this, (C69577g) null);
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        return C71360an.m104023b(awVar, oVar, i, C71387t.SUSPEND, C71424ay.DEFAULT, fVar);
    }
}
