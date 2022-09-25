package com.google.android.apps.gsa.sidekick.main.optin;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.C143876h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.p */
/* compiled from: PG */
final class C91571p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C91574s f255414a;

    public C91571p(C91574s sVar) {
        this.f255414a = sVar;
    }

    public final void onClick(View view) {
        OptInActivity optInActivity = this.f255414a.f255418a;
        C84413ad adVar = optInActivity.f255361B;
        int i = optInActivity.f255387s;
        int i2 = C143699aa.f389596a;
        Intent k = C143876h.f389991d.mo119363k((Context) null, i, (String) null);
        if (k == null) {
            C58976aa aaVar = C58975e.f156826a;
            optInActivity.mo85935C(1);
        } else {
            optInActivity.f255363D.mo86240d(optInActivity, k);
            optInActivity.mo85937E(0, 4);
        }
        this.f255414a.dismiss();
    }
}
