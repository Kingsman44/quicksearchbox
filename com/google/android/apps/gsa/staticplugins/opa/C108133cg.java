package com.google.android.apps.gsa.staticplugins.opa;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cg */
/* compiled from: PG */
final class C108133cg extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C109040fj f300762a;

    public C108133cg(C109040fj fjVar) {
        this.f300762a = fjVar;
    }

    public final void getOutline(View view, Outline outline) {
        int dimensionPixelSize = this.f300762a.f303346c.getResources().getDimensionPixelSize(R.dimen.chatui_titan_corner_radius);
        outline.setRoundRect(0, 0, view.getWidth() + dimensionPixelSize, view.getHeight(), (float) dimensionPixelSize);
    }
}
