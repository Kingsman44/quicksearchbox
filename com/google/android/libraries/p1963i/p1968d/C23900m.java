package com.google.android.libraries.p1963i.p1968d;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.d.m */
/* compiled from: PG */
public final class C23900m implements ThreadFactory {

    /* renamed from: a */
    public final C23896i f65379a;

    /* renamed from: b */
    private final ThreadFactory f65380b;

    public C23900m(ThreadFactory threadFactory, C23896i iVar) {
        this.f65380b = threadFactory;
        this.f65379a = iVar;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f65380b.newThread(new C23899l(this, runnable));
    }
}
