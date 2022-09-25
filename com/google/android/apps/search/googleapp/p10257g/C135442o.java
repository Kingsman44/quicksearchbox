package com.google.android.apps.search.googleapp.p10257g;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.o */
/* compiled from: PG */
final class C135442o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ View f369000a;

    /* renamed from: b */
    final /* synthetic */ View f369001b;

    public C135442o(View view, View view2) {
        this.f369000a = view;
        this.f369001b = view2;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C69664n.m101061g(view, "<anonymous parameter 0>");
        C69664n.m101061g(windowInsets, "insets");
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int dimensionPixelSize = this.f369000a.getResources().getDimensionPixelSize(R.dimen.googleapp_hs_header_total_height);
        ViewGroup.LayoutParams layoutParams = this.f369000a.getLayoutParams();
        C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = dimensionPixelSize + systemWindowInsetTop;
        this.f369000a.setLayoutParams(layoutParams2);
        View findViewById = this.f369000a.findViewById(R.id.googleapp_doodle_background);
        ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
        C69664n.m101059e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.height = this.f369000a.getResources().getDimensionPixelSize(R.dimen.googleapp_hs_doodle_top_shelf_height) + systemWindowInsetTop;
        findViewById.setLayoutParams(layoutParams4);
        if (this.f369001b.getTranslationY() == 0.0f) {
            this.f369001b.setTranslationY((float) systemWindowInsetTop);
        }
        return windowInsets;
    }
}
