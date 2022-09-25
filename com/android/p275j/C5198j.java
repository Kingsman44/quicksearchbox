package com.android.p275j;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.j.j */
/* compiled from: PG */
public final class C5198j {

    /* renamed from: a */
    private final Executor f16497a;

    public C5198j(Handler handler) {
        this.f16497a = new C5196h(handler);
    }

    /* renamed from: a */
    public final void mo10285a(C5206r rVar, C5213y yVar) {
        rVar.mo10293c("post-error");
        C5210v vVar = new C5210v(yVar);
        Executor executor = this.f16497a;
        ((C5196h) executor).f16493a.post(new C5197i(rVar, vVar, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo10286b(C5206r rVar, C5210v vVar, Runnable runnable) {
        rVar.mo10296f();
        rVar.mo10293c("post-response");
        Executor executor = this.f16497a;
        ((C5196h) executor).f16493a.post(new C5197i(rVar, vVar, runnable));
    }
}
