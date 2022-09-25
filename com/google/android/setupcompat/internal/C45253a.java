package com.google.android.setupcompat.internal;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.setupcompat.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C45253a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f118200a = "SetupCompatServiceInvoker";

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f118200a);
    }
}
