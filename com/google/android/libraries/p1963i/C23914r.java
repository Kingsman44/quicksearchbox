package com.google.android.libraries.p1963i;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.r */
/* compiled from: PG */
public final /* synthetic */ class C23914r implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f65395a;

    public /* synthetic */ C23914r(int i) {
        this.f65395a = i;
    }

    public final Thread newThread(Runnable runnable) {
        int i = this.f65395a;
        int a = C23915s.m44502a(i);
        Thread thread = new Thread(new C23913q(a, i, runnable));
        thread.setPriority(a);
        return thread;
    }
}
