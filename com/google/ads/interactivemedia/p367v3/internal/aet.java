package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aet */
final /* synthetic */ class aet implements ThreadFactory {

    /* renamed from: a */
    private final String f20465a;

    public aet(String str) {
        this.f20465a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f20465a);
    }
}
