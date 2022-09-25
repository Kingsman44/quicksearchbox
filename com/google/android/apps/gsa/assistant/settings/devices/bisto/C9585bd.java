package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bd */
/* compiled from: PG */
public final /* synthetic */ class C9585bd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33191a;

    public /* synthetic */ C9585bd(C9619ck ckVar) {
        this.f33191a = ckVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9619ck ckVar = this.f33191a;
        C58976aa aaVar = C58975e.f156826a;
        ckVar.f32988d.sendBroadcast(new Intent().setClassName(ckVar.f32988d, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setAction("bisto_apply_ota").putExtra("key_device_id", ckVar.f33286t));
    }
}
