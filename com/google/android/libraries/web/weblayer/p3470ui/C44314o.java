package com.google.android.libraries.web.weblayer.p3470ui;

import android.view.View;
import android.view.ViewGroup;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.ui.o */
/* compiled from: PG */
public final class C44314o {
    /* renamed from: a */
    public static final void m78229a(View view, C69626l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        lVar.mo5761a(marginLayoutParams);
        view.setLayoutParams(marginLayoutParams);
    }
}
