package com.google.apps.tiktok.lifecycle;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.lifecycle.g */
/* compiled from: PG */
final class C47438g implements C2363bk {
    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C58838bb.m90869d(LifecycleMemoizingObserver.class.equals(cls), "This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return new LifecycleMemoizingObserver();
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}
