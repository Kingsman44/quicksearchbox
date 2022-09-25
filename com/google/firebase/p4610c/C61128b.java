package com.google.firebase.p4610c;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.c.b */
/* compiled from: PG */
public final /* synthetic */ class C61128b implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C61128b f165448a = new C61128b();

    private /* synthetic */ C61128b() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
