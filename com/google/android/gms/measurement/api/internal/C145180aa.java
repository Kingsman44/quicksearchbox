package com.google.android.gms.measurement.api.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.measurement.api.internal.aa */
/* compiled from: PG */
final class C145180aa implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f392421a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f392421a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
