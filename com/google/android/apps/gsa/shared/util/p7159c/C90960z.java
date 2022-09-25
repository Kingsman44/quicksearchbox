package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.c.z */
/* compiled from: PG */
public final /* synthetic */ class C90960z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f254169a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f254170b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f254171c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f254172d;

    public /* synthetic */ C90960z(AtomicReference atomicReference, C60870cx cxVar, AtomicReference atomicReference2, AtomicInteger atomicInteger) {
        this.f254169a = atomicReference;
        this.f254170b = cxVar;
        this.f254171c = atomicReference2;
        this.f254172d = atomicInteger;
    }

    public final void run() {
        AtomicReference atomicReference = this.f254169a;
        C60870cx cxVar = this.f254170b;
        AtomicReference atomicReference2 = this.f254171c;
        AtomicInteger atomicInteger = this.f254172d;
        C90869ac acVar = (C90869ac) atomicReference.get();
        if (acVar != null) {
            if (C90877ak.m148478l(cxVar)) {
                atomicReference2.set(C58833ax.m90834k(cxVar));
            } else {
                Object h = C90877ak.m148474h(cxVar);
                if (((C58833ax) h).mo56113h()) {
                    acVar.mo57356n(C58833ax.m90834k(h));
                    atomicReference.set((Object) null);
                    return;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                C58833ax axVar = (C58833ax) atomicReference2.get();
                if (axVar.mo56113h()) {
                    acVar.mo57358p(C60922j.m93044g((C60870cx) axVar.mo56107c(), C90955u.f254164a, C60826bg.f164896a));
                } else {
                    acVar.mo57356n(C58836b.f156633a);
                }
            }
        }
    }
}
