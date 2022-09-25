package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ba */
/* compiled from: PG */
public final /* synthetic */ class C86934ba implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f234766a;

    public /* synthetic */ C86934ba(BroadcastReceiver.PendingResult pendingResult) {
        this.f234766a = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f234766a;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
