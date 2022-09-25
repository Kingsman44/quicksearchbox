package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.l */
/* compiled from: PG */
final class C113724l extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ ImageView f314955a;

    /* renamed from: b */
    final /* synthetic */ C113725m f314956b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113724l(C113725m mVar, ImageView imageView) {
        super("App icon drawable callback.");
        this.f314956b = mVar;
        this.f314955a = imageView;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f314955a.setImageDrawable(this.f314956b.getActivity().getDrawable(R.drawable.quantum_ic_settings_grey600_48));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null || !axVar.mo56113h()) {
            this.f314955a.setImageDrawable(this.f314956b.getActivity().getDrawable(R.drawable.quantum_ic_settings_grey600_48));
        } else {
            this.f314955a.setImageDrawable((Drawable) axVar.mo56107c());
        }
    }
}
