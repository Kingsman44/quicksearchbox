package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.ee */
/* compiled from: PG */
final class C145333ee extends BroadcastReceiver {

    /* renamed from: a */
    public final C145488jy f392822a;

    /* renamed from: b */
    public boolean f392823b;

    /* renamed from: c */
    public boolean f392824c;

    public C145333ee(C145488jy jyVar) {
        this.f392822a = jyVar;
    }

    /* renamed from: a */
    public final void mo120909a() {
        this.f392822a.mo121218n();
        this.f392822a.mo120966as().mo120904g();
        this.f392822a.mo120966as().mo120904g();
        if (this.f392823b) {
            this.f392822a.mo120965ar().f392803k.mo120894a("Unregistering connectivity change receiver");
            this.f392823b = false;
            this.f392824c = false;
            try {
                this.f392822a.f393363k.f392931a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f392822a.mo120965ar().f392795c.mo120895b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f392822a.mo121218n();
        String action = intent.getAction();
        this.f392822a.mo120965ar().f392803k.mo120895b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C145331ec ecVar = this.f392822a.f393354b;
            C145488jy.m236409I(ecVar);
            boolean a = ecVar.mo120907a();
            if (this.f392824c != a) {
                this.f392824c = a;
                this.f392822a.mo120966as().mo120960h(new C145332ed(this));
                return;
            }
            return;
        }
        this.f392822a.mo120965ar().f392798f.mo120895b("NetworkBroadcastReceiver received unknown action", action);
    }
}
