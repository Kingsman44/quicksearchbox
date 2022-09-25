package com.google.android.gms.common.util.p10784a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
/* compiled from: PG */
public final class C144000c implements ThreadFactory {

    /* renamed from: a */
    private final String f390240a = "GAC_Executor";

    /* renamed from: b */
    private final AtomicInteger f390241b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f390242c = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f390242c.newThread(new C144001d(runnable));
        String str = this.f390240a;
        int andIncrement = this.f390241b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
