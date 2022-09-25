package kotlinx.coroutines.p5584j;

import kotlinx.coroutines.p5580f.C71753a;
import kotlinx.coroutines.p5583i.C71783i;
import p5462h.p5473f.p5474a.C69630p;

/* renamed from: kotlinx.coroutines.j.f */
/* compiled from: PG */
final class C71792f extends C71793g {

    /* renamed from: a */
    public final C71783i f191317a;

    /* renamed from: b */
    public final C69630p f191318b;

    /* renamed from: c */
    final /* synthetic */ C71799m f191319c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71792f(C71799m mVar, Object obj, C71783i iVar, C69630p pVar) {
        super(obj);
        this.f191319c = mVar;
        this.f191317a = iVar;
        this.f191318b = pVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlinx.coroutines.i.i, h.c.g] */
    /* renamed from: b */
    public final void mo63028b() {
        C69630p pVar = this.f191318b;
        C71799m mVar = this.f191319c;
        C71753a.m104941c(pVar, mVar, this.f191317a, new C71791e(mVar, this));
    }

    /* renamed from: c */
    public final boolean mo63029c() {
        return this.f191321g.mo62670b() && this.f191317a.mo63015A();
    }

    public final String toString() {
        Object obj = this.f191320d;
        C71783i iVar = this.f191317a;
        C71799m mVar = this.f191319c;
        return "LockSelect[" + obj + ", " + iVar + "] for " + mVar;
    }
}
