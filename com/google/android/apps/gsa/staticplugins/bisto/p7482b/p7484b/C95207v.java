package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.v */
/* compiled from: PG */
public final class C95207v extends BroadcastReceiver {

    /* renamed from: a */
    public C95210y f266356a;

    /* renamed from: b */
    private final C60888db f266357b;

    public C95207v(C60888db dbVar) {
        this.f266357b = dbVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if ("android.intent.action.PACKAGE_RESTARTED".equals(intent.getAction()) || "android.intent.action.PACKAGE_REPLACED".equals(intent.getAction())) {
            C59071e eVar = C95210y.f266359j;
            C58976aa aaVar = C58975e.f156826a;
            if (dataString != null && dataString.equals("package:com.google.android.tts")) {
                this.f266357b.execute(new C95206u(this, context));
            }
        }
    }
}
