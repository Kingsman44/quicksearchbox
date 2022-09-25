package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ak */
/* compiled from: PG */
public final /* synthetic */ class C110461ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C110462al f307945a;

    public /* synthetic */ C110461ak(C110462al alVar) {
        this.f307945a = alVar;
    }

    public final void run() {
        String str;
        C110462al alVar = this.f307945a;
        Intent className = new Intent().setClassName(alVar.getContext(), "com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.SuwActivity");
        className.putExtra("intent_extra_enable_intro_screen", true);
        if (alVar.mo98702e()) {
            className.putExtra("intent_extra_enable_warm_word", true);
        }
        className.putExtra("intent_extra_enable_t_ui", alVar.f307947b.mo79746e(C90062dn.f249215n));
        if (alVar.f307949d.mo83834w()) {
            str = alVar.f307948c.mo87231e(Locale.getDefault().toString());
        } else {
            str = alVar.f307948c.mo87230d();
        }
        className.putExtra("intent_extra_x_google_hotword", str);
        className.putExtra("intent_extra_orientation_mode", alVar.getActivity().getRequestedOrientation());
        C45250g.m80605a(alVar.getActivity().getIntent(), className);
        if (alVar.f307947b.mo79746e(C90062dn.f249198B) && alVar.getArguments().getBoolean("intent_extra_intro_screen_neutral_buttons")) {
            className.putExtra("intent_extra_intro_screen_neutral_buttons", true);
        }
        if (alVar.getArguments().getBoolean("intent_extra_use_unicorn_flow")) {
            className.putExtra("intent_extra_use_unicorn_flow", true);
            className.putExtra("intent_extra_given_name", alVar.getArguments().getString("intent_extra_given_name"));
            className.putExtra("intent_extra_standard_gender", alVar.getArguments().getInt("intent_extra_standard_gender"));
        }
        C45304a.m80751g(alVar.getActivity(), className, 10001);
    }
}
