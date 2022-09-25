package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.u */
/* compiled from: PG */
final class C61229u extends BroadcastReceiver {

    /* renamed from: a */
    public C61230v f165623a;

    public C61229u(C61230v vVar) {
        this.f165623a = vVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C61230v vVar = this.f165623a;
        if (vVar != null && vVar.mo57802b()) {
            if (FirebaseInstanceId.m93588k()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            C61230v vVar2 = this.f165623a;
            FirebaseInstanceId firebaseInstanceId = vVar2.f165624a;
            FirebaseInstanceId.m93589m(vVar2, 0);
            this.f165623a.mo57801a().unregisterReceiver(this);
            this.f165623a = null;
        }
    }
}
