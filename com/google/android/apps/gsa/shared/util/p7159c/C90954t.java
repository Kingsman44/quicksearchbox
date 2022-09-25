package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.c.t */
/* compiled from: PG */
public final /* synthetic */ class C90954t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f254161a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f254162b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f254163c;

    public /* synthetic */ C90954t(AtomicReference atomicReference, C60870cx cxVar, AtomicInteger atomicInteger) {
        this.f254161a = atomicReference;
        this.f254162b = cxVar;
        this.f254163c = atomicInteger;
    }

    public final void run() {
        AtomicReference atomicReference = this.f254161a;
        C60870cx cxVar = this.f254162b;
        AtomicInteger atomicInteger = this.f254163c;
        C90869ac acVar = (C90869ac) atomicReference.get();
        if (acVar != null) {
            try {
                Object r = C60856cj.m92909r(cxVar);
                atomicReference.set((Object) null);
                acVar.mo57356n(r);
            } catch (Throwable unused) {
                if (atomicInteger.decrementAndGet() == 0) {
                    acVar.mo57358p(cxVar);
                }
            }
        }
    }
}
