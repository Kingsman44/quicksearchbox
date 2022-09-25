package androidx.work.impl.utils.p209a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: androidx.work.impl.utils.a.g */
/* compiled from: PG */
final class C4573g extends C4567a {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f14430a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater f14431b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater f14432c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater f14433d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater f14434e;

    public C4573g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14430a = atomicReferenceFieldUpdater;
        this.f14431b = atomicReferenceFieldUpdater2;
        this.f14432c = atomicReferenceFieldUpdater3;
        this.f14433d = atomicReferenceFieldUpdater4;
        this.f14434e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    public final void mo9522a(C4576j jVar, C4576j jVar2) {
        this.f14431b.lazySet(jVar, jVar2);
    }

    /* renamed from: b */
    public final void mo9523b(C4576j jVar, Thread thread) {
        this.f14430a.lazySet(jVar, thread);
    }

    /* renamed from: c */
    public final boolean mo9524c(C4577k kVar, C4571e eVar, C4571e eVar2) {
        return C4572f.m12961a(this.f14433d, kVar, eVar, eVar2);
    }

    /* renamed from: d */
    public final boolean mo9525d(C4577k kVar, Object obj, Object obj2) {
        return C4572f.m12961a(this.f14434e, kVar, obj, obj2);
    }

    /* renamed from: e */
    public final boolean mo9526e(C4577k kVar, C4576j jVar, C4576j jVar2) {
        return C4572f.m12961a(this.f14432c, kVar, jVar, jVar2);
    }
}
