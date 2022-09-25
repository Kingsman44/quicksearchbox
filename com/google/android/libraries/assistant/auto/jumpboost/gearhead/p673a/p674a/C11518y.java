package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import android.content.IntentFilter;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.y */
/* compiled from: PG */
final class C11518y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37397a;

    public C11518y(C11485ag agVar) {
        this.f37397a = agVar;
    }

    public final void run() {
        C11517x xVar = new C11517x(this.f37397a);
        C11485ag agVar = this.f37397a;
        agVar.f37314h.f37338f.set(xVar);
        agVar.f37316j.registerReceiver(xVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_ZWIEBACK_DEBUG_INTENT"));
    }
}
