package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ata */
/* compiled from: PG */
final class ata extends asv {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f21520a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater f21521b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater f21522c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater f21523d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater f21524e;

    public ata(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f21520a = atomicReferenceFieldUpdater;
        this.f21521b = atomicReferenceFieldUpdater2;
        this.f21522c = atomicReferenceFieldUpdater3;
        this.f21523d = atomicReferenceFieldUpdater4;
        this.f21524e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    public final void mo15379a(ath ath, Thread thread) {
        this.f21520a.lazySet(ath, thread);
    }

    /* renamed from: b */
    public final void mo15380b(ath ath, ath ath2) {
        this.f21521b.lazySet(ath, ath2);
    }

    /* renamed from: c */
    public final boolean mo15381c(ati ati, ath ath, ath ath2) {
        return ata$$ExternalSyntheticBackportWithForwarding0.m19556m(this.f21522c, ati, ath, ath2);
    }

    /* renamed from: d */
    public final boolean mo15382d(ati ati, asz asz, asz asz2) {
        return ata$$ExternalSyntheticBackportWithForwarding0.m19556m(this.f21523d, ati, asz, asz2);
    }

    /* renamed from: e */
    public final boolean mo15383e(ati ati, Object obj, Object obj2) {
        return ata$$ExternalSyntheticBackportWithForwarding0.m19556m(this.f21524e, ati, obj, obj2);
    }
}
