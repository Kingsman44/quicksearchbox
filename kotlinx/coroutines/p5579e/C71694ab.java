package kotlinx.coroutines.p5579e;

import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.ab */
/* compiled from: PG */
public class C71694ab extends C71742x {

    /* renamed from: a */
    private final C71342e f191155a = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: c */
    public final C71696ad f191156c;

    /* renamed from: d */
    private final C71342e f191157d = new C71342e((Object) null, C71343f.f190534a);

    public C71694ab(C71696ad adVar) {
        this.f191156c = adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo62735a(C71696ad adVar) {
        if (adVar == this.f191156c) {
            return C71741w.f191223b;
        }
        return null;
    }

    /* renamed from: g */
    public final Object mo62933g(C71696ad adVar, C71696ad adVar2) {
        C69664n.m101061g(adVar, "affected");
        C69664n.m101061g(adVar2, "next");
        return adVar2.mo62947n();
    }

    /* renamed from: h */
    public final C71696ad mo62934h() {
        return (C71696ad) this.f191155a.f190532a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C71696ad mo62935i() {
        return (C71696ad) this.f191157d.f190532a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C71696ad mo62936j(C71703ak akVar) {
        C71342e eVar = this.f191156c.f191159e;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj instanceof C71703ak) {
                C71703ak akVar2 = (C71703ak) obj;
                if (akVar.mo62963h(akVar2)) {
                    return null;
                }
                akVar2.mo62930d(this.f191156c);
            } else {
                C69664n.m101059e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                return (C71696ad) obj;
            }
        }
    }

    /* renamed from: k */
    public final void mo62937k(C71693aa aaVar) {
        this.f191155a.mo62679d((Object) null, aaVar.f191152a);
        this.f191157d.mo62679d((Object) null, aaVar.f191153b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo62938l(C71696ad adVar) {
        adVar.mo62942k((C71703ak) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo62939m(Object obj) {
        C69664n.m101061g(obj, "next");
        if (!(obj instanceof C71704al)) {
            return false;
        }
        ((C71704al) obj).f191172a.mo62951r();
        return true;
    }
}
