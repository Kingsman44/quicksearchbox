package com.google.android.gms.common.util.p10784a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
/* compiled from: PG */
public final class C143999b implements ThreadFactory {

    /* renamed from: a */
    private final String f390238a;

    /* renamed from: b */
    private final ThreadFactory f390239b = Executors.defaultThreadFactory();

    public C143999b(String str) {
        this.f390238a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f390239b.newThread(new C144001d(runnable));
        newThread.setName(this.f390238a);
        return newThread;
    }
}
