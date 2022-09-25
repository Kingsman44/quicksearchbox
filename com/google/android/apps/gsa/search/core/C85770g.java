package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.g */
/* compiled from: PG */
final class C85770g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BroadcastListenerService f231924a;

    public C85770g(BroadcastListenerService broadcastListenerService) {
        this.f231924a = broadcastListenerService;
    }

    public final void onReceive(Context context, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.f231924a.mo77871b(context, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.f231924a.mo77871b(context, false);
            BroadcastListenerService broadcastListenerService = this.f231924a;
            broadcastListenerService.mo77870a(context, broadcastListenerService.f229530d.isKeyguardLocked());
        } else if ("android.intent.action.USER_PRESENT".equals(action)) {
            this.f231924a.mo77870a(context, false);
        }
    }
}
