package com.google.apps.tiktok.concurrent;

import com.google.apps.tiktok.tracing.C47822fd;
import com.google.apps.tiktok.tracing.C47865y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.apps.tiktok.concurrent.c */
/* compiled from: PG */
public final /* synthetic */ class C46431c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121506a;

    public /* synthetic */ C46431c(C60870cx cxVar) {
        this.f121506a = cxVar;
    }

    public final void run() {
        try {
            C60856cj.m92909r(this.f121506a);
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof TimeoutException)) {
                C47822fd.m84998d(e.getCause());
                return;
            }
            Throwable cause = e.getCause();
            C47865y.m85085a(cause);
            throw C47822fd.m84995a(cause);
        }
    }
}
