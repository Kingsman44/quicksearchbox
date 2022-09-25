package com.google.android.libraries.geller.p1818f;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.geller.f.ci */
/* compiled from: PG */
final class C21853ci implements Executor {

    /* renamed from: a */
    public final int f60311a;

    /* renamed from: b */
    public final int f60312b;

    /* renamed from: c */
    private final Executor f60313c;

    public C21853ci(Executor executor, C58833ax axVar, C58833ax axVar2) {
        this.f60313c = executor;
        this.f60311a = ((Integer) axVar.mo56109e(0)).intValue();
        this.f60312b = ((Integer) axVar2.mo56109e(-1)).intValue();
    }

    public final void execute(Runnable runnable) {
        this.f60313c.execute(C47810es.m84977q(new C21852ch(this, runnable)));
    }
}
