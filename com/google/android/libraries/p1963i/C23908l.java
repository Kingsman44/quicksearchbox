package com.google.android.libraries.p1963i;

import android.os.StrictMode;

/* renamed from: com.google.android.libraries.i.l */
/* compiled from: PG */
public final /* synthetic */ class C23908l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StrictMode.ThreadPolicy f65389a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65390b;

    public /* synthetic */ C23908l(StrictMode.ThreadPolicy threadPolicy, Runnable runnable) {
        this.f65389a = threadPolicy;
        this.f65390b = runnable;
    }

    public final void run() {
        StrictMode.ThreadPolicy threadPolicy = this.f65389a;
        Runnable runnable = this.f65390b;
        StrictMode.setThreadPolicy(threadPolicy);
        runnable.run();
    }
}
