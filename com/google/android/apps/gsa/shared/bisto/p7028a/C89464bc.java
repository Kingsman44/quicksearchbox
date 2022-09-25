package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bc */
/* compiled from: PG */
final class C89464bc extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C89474bm f242485a;

    public C89464bc(C89474bm bmVar) {
        this.f242485a = bmVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra("BistoDeviceDatabase.instance")) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (System.identityHashCode(this.f242485a) == intent.getIntExtra("BistoDeviceDatabase.instance", 0)) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f242485a.f242498e.execute(new C89463bb(this, intent));
        }
    }
}
