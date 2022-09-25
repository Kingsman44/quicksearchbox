package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.awareness.fence.C142932a;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.e */
/* compiled from: PG */
final class C144037e implements Runnable {

    /* renamed from: a */
    private final C142932a f390296a;

    public C144037e(C142932a aVar, FenceStateImpl fenceStateImpl) {
        C143919bh.m233958a(aVar);
        this.f390296a = aVar;
        C143919bh.m233958a(fenceStateImpl);
    }

    public final void run() {
        this.f390296a.mo117824a();
    }
}
