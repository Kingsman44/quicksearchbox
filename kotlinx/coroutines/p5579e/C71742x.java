package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.x */
/* compiled from: PG */
public abstract class C71742x extends C71719b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo62735a(C71696ad adVar) {
        return null;
    }

    /* renamed from: b */
    public Object mo62736b(C71693aa aaVar) {
        mo62937k(aaVar);
        return null;
    }

    /* renamed from: c */
    public void mo62737c(C71696ad adVar) {
        C69664n.m101061g(adVar, "affected");
    }

    /* renamed from: d */
    public final Object mo62972d(C71722d dVar) {
        while (true) {
            C71696ad j = mo62936j(dVar);
            if (j == null) {
                return C71721c.f191196b;
            }
            Object obj = j.f191159e.f190532a;
            if (obj == dVar || dVar.mo62979g()) {
                return null;
            }
            if (obj instanceof C71703ak) {
                C71703ak akVar = (C71703ak) obj;
                if (dVar.mo62963h(akVar)) {
                    return C71721c.f191196b;
                }
                akVar.mo62930d(j);
            } else {
                Object a = mo62735a(j);
                if (a != null) {
                    return a;
                }
                if (!mo62939m(obj)) {
                    C69664n.m101059e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    C71693aa aaVar = new C71693aa(j, (C71696ad) obj, this);
                    if (j.f191159e.mo62679d(obj, aaVar)) {
                        try {
                            if (aaVar.mo62930d(j) != C71697ae.f191161a) {
                                boolean z = C71600ba.f191036a;
                                return null;
                            }
                        } catch (Throwable th) {
                            j.f191159e.mo62679d(aaVar, obj);
                            throw th;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo62974f(C71722d dVar, Object obj) {
        boolean z = obj == null;
        C71696ad h = mo62934h();
        if (h == null) {
            boolean z2 = C71600ba.f191036a;
            return;
        }
        C71696ad i = mo62935i();
        if (i == null) {
            boolean z3 = C71600ba.f191036a;
            return;
        }
        if (h.f191159e.mo62679d(dVar, z ? mo62933g(h, i) : i) && z) {
            mo62938l(i);
        }
    }

    /* renamed from: g */
    public abstract Object mo62933g(C71696ad adVar, C71696ad adVar2);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C71696ad mo62934h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C71696ad mo62935i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C71696ad mo62936j(C71703ak akVar) {
        throw null;
    }

    /* renamed from: k */
    public abstract void mo62937k(C71693aa aaVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo62938l(C71696ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo62939m(Object obj) {
        throw null;
    }
}
