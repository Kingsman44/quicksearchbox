package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.m */
/* compiled from: PG */
final class C110175m extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110176n f306994a;

    public C110175m(C110176n nVar) {
        this.f306994a = nVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            C58976aa aaVar = C58975e.f156826a;
            this.f306994a.mo98452a();
            C110176n nVar = this.f306994a;
            if (nVar.f307004j != null && nVar.f306998d.isShown()) {
                C110176n nVar2 = this.f306994a;
                C110168f fVar = nVar2.f307005k;
                byte[] bArr = nVar2.f307004j;
                bArr.getClass();
                fVar.mo98444b(new C110167e(fVar.f306985a, bArr, new C110163a(fVar)));
            }
        }
    }
}
