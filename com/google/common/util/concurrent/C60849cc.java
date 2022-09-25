package com.google.common.util.concurrent;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.util.concurrent.p4579a.C60792a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.cc */
/* compiled from: PG */
final class C60849cc implements Runnable {

    /* renamed from: a */
    final Future f164934a;

    /* renamed from: b */
    final C60845bz f164935b;

    public C60849cc(Future future, C60845bz bzVar) {
        this.f164934a = future;
        this.f164935b = bzVar;
    }

    public final void run() {
        Throwable k;
        Future future = this.f164934a;
        if (!(future instanceof C60792a) || (k = ((C60792a) future).mo57252k()) == null) {
            try {
                this.f164935b.mo17911gm(C60856cj.m92909r(this.f164934a));
            } catch (ExecutionException e) {
                this.f164935b.mo17910gl(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f164935b.mo17910gl(e2);
            }
        } else {
            this.f164935b.mo17910gl(k);
        }
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56101a().f156625b = this.f164935b;
        return b.toString();
    }
}
