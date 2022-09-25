package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.c.v */
/* compiled from: PG */
public final /* synthetic */ class C90956v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f254165a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f254166b;

    public /* synthetic */ C90956v(AtomicReference atomicReference, C60870cx cxVar) {
        this.f254165a = atomicReference;
        this.f254166b = cxVar;
    }

    public final void run() {
        AtomicReference atomicReference = this.f254165a;
        C60870cx cxVar = this.f254166b;
        C90869ac acVar = (C90869ac) atomicReference.get();
        if (acVar != null) {
            acVar.mo57358p(cxVar);
            atomicReference.set((Object) null);
        }
    }
}
