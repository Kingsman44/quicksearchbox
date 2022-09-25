package com.google.android.libraries.search.assistant.p2828y.p2838g.p2841c.p2842a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.libraries.search.assistant.y.g.c.a.b */
/* compiled from: PG */
final class C36945b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C36946c f96207a;

    public C36945b(C36946c cVar) {
        this.f96207a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent != null && "android.intent.action.PHONE_STATE".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("state")) != null) {
            for (C36944a a : this.f96207a.f96208a) {
                a.mo40468a(stringExtra);
            }
        }
    }
}
