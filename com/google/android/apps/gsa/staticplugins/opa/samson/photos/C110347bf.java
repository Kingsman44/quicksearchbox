package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bf */
/* compiled from: PG */
final class C110347bf extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BatteryStatusController f307562a;

    public C110347bf(BatteryStatusController batteryStatusController) {
        this.f307562a = batteryStatusController;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f307562a.mo98564c(intent);
    }
}
