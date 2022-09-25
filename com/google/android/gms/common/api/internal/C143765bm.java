package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.internal.C143899ao;

/* renamed from: com.google.android.gms.common.api.internal.bm */
/* compiled from: PG */
final class C143765bm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionResult f389762a;

    /* renamed from: b */
    final /* synthetic */ C143766bn f389763b;

    public C143765bm(C143766bn bnVar, ConnectionResult connectionResult) {
        this.f389763b = bnVar;
        this.f389762a = connectionResult;
    }

    public final void run() {
        C143766bn bnVar = this.f389763b;
        C143763bk bkVar = (C143763bk) bnVar.f389768e.f389781k.get(bnVar.f389765b);
        if (bkVar != null) {
            ConnectionResult connectionResult = this.f389762a;
            if (connectionResult.mo119068b()) {
                C143766bn bnVar2 = this.f389763b;
                bnVar2.f389767d = true;
                if (bnVar2.f389764a.mo117790j()) {
                    this.f389763b.mo119206c();
                    return;
                }
                try {
                    C143839k kVar = this.f389763b.f389764a;
                    kVar.mo119241E((C143899ao) null, kVar.mo119246u());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f389763b.f389764a.mo117783f("Failed to get service from broker.");
                    bkVar.mo119195j(new ConnectionResult(1, 10, (PendingIntent) null, (String) null), (Exception) null);
                }
            } else {
                bkVar.mo119195j(connectionResult, (Exception) null);
            }
        }
    }
}
