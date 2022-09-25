package com.google.common.p4522b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.common.b.mg */
/* compiled from: PG */
final class C58633mg extends WeakReference implements C58632mf {

    /* renamed from: a */
    final C58608li f156347a;

    public C58633mg(ReferenceQueue referenceQueue, Object obj, C58608li liVar) {
        super(obj, referenceQueue);
        this.f156347a = liVar;
    }

    /* renamed from: a */
    public final C58608li mo55629a() {
        return this.f156347a;
    }

    /* renamed from: b */
    public final C58632mf mo55630b(ReferenceQueue referenceQueue, C58608li liVar) {
        return new C58633mg(referenceQueue, get(), liVar);
    }
}
