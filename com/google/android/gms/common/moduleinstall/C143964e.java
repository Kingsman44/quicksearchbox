package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.internal.C143919bh;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.moduleinstall.e */
/* compiled from: PG */
public final class C143964e {

    /* renamed from: a */
    public final List f390194a;

    /* renamed from: b */
    public final C143960a f390195b;

    /* renamed from: c */
    public final Executor f390196c;

    public C143964e(List list, C143960a aVar, Executor executor) {
        C143919bh.m233960c(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C143919bh.m233971n(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f390194a = list;
        this.f390195b = aVar;
        this.f390196c = executor;
    }
}
