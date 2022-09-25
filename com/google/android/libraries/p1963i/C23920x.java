package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.x */
/* compiled from: PG */
public final /* synthetic */ class C23920x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23921y f65406a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65407b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f65408c;

    /* renamed from: d */
    public final /* synthetic */ C23826aa f65409d;

    /* renamed from: e */
    public final /* synthetic */ long f65410e;

    /* renamed from: f */
    public final /* synthetic */ TimeUnit f65411f;

    public /* synthetic */ C23920x(C23921y yVar, Runnable runnable, SettableFuture settableFuture, C23826aa aaVar, long j, TimeUnit timeUnit) {
        this.f65406a = yVar;
        this.f65407b = runnable;
        this.f65408c = settableFuture;
        this.f65409d = aaVar;
        this.f65410e = j;
        this.f65411f = timeUnit;
    }

    public final void run() {
        C23921y yVar = this.f65406a;
        Runnable runnable = this.f65407b;
        SettableFuture settableFuture = this.f65408c;
        C23826aa aaVar = this.f65409d;
        long j = this.f65410e;
        TimeUnit timeUnit = this.f65411f;
        try {
            runnable.run();
            if (!settableFuture.isDone()) {
                C60872cz d = yVar.f65418g.f65248a.mo29164d(yVar.f65412a, j, timeUnit);
                aaVar.f65245a = d;
                if (aaVar.isDone()) {
                    d.cancel(false);
                }
            }
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
        }
    }
}
