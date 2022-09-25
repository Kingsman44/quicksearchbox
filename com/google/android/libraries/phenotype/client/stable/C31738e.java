package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.phenotype.client.stable.e */
/* compiled from: PG */
public final /* synthetic */ class C31738e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f85323a;

    public /* synthetic */ C31738e(BroadcastReceiver.PendingResult pendingResult) {
        this.f85323a = pendingResult;
    }

    public final Object call() {
        this.f85323a.finish();
        return null;
    }
}
