package com.google.android.libraries.web.contrib.fullscreen.internal.p3383a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.web.contrib.fullscreen.internal.C43558a;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.libraries.web.contrib.fullscreen.internal.a.a */
/* compiled from: PG */
public final class C43559a implements C43558a {

    /* renamed from: a */
    private ViewGroup f113733a;

    /* renamed from: b */
    private View f113734b;

    /* renamed from: c */
    private int f113735c;

    /* renamed from: g */
    public final void mo46619g() {
        View view;
        ViewGroup viewGroup = this.f113733a;
        if (!(viewGroup == null || (view = this.f113734b) == null)) {
            viewGroup.addView(view, this.f113735c);
        }
        this.f113733a = null;
        this.f113734b = null;
    }

    /* renamed from: h */
    public final void mo46620h(View view) {
        ViewParent parent = view.getParent();
        C58893dc.m90996a(parent);
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f113733a = viewGroup;
        this.f113735c = viewGroup.indexOfChild(view);
        this.f113734b = view;
        ViewGroup viewGroup2 = this.f113733a;
        C58893dc.m90996a(viewGroup2);
        viewGroup2.removeView(view);
    }
}
