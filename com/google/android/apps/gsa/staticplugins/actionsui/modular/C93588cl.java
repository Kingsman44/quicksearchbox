package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cl */
/* compiled from: PG */
final class C93588cl extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ModularActionCardLabeledFooter f261299a;

    public C93588cl(ModularActionCardLabeledFooter modularActionCardLabeledFooter) {
        this.f261299a = modularActionCardLabeledFooter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        ModularActionCardLabeledFooter modularActionCardLabeledFooter = this.f261299a;
        C93602cz czVar = modularActionCardLabeledFooter.f261075e;
        czVar.getClass();
        C90464f a = czVar.f261319f.mo84210a(modularActionCardLabeledFooter.getContext());
        C90461c cVar = new C90461c();
        C88509c cVar2 = czVar.f239227c;
        cVar.f252689a = cVar2 instanceof View ? (View) cVar2 : null;
        cVar.f252707s = R.string.feedback_entrypoint_action_card;
        cVar.f252697i = null;
        a.mo84209b(cVar, 1);
    }
}
