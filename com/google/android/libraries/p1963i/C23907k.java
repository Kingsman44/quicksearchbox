package com.google.android.libraries.p1963i;

import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.k */
/* compiled from: PG */
public final /* synthetic */ class C23907k implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f65387a;

    /* renamed from: b */
    public final /* synthetic */ StrictMode.ThreadPolicy f65388b;

    public /* synthetic */ C23907k(ThreadFactory threadFactory, StrictMode.ThreadPolicy threadPolicy) {
        this.f65387a = threadFactory;
        this.f65388b = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f65387a.newThread(new C23908l(this.f65388b, runnable));
    }
}
