package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.db */
/* compiled from: PG */
final class C114859db implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Intent f318659a;

    /* renamed from: b */
    final /* synthetic */ C114860dc f318660b;

    public C114859db(C114860dc dcVar, Intent intent) {
        this.f318660b = dcVar;
        this.f318659a = intent;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C114860dc.f318661a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(29579)).mo56386p("#handleHomescreenShortcutCardAction(): failed to add shortcut");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C114860dc dcVar = this.f318660b;
            Intent intent = this.f318659a;
            if (intent.hasExtra("card_id")) {
                Intent intent2 = new Intent();
                intent2.putExtra("zero_state_action_name", "DismissCardAction");
                intent2.putExtra("card_id", intent.getStringExtra("card_id"));
                intent2.putExtra("enable_dismissal_undo_snackbar", false);
                intent2.putExtra("enable_dismissal_ve_grafting", false);
                intent2.putExtra("dismissal_on_client_only", true);
                dcVar.mo101659d(intent2, (C114750d) null);
                return;
            }
            return;
        }
        C59104x c = C114860dc.f318661a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
        ((C59052c) ((C59052c) c).mo56372aa(29580)).mo56386p("#handleHomescreenShortcutCardAction(): failed to add shortcut");
    }
}
