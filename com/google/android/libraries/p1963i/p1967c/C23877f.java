package com.google.android.libraries.p1963i.p1967c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.i.c.f */
/* compiled from: PG */
public final class C23877f implements ThreadFactory {

    /* renamed from: a */
    private final C23880i f65341a;

    /* renamed from: b */
    private final C23882k f65342b;

    /* renamed from: c */
    private final C23886o f65343c;

    /* renamed from: d */
    private final AtomicInteger f65344d;

    public C23877f(C23882k kVar, C23886o oVar, ThreadFactory threadFactory) {
        this.f65342b = kVar;
        this.f65343c = oVar;
        this.f65341a = new C23880i(threadFactory);
        this.f65344d = new AtomicInteger(oVar.mo29258e());
    }

    public final Thread newThread(Runnable runnable) {
        int size;
        Thread newThread = this.f65341a.newThread(runnable);
        if (C23881j.m44441c(this.f65343c.mo29257d())) {
            C23880i iVar = this.f65341a;
            synchronized (iVar) {
                size = iVar.f65347a.size();
            }
            if (size >= this.f65343c.mo29258e()) {
                while (true) {
                    int i = this.f65344d.get();
                    if (size < i) {
                        break;
                    } else if (this.f65344d.compareAndSet(i, i + i)) {
                        int e = this.f65343c.mo29258e();
                        C23881j.m44440b(this.f65342b, this.f65341a.mo29278a(), new C23885n("Number of blocking threads " + size + " exceeds starvation threshold of " + e));
                    }
                }
            }
        }
        return newThread;
    }
}
