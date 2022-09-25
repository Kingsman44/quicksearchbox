package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.y */
/* compiled from: PG */
public class C71743y extends C71742x {

    /* renamed from: a */
    public final C71696ad f191224a;

    /* renamed from: c */
    public final C71696ad f191225c;

    /* renamed from: d */
    private final C71342e f191226d = new C71342e((Object) null, C71343f.f190534a);

    public C71743y(C71696ad adVar, C71696ad adVar2) {
        this.f191224a = adVar;
        this.f191225c = adVar2;
        boolean z = C71600ba.f191036a;
    }

    /* renamed from: g */
    public final Object mo62933g(C71696ad adVar, C71696ad adVar2) {
        C69664n.m101061g(adVar, "affected");
        C69664n.m101061g(adVar2, "next");
        C71696ad adVar3 = this.f191225c;
        adVar3.f191160f.mo62679d(adVar3, adVar);
        C71696ad adVar4 = this.f191225c;
        adVar4.f191159e.mo62679d(adVar4, this.f191224a);
        return this.f191225c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C71696ad mo62934h() {
        return (C71696ad) this.f191226d.f190532a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C71696ad mo62935i() {
        return this.f191224a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C71696ad mo62936j(C71703ak akVar) {
        return this.f191224a.mo62942k(akVar);
    }

    /* renamed from: k */
    public final void mo62937k(C71693aa aaVar) {
        this.f191226d.mo62679d((Object) null, aaVar.f191152a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo62938l(C71696ad adVar) {
        this.f191225c.mo62949p(this.f191224a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo62939m(Object obj) {
        C69664n.m101061g(obj, "next");
        return obj != this.f191224a;
    }
}
