package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10628a.C141305l;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ai */
/* compiled from: PG */
final class C141323ai implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141308aa f383667a;

    public C141323ai(C141308aa aaVar) {
        this.f383667a = aaVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C141308aa aaVar = this.f383667a;
        aaVar.f383651y = !aaVar.f383651y;
        PhonemeView phonemeView = (PhonemeView) view;
        phonemeView.mo17754z().mo116517a(aaVar.f383651y);
        if (aaVar.f383651y) {
            if (aaVar.f383646t) {
                cxVar = aaVar.f383635i.mo116333b(aaVar.f383630d.mo116380b(), phonemeView.mo17754z().f384088b, phonemeView.mo17754z().f384089c);
            } else {
                cxVar = aaVar.f383635i.mo116333b(aaVar.f383630d.mo116380b(), 0, 0);
            }
            C46439e eVar = aaVar.f383633g;
            C46438d b = C46438d.m82810b(cxVar);
            eVar.mo50428h(b.f121541a, (Object) null, aaVar.f383639m);
            aaVar.f383641o.mo116370j();
            return;
        }
        C141305l lVar = aaVar.f383635i;
        lVar.mo116332a(lVar.f383618e);
        aaVar.f383641o.mo116371k();
    }
}
