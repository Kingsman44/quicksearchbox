package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.aj */
/* compiled from: PG */
final class C95223aj extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95225al f266405a;

    public C95223aj(C95225al alVar) {
        this.f266405a = alVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            C59104x b = C95225al.f266407a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ScoAudioRouteManager");
            ((C59052c) ((C59052c) b).mo56372aa(14766)).mo56387q("SCO state %d", intExtra);
            synchronized (this.f266405a) {
                if (intExtra == -1) {
                    this.f266405a.f266414h = false;
                    Exception exc = new Exception("SCO error");
                    SettableFuture settableFuture = this.f266405a.f266413g;
                    if (settableFuture != null) {
                        settableFuture.mo57357o(exc);
                        this.f266405a.f266413g = null;
                    }
                    SettableFuture settableFuture2 = this.f266405a.f266412f;
                    if (settableFuture2 != null) {
                        settableFuture2.mo57357o(exc);
                        this.f266405a.f266412f = null;
                    }
                } else if (intExtra == 0) {
                    C95225al alVar = this.f266405a;
                    alVar.f266414h = false;
                    SettableFuture settableFuture3 = alVar.f266413g;
                    if (settableFuture3 != null) {
                        settableFuture3.mo57356n(C118826c.f331422a);
                        this.f266405a.f266413g = null;
                    }
                } else if (intExtra == 1) {
                    C95225al alVar2 = this.f266405a;
                    alVar2.f266414h = true;
                    SettableFuture settableFuture4 = alVar2.f266412f;
                    if (settableFuture4 != null) {
                        settableFuture4.mo57356n(C118826c.f331422a);
                        this.f266405a.f266412f = null;
                    }
                }
            }
        }
    }
}
