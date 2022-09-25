package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.cd */
/* compiled from: PG */
final class C95798cd extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95801cg f268242a;

    public C95798cd(C95801cg cgVar) {
        this.f268242a = cgVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) == 2) {
            C58976aa aaVar = C58975e.f156826a;
            C95801cg cgVar = this.f268242a;
            String str = cgVar.f268247d;
            if (str != null) {
                if (!str.equals(cgVar.f268246c)) {
                    cgVar.mo89777a();
                } else {
                    cgVar.mo89778b();
                }
            }
        }
    }
}
