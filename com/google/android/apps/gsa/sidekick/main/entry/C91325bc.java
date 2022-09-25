package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bc */
/* compiled from: PG */
public final class C91325bc extends C91953ad {

    /* renamed from: a */
    private final C91307al f254874a;

    /* renamed from: b */
    private final Collection f254875b;

    public C91325bc(C91307al alVar, Collection collection) {
        this.f254874a = alVar;
        this.f254875b = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        Iterator it = this.f254875b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (C91978bb.m150941g((C7718hj) it.next(), hjVar)) {
                C7711hc hcVar = (C7711hc) hjVar.toBuilder();
                hcVar.copyOnWrite();
                C7718hj hjVar2 = (C7718hj) hcVar.instance;
                hjVar2.f26961b &= -1025;
                hjVar2.f26946R = false;
                hjVar = (C7718hj) hcVar.build();
                if (this.f256451g) {
                    this.f254874a.mo85601b(hjVar);
                }
            }
        }
        return hjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C7718hj mo85640e(C7718hj hjVar) {
        return mo85623c(hjVar);
    }
}
