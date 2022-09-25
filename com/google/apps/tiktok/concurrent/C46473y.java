package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.concurrent.y */
/* compiled from: PG */
public final /* synthetic */ class C46473y implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121617a;

    /* renamed from: b */
    public final /* synthetic */ Executor f121618b;

    public /* synthetic */ C46473y(C60870cx cxVar, Executor executor) {
        this.f121617a = cxVar;
        this.f121618b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f121617a.mo4106b(runnable, this.f121618b);
    }
}
