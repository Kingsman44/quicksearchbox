package com.google.android.libraries.social.populous.p3296e.p3298b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.social.populous.e.b.n */
/* compiled from: PG */
public final class C42435n {

    /* renamed from: a */
    private boolean f111344a = false;

    /* renamed from: b */
    private final List f111345b = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo45492a() {
        this.f111344a = true;
        for (C42434m mVar : this.f111345b) {
            if (!mVar.f111343a.isDone()) {
                mVar.f111343a.cancel(true);
            }
        }
        this.f111345b.clear();
    }

    /* renamed from: b */
    public final synchronized boolean mo45493b() {
        return this.f111344a;
    }

    /* renamed from: c */
    public final synchronized void mo45494c(Future future) {
        if (mo45493b()) {
            future.cancel(true);
        } else {
            this.f111345b.add(new C42434m(future));
        }
    }

    /* renamed from: d */
    public final synchronized void mo45495d(Runnable runnable) {
        if (mo45493b()) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public final synchronized void mo45496e(Runnable runnable) {
        if (!mo45493b()) {
            runnable.run();
        }
    }
}
