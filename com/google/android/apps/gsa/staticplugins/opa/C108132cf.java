package com.google.android.apps.gsa.staticplugins.opa;

import android.content.res.Resources;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cf */
/* compiled from: PG */
final class C108132cf extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C109040fj f300761a;

    public C108132cf(C109040fj fjVar) {
        this.f300761a = fjVar;
    }

    public final void getOutline(View view, Outline outline) {
        int i;
        Resources resources = this.f300761a.f303346c.getResources();
        if (this.f300761a.mo97528bv()) {
            i = R.dimen.chatui_titan_corner_radius;
        } else {
            i = C87566i.m142290an(this.f300761a.f303442g) ? R.dimen.chatui_tactile_corner_radius : R.dimen.chatui_corner_radius;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + dimensionPixelSize, (float) dimensionPixelSize);
    }
}
