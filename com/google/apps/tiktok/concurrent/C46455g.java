package com.google.apps.tiktok.concurrent;

import com.google.apps.tiktok.tracing.C47822fd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.apps.tiktok.concurrent.g */
/* compiled from: PG */
public final /* synthetic */ class C46455g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Future f121554a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121555b;

    public /* synthetic */ C46455g(Future future, C60870cx cxVar) {
        this.f121554a = future;
        this.f121555b = cxVar;
    }

    public final void run() {
        Future future = this.f121554a;
        C60870cx cxVar = this.f121555b;
        future.cancel(true);
        try {
            C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            C47822fd.m84998d(e.getCause());
        }
    }
}
