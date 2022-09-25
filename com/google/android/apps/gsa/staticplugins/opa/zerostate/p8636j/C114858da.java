package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;
import java.util.TimerTask;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.da */
/* compiled from: PG */
final class C114858da extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ Intent f318656a;

    /* renamed from: b */
    final /* synthetic */ String f318657b;

    /* renamed from: c */
    final /* synthetic */ C114860dc f318658c;

    public C114858da(C114860dc dcVar, Intent intent, String str) {
        this.f318658c = dcVar;
        this.f318656a = intent;
        this.f318657b = str;
    }

    public final void run() {
        C114860dc dcVar = this.f318658c;
        Intent intent = this.f318656a;
        dcVar.f318674g.mo28211k(((C114801ay) dcVar.f318679l.mo27525b()).mo101604a(this.f318657b), "onShortcutInstalled", new C114859db(dcVar, intent));
    }
}
