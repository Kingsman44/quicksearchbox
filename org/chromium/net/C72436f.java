package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: org.chromium.net.f */
/* compiled from: PG */
final class C72436f extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ Context f192655a;

    /* renamed from: b */
    final /* synthetic */ C72437g f192656b;

    public C72436f(C72437g gVar, Context context) {
        this.f192656b = gVar;
        this.f192655a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f192655a.unregisterReceiver(this);
        C72437g gVar = this.f192656b;
        C72438h hVar = gVar.f192657a;
        hVar.f192660b.getAuthToken(hVar.f192663e, hVar.f192662d, hVar.f192661c, true, new C72437g(gVar.f192658b, hVar), (Handler) null);
    }
}
