package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b.C83986b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49923e;
import com.google.assistant.p3861at.C49950f;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.an */
/* compiled from: PG */
public final /* synthetic */ class C108830an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108836at f302603a;

    public /* synthetic */ C108830an(C108836at atVar) {
        this.f302603a = atVar;
    }

    public final void onClick(View view) {
        C108836at atVar = this.f302603a;
        ArrayList arrayList = new ArrayList();
        C83986b g = atVar.mo97210g(R.id.get_more_element_email);
        if (g != null) {
            boolean isChecked = g.f228785a.isChecked();
            atVar.f302618e.edit().putInt("opa_email_opt_in_status", true != isChecked ? 1 : 2).apply();
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
            atVar.f302619f.l(atVar.f302616c.mo79668a(), C49875cf.NEXUS, (acx) acw.build(), new C108835as(atVar.getActivity().getApplicationContext()), atVar.getClass().getSimpleName());
            Switch switchR = g.f228785a;
            C28295m.m52919e(switchR, new C28292j(true != isChecked ? 33718 : 33717));
            C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR), atVar.getView()), false);
        }
        C83986b g2 = atVar.mo97210g(R.id.get_more_element_screen_context);
        if (g2 != null) {
            boolean isChecked2 = g2.f228785a.isChecked();
            atVar.f302621h.mo17661b(isChecked2, new C9409b(atVar.getActivity(), atVar.f302622i));
            Switch switchR2 = g2.f228785a;
            C28295m.m52919e(switchR2, new C28292j(true != isChecked2 ? 25031 : 25030));
            C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR2), atVar.getView()), false);
        }
        C83986b g3 = atVar.mo97210g(R.id.get_more_element_assistant_on_lockscreen);
        if (g3 != null) {
            boolean isChecked3 = g3.f228785a.isChecked();
            if (atVar.f302630q.mo56113h()) {
                arrayList.add(((C9799ae) atVar.f302630q.mo56107c()).mo18047g(isChecked3 ? C9855w.ENABLED : C9855w.DISABLED));
                Switch switchR3 = g3.f228785a;
                C28295m.m52919e(switchR3, new C28292j(true != isChecked3 ? 121327 : 121326));
                C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR3), atVar.getView()), false);
            } else {
                throw new IllegalStateException("Cannot update AOL without AOL data service.");
            }
        }
        C83986b g4 = atVar.mo97210g(R.id.get_more_element_skip_voice_recognition);
        if (g4 != null) {
            boolean isChecked4 = g4.f228785a.isChecked();
            if (atVar.f302630q.mo56113h()) {
                arrayList.add(((C9799ae) atVar.f302630q.mo56107c()).mo18048h(isChecked4));
                Switch switchR4 = g4.f228785a;
                C28295m.m52919e(switchR4, new C28292j(true != isChecked4 ? 121329 : 121328));
                C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR4), atVar.getView()), false);
            } else {
                throw new IllegalStateException("Cannot update SVR without SVR data service.");
            }
        }
        C83986b g5 = atVar.mo97210g(R.id.get_more_element_app_shortcut);
        if (g5 != null) {
            boolean isChecked5 = g5.f228785a.isChecked();
            if (atVar.f302617d.mo79746e(C90014bt.f247062a) && isChecked5) {
                atVar.f302625l.mo97262a(((C73841bf) atVar.f302626m.mo27525b()).mo65322a().getString(R.string.opa_launcher_icon_text));
                atVar.f302615b = true;
            }
            Switch switchR5 = g5.f228785a;
            C28295m.m52919e(switchR5, new C28292j(true != isChecked5 ? 46045 : 46044));
            C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(switchR5), atVar.getView()), false);
        }
        C83986b g6 = atVar.mo97210g(R.id.get_more_element_continued_conversation);
        if (g6 != null) {
            if (g6.f228785a.isChecked()) {
                atVar.f302623j.mo97253a();
            } else {
                atVar.f302623j.mo97254b();
            }
        }
        C60856cj.m92892a(arrayList).mo57336c(new C108831ao(atVar), C60826bg.f164896a);
    }
}
