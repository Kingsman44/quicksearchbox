package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.g */
/* compiled from: PG */
public final /* synthetic */ class C115062g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AmbientMediaSectionController f319394a;

    /* renamed from: b */
    public final /* synthetic */ Intent f319395b;

    public /* synthetic */ C115062g(AmbientMediaSectionController ambientMediaSectionController, Intent intent) {
        this.f319394a = ambientMediaSectionController;
        this.f319395b = intent;
    }

    public final void onClick(View view) {
        AmbientMediaSectionController ambientMediaSectionController = this.f319394a;
        ambientMediaSectionController.f319068g.mo65090b(this.f319395b, new C91095e());
    }
}
