package com.google.android.apps.gsa.staticplugins.opa.p8279an;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.an.a */
/* compiled from: PG */
public final class C107126a {

    /* renamed from: a */
    public FrameLayout f298203a;

    /* renamed from: b */
    public FrameLayout f298204b;

    /* renamed from: a */
    public final View mo95791a(LayoutInflater layoutInflater, View view) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.overlay_decor_view, (ViewGroup) null);
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.opa_content_view);
        frameLayout2.addView(view);
        this.f298203a = frameLayout2;
        this.f298204b = (FrameLayout) frameLayout.findViewById(R.id.opa_top_level_overlay);
        return frameLayout;
    }
}
