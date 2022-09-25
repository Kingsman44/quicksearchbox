package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.u */
/* compiled from: PG */
public final class C110157u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C110161y f306928a;

    public C110157u(C110161y yVar) {
        this.f306928a = yVar;
    }

    public final void onGlobalLayout() {
        DisplayCutout displayCutout;
        this.f306928a.f306954d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        WindowInsets rootWindowInsets = this.f306928a.f306954d.getRootWindowInsets();
        if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            C110161y yVar = this.f306928a;
            View view = yVar.f306940H;
            if (view == null) {
                view = yVar.f306956f;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, displayCutout.getSafeInsetTop() + this.f306928a.f306953c.getResources().getDimensionPixelSize(R.dimen.app_icon_padding_top_reduced), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
