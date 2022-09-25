package com.google.android.apps.gsa.search.core.google.gaia;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.x */
/* compiled from: PG */
public final /* synthetic */ class C86063x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232645a;

    /* renamed from: b */
    public final /* synthetic */ Intent f232646b;

    public /* synthetic */ C86063x(C86013ax axVar, Intent intent) {
        this.f232645a = axVar;
        this.f232646b = intent;
    }

    public final void run() {
        C86013ax axVar = this.f232645a;
        Intent intent = this.f232646b;
        intent.setPackage("com.google.android.googlequicksearchbox");
        axVar.f232559g.sendBroadcast(intent, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
    }
}
