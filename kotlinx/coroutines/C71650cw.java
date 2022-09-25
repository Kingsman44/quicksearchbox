package kotlinx.coroutines;

import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.cw */
/* compiled from: PG */
final class C71650cw extends C71648cu {

    /* renamed from: a */
    private final C71665da f191088a;

    /* renamed from: b */
    private final C71651cx f191089b;

    /* renamed from: c */
    private final C71814x f191090c;

    /* renamed from: g */
    private final Object f191091g;

    public C71650cw(C71665da daVar, C71651cx cxVar, C71814x xVar, Object obj) {
        C69664n.m101061g(cxVar, "state");
        C69664n.m101061g(xVar, "child");
        this.f191088a = daVar;
        this.f191089b = cxVar;
        this.f191090c = xVar;
        this.f191091g = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62762b((Throwable) obj);
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final void mo62762b(Throwable th) {
        C71665da daVar = this.f191088a;
        C71651cx cxVar = this.f191089b;
        C71814x xVar = this.f191090c;
        Object obj = this.f191091g;
        boolean z = C71600ba.f191036a;
        C71814x R = C71665da.m104693R(xVar);
        if (R == null || !daVar.mo62910Q(cxVar, R, obj)) {
            daVar.mo62830b(daVar.mo62911mf(cxVar, obj));
        }
    }
}
