package com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7326c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.ab.b.c.e */
/* compiled from: PG */
final class C92690e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f258727a;

    /* renamed from: b */
    final /* synthetic */ View f258728b;

    /* renamed from: c */
    final /* synthetic */ C92691f f258729c;

    public C92690e(C92691f fVar, View view, View view2) {
        this.f258729c = fVar;
        this.f258727a = view;
        this.f258728b = view2;
    }

    public final void onGlobalLayout() {
        int i;
        View rootView = this.f258727a.getRootView();
        if (rootView != null) {
            Rect rect = new Rect();
            rootView.getWindowVisibleDisplayFrame(rect);
            C92691f fVar = this.f258729c;
            fVar.f258730a = Math.min(fVar.f258730a, rootView.getHeight() - rect.bottom);
            int height = rootView.getHeight();
            int height2 = rect.height() + rect.top;
            C92691f fVar2 = this.f258729c;
            WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
            int i2 = 0;
            if (rootWindowInsets != null) {
                i = rootWindowInsets.getStableInsetBottom();
            } else {
                i = fVar2.f258730a;
                if (i == Integer.MAX_VALUE) {
                    i = 0;
                }
            }
            int i3 = height - (height2 + i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f258728b.getLayoutParams();
            if (i3 > 0) {
                i2 = Math.max(0, i3 - marginLayoutParams.bottomMargin);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f258727a.getLayoutParams();
            if (marginLayoutParams2.bottomMargin != i2) {
                marginLayoutParams2.bottomMargin = i2;
                this.f258727a.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
