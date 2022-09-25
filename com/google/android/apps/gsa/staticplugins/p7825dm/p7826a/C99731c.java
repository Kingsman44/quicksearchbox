package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.c */
/* compiled from: PG */
public final /* synthetic */ class C99731c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99747s f279074a;

    public /* synthetic */ C99731c(C99747s sVar) {
        this.f279074a = sVar;
    }

    public final void run() {
        SettableFuture settableFuture;
        C99747s sVar = this.f279074a;
        int i = sVar.f279101j;
        if (i == 0) {
            throw null;
        } else if (i == 3 && (settableFuture = sVar.f279098g) != null && !settableFuture.isDone()) {
            C60870cx cxVar = sVar.f279097f;
            if (cxVar != null && !cxVar.isCancelled()) {
                sVar.f279097f.cancel(false);
            }
            SettableFuture settableFuture2 = sVar.f279098g;
            settableFuture2.getClass();
            settableFuture2.mo57356n((Object) null);
        }
    }
}
