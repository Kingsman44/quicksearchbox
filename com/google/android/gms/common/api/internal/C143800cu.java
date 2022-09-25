package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cu */
/* compiled from: PG */
final class C143800cu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143802cw f389841a;

    public C143800cu(C143802cw cwVar) {
        this.f389841a = cwVar;
    }

    public final void run() {
        this.f389841a.f389849f.mo119205b(new ConnectionResult(1, 4, (PendingIntent) null, (String) null));
    }
}
