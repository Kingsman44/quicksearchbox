package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f;

import android.view.View;
import android.view.ViewGroup;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.f.d */
/* compiled from: PG */
public final class C128625d {
    /* renamed from: a */
    public static final void m209921a(View view, int i) {
        C69664n.m101061g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
