package com.google.android.enterprise.connectedapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Objects;

/* renamed from: com.google.android.enterprise.connectedapps.y */
/* compiled from: PG */
final class C142622y extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        for (C142543ac acVar : C142543ac.f386805b) {
            ScheduledExecutorService scheduledExecutorService = acVar.f386808c;
            Objects.requireNonNull(acVar);
            scheduledExecutorService.execute(new C142621x(acVar));
        }
    }
}
