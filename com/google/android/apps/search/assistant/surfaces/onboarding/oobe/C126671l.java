package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36678f;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36684d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a.C36687c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.C49923e;
import com.google.assistant.p3861at.C49950f;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.l */
/* compiled from: PG */
public final /* synthetic */ class C126671l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126674o f348821a;

    public /* synthetic */ C126671l(C126674o oVar) {
        this.f348821a = oVar;
    }

    public final void onClick(View view) {
        C126674o oVar = this.f348821a;
        C58480gp e = C58485gu.m89837e();
        C36687c cVar = (C36687c) oVar.f348831f.requireView().findViewById(R.id.assistant_oobe_aol_opt_in);
        if (cVar != null) {
            e.mo55395g(oVar.f348842q.mo40251o(cVar.f95575a.isChecked() ? C9855w.ENABLED : C9855w.DISABLED));
        }
        C36687c cVar2 = (C36687c) oVar.f348831f.requireView().findViewById(R.id.assistant_oobe_skip_voice_recognition_opt_in);
        if (cVar2 != null) {
            e.mo55395g(oVar.f348842q.mo40253q(cVar2.f95575a.isChecked()));
        }
        C36687c cVar3 = (C36687c) oVar.f348831f.requireView().findViewById(R.id.assistant_oobe_email_opt_in);
        if (cVar3 != null) {
            boolean isChecked = cVar3.f95575a.isChecked();
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
            oVar.f348830e.mo50445g(C46438d.m82809a(oVar.f348842q.mo40255s(oVar.f348834i, (acx) acw.build())), new C46436b((Object) null), oVar.f348841p);
            C36624a aVar = oVar.f348842q;
            int i = 1;
            if (true == isChecked) {
                i = 2;
            }
            e.mo55395g(aVar.mo40252p(i));
        }
        oVar.f348830e.mo50428h(C46438d.m82810b(C36678f.m65268a(e.mo55394f())).f121541a, (Object) null, oVar.f348839n);
        oVar.f348830e.mo50428h(C46438d.m82810b(oVar.f348838m.mo40316b("get_more_screen_interaction_count_key")).f121541a, (Object) null, oVar.f348840o);
        C47393f.m84236g(C36684d.m65278c(oVar.f348832g, oVar.f348834i), oVar.f348831f);
        oVar.f348837l.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(oVar.f348831f.requireView().findViewById(R.id.assistant_oobe_empty_action_button)));
        oVar.f348833h.mo19974a(C37176a.f97254iA);
    }
}
