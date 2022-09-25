package com.google.apps.tiktok.lifecycle;

import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.lifecycle.h */
/* compiled from: PG */
public final class C47439h {

    /* renamed from: a */
    public final LifecycleMemoizingObserver f123205a;

    private C47439h(LifecycleMemoizingObserver lifecycleMemoizingObserver) {
        this.f123205a = lifecycleMemoizingObserver;
    }

    /* renamed from: a */
    public static C47439h m84309a(C2391v vVar, C2371bs bsVar) {
        LifecycleMemoizingObserver lifecycleMemoizingObserver = (LifecycleMemoizingObserver) new C2368bp(bsVar.getViewModelStore(), (C2363bk) new C47438g()).mo5770a(LifecycleMemoizingObserver.class);
        C2384o lifecycle = vVar.getLifecycle();
        C58838bb.m90884s(lifecycleMemoizingObserver.f123148a == null, "LifecycleMemoizingObserver is already observing a lifecycle.");
        lifecycleMemoizingObserver.f123148a = lifecycle;
        lifecycle.mo5790b(lifecycleMemoizingObserver);
        return new C47439h(lifecycleMemoizingObserver);
    }

    /* renamed from: b */
    public final Object mo51269b(int i, C47416b bVar) {
        return this.f123205a.mo51257g(i, bVar, C47420f.f123177a);
    }
}
