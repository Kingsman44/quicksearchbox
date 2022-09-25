package com.google.ads.interactivemedia.p367v3.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.q */
/* compiled from: PG */
final class C7217q extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C7244r f23563a;

    public C7217q(C7244r rVar) {
        this.f23563a = rVar;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                C7244r.m21680f(this.f23563a, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                C7244r.m21680f(this.f23563a, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                C7244r.m21680f(this.f23563a, false);
            }
        }
    }
}
