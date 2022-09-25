package com.google.android.libraries.p1963i;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.m */
/* compiled from: PG */
public final /* synthetic */ class C23909m implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f65391a;

    public /* synthetic */ C23909m(ThreadFactory threadFactory) {
        this.f65391a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f65391a.newThread(new C23906j(runnable));
    }
}
