package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114801ay;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.TimerTask;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cb */
/* compiled from: PG */
final class C114672cb extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ String f318118a;

    /* renamed from: b */
    final /* synthetic */ C114675ce f318119b;

    public C114672cb(C114675ce ceVar, String str) {
        this.f318119b = ceVar;
        this.f318118a = str;
    }

    public final void run() {
        C114675ce ceVar = this.f318119b;
        try {
            ceVar.f318122a.f318137k.mo28211k(((C114801ay) ceVar.f318122a.f318141o.mo27525b()).mo101604a((String) C114872do.m190399b(this.f318118a).get("zero_state_deep_link_url")), "onShortcutInstalled", new C114673cc(ceVar));
        } catch (IOException | ClassNotFoundException | RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56382g(e)).mo56372aa(29327)).mo56386p("#handleHomescreenShortcutCardAction(): exception");
        }
    }
}
