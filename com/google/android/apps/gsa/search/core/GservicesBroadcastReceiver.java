package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;

/* compiled from: PG */
public class GservicesBroadcastReceiver extends C85630ao {

    /* renamed from: a */
    public C118561t f229542a;

    public GservicesBroadcastReceiver() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(18);
        if (this.f229542a == null) {
            try {
                mo79110a(context);
            } catch (ClassCastException unused) {
                return;
            }
        }
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            this.f229542a.mo103751b(C118522by.UPDATE_GSERVICES_CONFIG, C118472ag.f328819i);
        }
    }
}
