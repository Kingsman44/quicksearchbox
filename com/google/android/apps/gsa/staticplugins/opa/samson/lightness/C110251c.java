package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.lightness.c */
/* compiled from: PG */
public final /* synthetic */ class C110251c implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ BrightnessController f307265a;

    public /* synthetic */ C110251c(BrightnessController brightnessController) {
        this.f307265a = brightnessController;
    }

    public final void run() {
        BrightnessController brightnessController = this.f307265a;
        C59104x b = BrightnessController.f307232a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BrightCont");
        ((C59052c) ((C59052c) b).mo56372aa(25751)).mo56386p("Timeout apply AOD brightness mode");
        brightnessController.mo98494g(true);
    }
}
