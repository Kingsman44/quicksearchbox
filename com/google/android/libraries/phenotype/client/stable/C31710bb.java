package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.util.Log;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bb */
/* compiled from: PG */
public final /* synthetic */ class C31710bb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60838bs f85257a;

    /* renamed from: b */
    public final /* synthetic */ String f85258b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f85259c;

    public /* synthetic */ C31710bb(C60838bs bsVar, String str, BroadcastReceiver.PendingResult pendingResult) {
        this.f85257a = bsVar;
        this.f85258b = str;
        this.f85259c = pendingResult;
    }

    public final void run() {
        C60838bs bsVar = this.f85257a;
        String str = this.f85258b;
        BroadcastReceiver.PendingResult pendingResult = this.f85259c;
        try {
            C60856cj.m92909r(bsVar);
            Log.i("PhenotypeBackgroundRecv", "Successfully updated snapshot for " + str);
        } catch (ExecutionException e) {
            Log.w("PhenotypeBackgroundRecv", "Failed to update local snapshot for " + str, e);
        } finally {
            pendingResult.finish();
        }
    }
}
