package p5488io.p5490b.p5497e.p5512i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p5649d.C72640c;
import p5488io.p5490b.p5495c.C69816i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70082c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.i.c */
/* compiled from: PG */
public enum C70079c implements C72640c {
    ;

    private C70079c() {
    }

    /* renamed from: a */
    public static void m101972a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        C72640c cVar = (C72640c) atomicReference.get();
        if (cVar != null) {
            cVar.mo61489e(j);
        } else if (m101976g(j)) {
            C70082c.m101981a(atomicLong, j);
            C72640c cVar2 = (C72640c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.mo61489e(andSet);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m101973b() {
        C70101a.m102023e(new C69816i("Subscription already set!"));
    }

    /* renamed from: c */
    public static boolean m101974c(AtomicReference atomicReference) {
        C72640c cVar;
        C72640c cVar2 = (C72640c) atomicReference.get();
        C70079c cVar3 = f186810a;
        if (cVar2 == cVar3 || (cVar = (C72640c) atomicReference.getAndSet(cVar3)) == cVar3) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.mo61490lP();
        return true;
    }

    /* renamed from: f */
    public static boolean m101975f(AtomicReference atomicReference, C72640c cVar) {
        C69841j.m101337b(cVar, "s is null");
        while (!atomicReference.compareAndSet((Object) null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.mo61490lP();
                if (atomicReference.get() == f186810a) {
                    return false;
                }
                m101973b();
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m101976g(long j) {
        if (j > 0) {
            return true;
        }
        C70101a.m102023e(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: h */
    public static boolean m101977h(C72640c cVar, C72640c cVar2) {
        if (cVar2 == null) {
            C70101a.m102023e(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.mo61490lP();
            m101973b();
            return false;
        }
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
    }

    /* renamed from: lP */
    public final void mo61490lP() {
    }
}
