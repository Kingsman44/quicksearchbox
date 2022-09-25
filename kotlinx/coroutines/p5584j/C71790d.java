package kotlinx.coroutines.p5584j;

import kotlinx.coroutines.C71807q;
import p5462h.C69788q;

/* renamed from: kotlinx.coroutines.j.d */
/* compiled from: PG */
final class C71790d extends C71793g {

    /* renamed from: a */
    final /* synthetic */ C71799m f191313a;

    /* renamed from: b */
    private final C71807q f191314b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71790d(C71799m mVar, Object obj, C71807q qVar) {
        super(obj);
        this.f191313a = mVar;
        this.f191314b = qVar;
    }

    /* renamed from: b */
    public final void mo63028b() {
        this.f191314b.mo63040m();
    }

    /* renamed from: c */
    public final boolean mo63029c() {
        if (this.f191321g.mo62670b() && this.f191314b.mo63033d(C69788q.f186170a, (Object) null, new C71789c(this.f191313a, this)) != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj = this.f191320d;
        C71807q qVar = this.f191314b;
        C71799m mVar = this.f191313a;
        return "LockCont[" + obj + ", " + qVar + "] for " + mVar;
    }
}
