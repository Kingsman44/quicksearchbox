package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.t */
/* compiled from: PG */
final class C95244t extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95248x f266470a;

    public C95244t(C95248x xVar) {
        this.f266470a = xVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C59104x b = C95248x.f266475a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
        ((C59052c) ((C59052c) b).mo56372aa(14738)).mo56389s("received intent: %s", intent);
        if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            C59104x b2 = C95248x.f266475a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) b2).mo56372aa(14739)).mo56387q("SCO state %d", intExtra);
            synchronized (this.f266470a) {
                if (intExtra == 10) {
                    C95248x xVar = this.f266470a;
                    xVar.f266485k = false;
                    SettableFuture settableFuture = xVar.f266484j;
                    if (settableFuture != null) {
                        settableFuture.mo57356n(C118826c.f331422a);
                        this.f266470a.f266484j = null;
                    }
                } else if (intExtra == 12) {
                    C95248x xVar2 = this.f266470a;
                    xVar2.f266485k = true;
                    SettableFuture settableFuture2 = xVar2.f266483i;
                    if (settableFuture2 != null) {
                        settableFuture2.mo57356n(C118826c.f331422a);
                        this.f266470a.f266483i = null;
                    }
                }
            }
        }
    }
}
