package com.google.android.apps.search.googleapp.p10257g;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.s */
/* compiled from: PG */
public final class C135446s {
    /* renamed from: a */
    public static final View m219611a(Fragment fragment, int i) {
        View r = C2043bi.m5589r(fragment.requireView(), i);
        C69664n.m101060f(r, "requireViewById<T>(requireView(), id)");
        return r;
    }

    /* renamed from: b */
    public static final void m219612b(ImageView imageView, int i) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i);
        imageView.setLayoutParams(marginLayoutParams);
    }
}
