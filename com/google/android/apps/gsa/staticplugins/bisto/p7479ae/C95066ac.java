package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ac */
/* compiled from: PG */
public final /* synthetic */ class C95066ac implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final /* synthetic */ C95073aj f265955a;

    public /* synthetic */ C95066ac(C95073aj ajVar) {
        this.f265955a = ajVar;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        C95073aj ajVar = this.f265955a;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 0) {
            ajVar.f265977k.mo76703c();
        } else {
            ajVar.f265977k.mo76702b();
        }
    }
}
