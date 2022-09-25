package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.q */
/* compiled from: PG */
public class C90951q extends C60873d {

    /* renamed from: a */
    private final C58881cr f254154a;

    /* renamed from: b */
    private final AtomicBoolean f254155b = new AtomicBoolean(false);

    public C90951q(C58881cr crVar) {
        this.f254154a = crVar;
    }

    @Deprecated
    /* renamed from: e */
    public static C90951q m148569e(Object obj) {
        return new C90950p(new C58885cv(C60856cj.m92900i(obj)), obj);
    }

    /* renamed from: b */
    public void mo4106b(Runnable runnable, Executor executor) {
        mo85245d();
        super.mo4106b(runnable, executor);
    }

    /* renamed from: d */
    public void mo85245d() {
        if (!isCancelled() && this.f254155b.compareAndSet(false, true)) {
            mo57358p((C60870cx) ((C58885cv) this.f254154a).f156729a);
        }
    }

    public Object get() {
        mo85245d();
        return super.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        mo85245d();
        return super.get(j, timeUnit);
    }
}
