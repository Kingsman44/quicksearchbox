package com.google.android.libraries.componentview.p1697d;

import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.componentview.d.l */
/* compiled from: PG */
final class C20481l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f57597a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f57598b;

    public C20481l(SettableFuture settableFuture, C60870cx cxVar) {
        this.f57597a = settableFuture;
        this.f57598b = cxVar;
    }

    public final void run() {
        try {
            this.f57597a.mo57356n((C19744c) this.f57598b.get());
        } catch (Exception unused) {
            this.f57597a.mo57356n(new C19744c());
        }
    }
}
