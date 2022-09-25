package p5488io.p5490b.p5497e.p5498a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69816i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.a.d */
/* compiled from: PG */
public enum C69828d implements C69803b {
    ;

    private C69828d() {
    }

    /* renamed from: a */
    public static void m101305a() {
        C70101a.m102023e(new C69816i("Disposable already set!"));
    }

    /* renamed from: b */
    public static boolean m101306b(C69803b bVar) {
        return bVar == f186198a;
    }

    /* renamed from: c */
    public static boolean m101307c(AtomicReference atomicReference, C69803b bVar) {
        C69841j.m101337b(bVar, "d is null");
        if (C69827c.m101304a(atomicReference, (Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == f186198a) {
            return false;
        }
        m101305a();
        return false;
    }

    /* renamed from: d */
    public static boolean m101308d(C69803b bVar, C69803b bVar2) {
        if (bVar2 == null) {
            C70101a.m102023e(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            m101305a();
            return false;
        }
    }

    /* renamed from: f */
    public static void m101309f(AtomicReference atomicReference) {
        C69803b bVar;
        C69803b bVar2 = (C69803b) atomicReference.get();
        C69828d dVar = f186198a;
        if (bVar2 != dVar && (bVar = (C69803b) atomicReference.getAndSet(dVar)) != dVar && bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: g */
    public static void m101310g(AtomicReference atomicReference, C69803b bVar) {
        C69803b bVar2;
        do {
            bVar2 = (C69803b) atomicReference.get();
            if (bVar2 == f186198a) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
        } while (!C69827c.m101304a(atomicReference, bVar2, bVar));
    }

    /* renamed from: h */
    public static void m101311h(AtomicReference atomicReference, C69803b bVar) {
        C69803b bVar2;
        do {
            bVar2 = (C69803b) atomicReference.get();
            if (bVar2 == f186198a) {
                bVar.dispose();
                return;
            }
        } while (!C69827c.m101304a(atomicReference, bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    /* renamed from: i */
    public static void m101312i(AtomicReference atomicReference, C69803b bVar) {
        if (!C69827c.m101304a(atomicReference, (Object) null, bVar) && atomicReference.get() == f186198a) {
            bVar.dispose();
        }
    }

    public final void dispose() {
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
