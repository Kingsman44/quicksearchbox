package com.google.android.gms.learning.dynamite.training;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.learning.dynamite.training.bb */
/* compiled from: PG */
final class C144686bb extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ InAppTrainingServiceImpl f391457a;

    public C144686bb(InAppTrainingServiceImpl inAppTrainingServiceImpl) {
        this.f391457a = inAppTrainingServiceImpl;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391457a;
            inAppTrainingServiceImpl.f391391g.mo120056h(97);
            inAppTrainingServiceImpl.mo120128f();
        }
    }
}
