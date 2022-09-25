package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ab */
/* compiled from: PG */
public final /* synthetic */ class C116438ab implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C116446aj f322873a;

    public /* synthetic */ C116438ab(C116446aj ajVar) {
        this.f322873a = ajVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        Interstitial interstitial = this.f322873a.f322886d;
        if (!axVar.mo56113h()) {
            interstitial.findViewById(R.id.interstitial_progress_v2).setVisibility(0);
            return;
        }
        interstitial.removeCallbacks(interstitial.f322862d);
        interstitial.f322861c = ((C116426e) axVar.mo56107c()).f322832a;
        int height = interstitial.getHeight();
        interstitial.getLayoutParams().height = height;
        interstitial.f322864f.setAdapter(interstitial.f322867i);
        interstitial.f322864f.setVisibility(0);
        interstitial.f322864f.setAlpha(0.0f);
        interstitial.announceForAccessibility(interstitial.getResources().getText(R.string.save_save_to_list_v2));
        interstitial.f322864f.post(new C116462o(interstitial, height));
    }
}
