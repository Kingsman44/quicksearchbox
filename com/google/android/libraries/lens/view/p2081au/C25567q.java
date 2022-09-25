package com.google.android.libraries.lens.view.p2081au;

import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.au.q */
/* compiled from: PG */
final class C25567q extends C25569s implements C25568r {

    /* renamed from: c */
    private final Executor f69590c;

    public C25567q(Object obj, Executor executor, Runnable runnable) {
        super(obj, runnable);
        this.f69590c = executor;
    }

    /* renamed from: a */
    public final void mo30484a(Object obj) {
        this.f69590c.execute(C47810es.m84977q(new C25566p(this, obj)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo30654b(Object obj) {
        super.mo30603e(obj);
    }
}
