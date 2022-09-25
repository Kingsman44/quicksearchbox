package com.google.android.libraries.search.assistant.invocation.utils;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.invocation.utils.d */
/* compiled from: PG */
public final /* synthetic */ class C34720d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f92143a;

    public /* synthetic */ C34720d(C60870cx cxVar) {
        this.f92143a = cxVar;
    }

    public final void run() {
        this.f92143a.cancel(true);
    }
}
