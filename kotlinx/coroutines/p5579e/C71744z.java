package kotlinx.coroutines.p5579e;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.z */
/* compiled from: PG */
public abstract class C71744z extends C71722d {

    /* renamed from: d */
    public final C71696ad f191227d;

    /* renamed from: e */
    public C71696ad f191228e;

    public C71744z(C71696ad adVar) {
        this.f191227d = adVar;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo62978f(Object obj, Object obj2) {
        C71696ad adVar;
        C71696ad adVar2 = (C71696ad) obj;
        C69664n.m101061g(adVar2, "affected");
        boolean z = obj2 == null;
        if (z) {
            adVar = this.f191227d;
        } else {
            adVar = this.f191228e;
        }
        if (adVar != null && adVar2.f191159e.mo62679d(this, adVar) && z) {
            C71696ad adVar3 = this.f191227d;
            C71696ad adVar4 = this.f191228e;
            C69664n.m101058d(adVar4);
            adVar3.mo62949p(adVar4);
        }
    }
}
