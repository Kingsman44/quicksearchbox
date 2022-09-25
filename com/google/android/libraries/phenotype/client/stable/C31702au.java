package com.google.android.libraries.phenotype.client.stable;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.phenotype.client.stable.au */
/* compiled from: PG */
public final /* synthetic */ class C31702au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExecutionException f85241a;

    public /* synthetic */ C31702au(ExecutionException executionException) {
        this.f85241a = executionException;
    }

    public final void run() {
        throw new RuntimeException(this.f85241a.getCause());
    }
}
