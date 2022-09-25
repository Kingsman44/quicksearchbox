package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114878j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cm */
/* compiled from: PG */
public final /* synthetic */ class C115036cm implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115041cr f319313a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f319314b;

    public /* synthetic */ C115036cm(C115041cr crVar, ImageView imageView) {
        this.f319313a = crVar;
        this.f319314b = imageView;
    }

    public final void onClick(View view) {
        C115041cr crVar = this.f319313a;
        C114878j.m190423a(crVar.f319150b, "main_menu", new C115040cq(crVar, this.f319314b));
    }
}
