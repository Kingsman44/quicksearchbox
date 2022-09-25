package com.google.apps.tiktok.p3643g;

import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47822fd;
import com.google.apps.tiktok.tracing.C47865y;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.apps.tiktok.g.h */
/* compiled from: PG */
public final /* synthetic */ class C47092h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f122691a;

    public /* synthetic */ C47092h(C60870cx cxVar) {
        this.f122691a = cxVar;
    }

    public final void run() {
        try {
            C60856cj.m92909r(this.f122691a);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C46167as) {
                ((C59052c) ((C59052c) ((C59052c) C47098n.f122698a.mo56225c()).mo56382g(e)).mo56372aa(54756)).mo56386p("Got unexpected accountId. Was the account removed?");
            } else if (!(e.getCause() instanceof TimeoutException)) {
                C47822fd.m84998d(e.getCause());
            } else {
                Throwable cause = e.getCause();
                C47865y.m85085a(cause);
                throw C47822fd.m84995a(cause);
            }
        } catch (Throwable th) {
            C47822fd.m84998d(th);
        }
    }
}
