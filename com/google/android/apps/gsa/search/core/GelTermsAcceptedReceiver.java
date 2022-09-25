package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class GelTermsAcceptedReceiver extends C85625am {

    /* renamed from: a */
    public SharedPreferences f229538a;

    public GelTermsAcceptedReceiver() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(16);
        mo79103a(context);
        if ("com.google.android.googlequicksearchbox.action.ACCEPT_GEL_TERMS".equals(intent.getAction())) {
            C58976aa aaVar = C58975e.f156826a;
            this.f229538a.edit().putBoolean("gel_usage_stats", true).apply();
        }
    }
}
