package com.google.android.libraries.p1963i.p1967c;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.c.i */
/* compiled from: PG */
public final class C23880i implements ThreadFactory {

    /* renamed from: a */
    public final HashSet f65347a = new HashSet();

    /* renamed from: b */
    private final ThreadFactory f65348b;

    public C23880i(ThreadFactory threadFactory) {
        this.f65348b = threadFactory;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList mo29278a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f65347a);
        }
        return arrayList;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f65348b.newThread(new C23879h(this, runnable));
        synchronized (this) {
            this.f65347a.add(newThread);
        }
        return newThread;
    }
}
