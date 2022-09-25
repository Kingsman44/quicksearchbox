package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.az */
/* compiled from: PG */
public final /* synthetic */ class C110476az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C110478ba f307986a;

    public /* synthetic */ C110476az(C110478ba baVar) {
        this.f307986a = baVar;
    }

    public final void run() {
        String str;
        C110478ba baVar = this.f307986a;
        Intent className = new Intent().setClassName(baVar.getContext(), "com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.SuwActivity");
        className.putExtra("intent_extra_enable_settings_screen", true);
        className.putExtra("intent_extra_enable_t_ui", baVar.f307994c.mo79746e(C90062dn.f249215n));
        className.putExtra("intent_extra_vm_enabled", baVar.f307993b.mo87249w());
        if (baVar.f307995d.mo83834w()) {
            str = baVar.f307993b.mo87231e(Locale.getDefault().toString());
        } else {
            str = baVar.f307993b.mo87230d();
        }
        className.putExtra("intent_extra_x_google_hotword", str);
        className.putExtra("intent_extra_orientation_mode", baVar.getActivity().getRequestedOrientation());
        C45250g.m80605a(baVar.getActivity().getIntent(), className);
        if (baVar.getArguments().getBoolean("intent_extra_use_unicorn_flow")) {
            className.putExtra("intent_extra_use_unicorn_flow", true);
            className.putExtra("intent_extra_given_name", baVar.getArguments().getString("intent_extra_given_name"));
            className.putExtra("intent_extra_standard_gender", baVar.getArguments().getInt("intent_extra_standard_gender"));
        }
        C45304a.m80751g(baVar.getActivity(), className, 10002);
    }
}
