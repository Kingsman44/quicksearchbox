package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.be */
/* compiled from: PG */
final class C113550be extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ Context f314359a;

    public C113550be(Context context) {
        this.f314359a = context;
    }

    public final void getOutline(View view, Outline outline) {
        int dimensionPixelSize = this.f314359a.getResources().getDimensionPixelSize(R.dimen.chatui_corner_radius);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + dimensionPixelSize, (float) dimensionPixelSize);
    }
}
