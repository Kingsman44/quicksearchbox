package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.an */
/* compiled from: PG */
final class C104312an implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C104314ap f290172a;

    public C104312an(C104314ap apVar) {
        this.f290172a = apVar;
    }

    public final void onClick(View view) {
        C91857e eVar = this.f290172a.f290316k;
        if (eVar != null) {
            eVar.mo86359a("EVENT_DISPLAY_CARD_ACTION_DIALOG", "CapModulePresenter", ProtoParcelable.f63423a);
        }
    }
}
