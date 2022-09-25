package com.google.apps.tiktok.tracing;

import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.apps.tiktok.tracing.fl */
/* compiled from: PG */
final class C47830fl extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        C47833fn fnVar = new C47833fn(C19559g.m37305d(Thread.currentThread()));
        Thread currentThread = Thread.currentThread();
        synchronized (C47831fm.f123851a) {
            C47831fm.f123851a.put(currentThread, fnVar);
        }
        return fnVar;
    }
}
