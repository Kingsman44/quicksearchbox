package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ai */
/* compiled from: PG */
public final /* synthetic */ class C110459ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C110460aj f307941a;

    public /* synthetic */ C110459ai(C110460aj ajVar) {
        this.f307941a = ajVar;
    }

    public final void run() {
        C110460aj ajVar = this.f307941a;
        Intent className = new Intent().setClassName(ajVar.getContext(), "com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.SuwActivity");
        className.putExtra("intent_extra_enable_hardware_button_screen", true);
        className.putExtra("intent_extra_orientation_mode", ajVar.getActivity().getRequestedOrientation());
        Bundle bundle = ajVar.getArguments().getBundle("opa_suw_intent_extras_param");
        if (bundle != null) {
            className.putExtra("intent_extra_hardware_button_position", bundle.getString("opaSuwHardwareButtonPosition"));
        }
        C45250g.m80605a(ajVar.getActivity().getIntent(), className);
        C45304a.m80751g(ajVar.getActivity(), className, 10002);
    }
}
