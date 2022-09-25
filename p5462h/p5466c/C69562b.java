package p5462h.p5466c;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.b */
/* compiled from: PG */
public class C69562b implements C69583m {

    /* renamed from: a */
    private final C69626l f185970a;

    /* renamed from: b */
    private final C69583m f185971b;

    public C69562b(C69583m mVar, C69626l lVar) {
        C69664n.m101061g(mVar, "baseKey");
        this.f185970a = lVar;
        this.f185971b = mVar instanceof C69562b ? ((C69562b) mVar).f185971b : mVar;
    }

    /* renamed from: a */
    public final C69582l mo61332a(C69582l lVar) {
        return (C69582l) this.f185970a.mo5761a(lVar);
    }

    /* renamed from: b */
    public final boolean mo61333b(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return mVar == this || this.f185971b == mVar;
    }
}
