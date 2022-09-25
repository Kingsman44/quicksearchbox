package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import android.content.IntentFilter;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.w */
/* compiled from: PG */
final class C11516w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37395a;

    public C11516w(C11485ag agVar) {
        this.f37395a = agVar;
    }

    public final void run() {
        C11515v vVar = new C11515v(this.f37395a);
        C11485ag agVar = this.f37395a;
        agVar.f37314h.f37337e.set(vVar);
        agVar.f37316j.registerReceiver(vVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_VOICE_SESSION"));
    }
}
