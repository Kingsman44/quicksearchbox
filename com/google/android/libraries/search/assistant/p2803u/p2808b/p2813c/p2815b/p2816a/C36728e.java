package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36678f;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36683c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C36728e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C36730g f95697a;

    public /* synthetic */ C36728e(C36730g gVar) {
        this.f95697a = gVar;
    }

    public final void onClick(View view) {
        C36730g gVar = this.f95697a;
        gVar.f95709k.mo19974a(C37176a.f97301iv);
        gVar.f95710l.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(gVar.f95705g.requireView().findViewById(R.id.assistant_oobe_empty_action_button)));
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(gVar.f95700b.mo40248l(gVar.f95702d));
        e.mo55395g(gVar.f95712n.mo40316b("consent_disclosures_screen_interaction_count_key"));
        C60870cx a = C36678f.m65268a(e.mo55394f());
        C46439e eVar = gVar.f95711m;
        C46438d b = C46438d.m82810b(a);
        eVar.mo50428h(b.f121541a, (Object) null, gVar.f95713o);
        C47393f.m84236g(C36683c.m65275c(5), gVar.f95705g);
    }
}
