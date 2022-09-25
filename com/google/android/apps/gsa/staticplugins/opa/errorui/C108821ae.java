package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49923e;
import com.google.assistant.p3861at.C49950f;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ae */
/* compiled from: PG */
final class C108821ae implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108823ag f302588a;

    public C108821ae(C108823ag agVar) {
        this.f302588a = agVar;
    }

    public final void onClick(View view) {
        View view2 = this.f302588a.getView();
        view2.getClass();
        boolean isChecked = ((LegacyOpaStandardPage) view2).f228724c.f228880c.isChecked();
        C108823ag agVar = this.f302588a;
        agVar.f302593d.edit().putInt("opa_email_opt_in_status", true != isChecked ? 1 : 2).apply();
        C49923e eVar = (C49923e) C49950f.f129847h.createBuilder();
        eVar.copyOnWrite();
        C49950f fVar = (C49950f) eVar.instance;
        fVar.f129849a |= 64;
        fVar.f129852d = isChecked;
        C49950f fVar2 = (C49950f) eVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        fVar2.getClass();
        acx.f128989f = fVar2;
        acx.f128984a |= 8;
        agVar.f302594e.l(agVar.f302591b.mo79668a(), C49875cf.NEXUS, (acx) acw.build(), new C108822af(agVar.getActivity().getApplicationContext()), agVar.getClass().getSimpleName());
        C108823ag agVar2 = this.f302588a;
        int i = true != isChecked ? 33718 : 33717;
        View view3 = agVar2.getView();
        view3.getClass();
        Switch switchR = ((LegacyOpaStandardPage) view3).f228724c.f228880c;
        C28295m.m52919e(switchR, new C28292j(i));
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR), agVar2.getView()), false);
        this.f302588a.mo77318iT().mo77312a();
    }
}
