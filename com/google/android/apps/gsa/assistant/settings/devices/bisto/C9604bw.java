package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bw */
/* compiled from: PG */
public final /* synthetic */ class C9604bw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33213a;

    public /* synthetic */ C9604bw(C9619ck ckVar) {
        this.f33213a = ckVar;
    }

    public final void run() {
        C9619ck ckVar = this.f33213a;
        C91097g f = ckVar.mo17793f();
        C9616ch chVar = new C9616ch(ckVar, f);
        if (ckVar.f33287u == null) {
            ckVar.f33287u = new C9618cj(chVar);
            ckVar.f32988d.registerReceiver(ckVar.f33287u, new IntentFilter("com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED"));
        }
        ckVar.f33288v = C83395k.m132735f(ckVar.f32988d, ckVar.f33285s, chVar);
        Intent c = C83395k.m132732c(ckVar.f32988d);
        ckVar.f33289w = true;
        if (f != null) {
            f.mo65090b(c, C9617ci.f33234a);
        }
    }
}
