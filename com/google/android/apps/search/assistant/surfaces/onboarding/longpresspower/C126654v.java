package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.app.KeyguardManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.v */
/* compiled from: PG */
public final /* synthetic */ class C126654v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126656x f348782a;

    /* renamed from: b */
    public final /* synthetic */ boolean f348783b;

    public /* synthetic */ C126654v(C126656x xVar, boolean z) {
        this.f348782a = xVar;
        this.f348783b = z;
    }

    public final void onClick(View view) {
        C126656x xVar = this.f348782a;
        boolean z = this.f348783b;
        xVar.f348791f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(xVar.f348788c.requireView().findViewById(R.id.assistant_long_press_power_empty_skip_button)));
        KeyguardManager keyguardManager = (KeyguardManager) xVar.f348788c.getContext().getSystemService(KeyguardManager.class);
        if (keyguardManager.isDeviceLocked()) {
            keyguardManager.requestDismissKeyguard(xVar.f348788c.getActivity(), new C126655w(xVar, z));
        }
        if (z) {
            xVar.f348788c.getActivity().setResult(1);
        } else {
            xVar.mo107663a();
        }
        xVar.f348788c.getActivity().finish();
    }
}
