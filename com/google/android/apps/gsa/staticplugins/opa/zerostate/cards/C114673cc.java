package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cc */
/* compiled from: PG */
final class C114673cc implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C114675ce f318120a;

    public C114673cc(C114675ce ceVar) {
        this.f318120a = ceVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C114676cf.f318125a.mo56225c()).mo56382g(th)).mo56372aa(29319)).mo56386p("#handleHomescreenShortcutCardAction(): failed to add shortcut");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f318120a.mo101513b((Intent) null);
        } else {
            ((C59052c) ((C59052c) C114676cf.f318125a.mo56225c()).mo56372aa(29320)).mo56386p("#handleHomescreenShortcutCardAction(): failed to add shortcut");
        }
    }
}
