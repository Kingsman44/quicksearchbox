package com.google.android.libraries.phenotype.client;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.phenotype.client.r */
/* compiled from: PG */
public final /* synthetic */ class C31679r implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C31679r f85191a = new C31679r();

    private /* synthetic */ C31679r() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
