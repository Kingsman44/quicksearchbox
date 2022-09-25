package kotlinx.coroutines.p5584j;

import kotlinx.coroutines.p5579e.C71719b;
import kotlinx.coroutines.p5579e.C71722d;

/* renamed from: kotlinx.coroutines.j.j */
/* compiled from: PG */
final class C71796j extends C71719b {

    /* renamed from: a */
    public final C71799m f191323a;

    /* renamed from: c */
    public final Object f191324c;

    public C71796j(C71799m mVar, Object obj) {
        this.f191323a = mVar;
        this.f191324c = obj;
    }

    /* renamed from: d */
    public final Object mo62972d(C71722d dVar) {
        C71795i iVar = new C71795i(dVar);
        if (!this.f191323a.f191328a.mo62679d(C71800n.f191334f, iVar)) {
            return C71800n.f191329a;
        }
        iVar.mo62930d(this.f191323a);
        return null;
    }

    /* renamed from: f */
    public final void mo62974f(C71722d dVar, Object obj) {
        C71787a aVar;
        if (obj != null) {
            aVar = C71800n.f191334f;
        } else {
            Object obj2 = this.f191324c;
            aVar = obj2 == null ? C71800n.f191333e : new C71787a(obj2);
        }
        this.f191323a.f191328a.mo62679d(dVar, aVar);
    }
}
