package com.google.android.libraries.lens.view.infopanel;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ad */
/* compiled from: PG */
public final class C26986ad {

    /* renamed from: a */
    public final InfoPanelHeader f73586a;

    /* renamed from: b */
    public final ViewGroup f73587b;

    /* renamed from: c */
    public final ViewGroup f73588c;

    /* renamed from: d */
    public final LottieAnimationView f73589d;

    /* renamed from: e */
    public final LinearProgressIndicator f73590e;

    public C26986ad(View view) {
        View findViewById = view.findViewById(R.id.panel_loading_bar);
        findViewById.getClass();
        this.f73590e = (LinearProgressIndicator) findViewById;
        View findViewById2 = view.findViewById(R.id.panel_header);
        findViewById2.getClass();
        this.f73586a = (InfoPanelHeader) findViewById2;
        View findViewById3 = view.findViewById(R.id.panel_content_container);
        findViewById3.getClass();
        this.f73588c = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(R.id.panel_content);
        findViewById4.getClass();
        this.f73587b = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.ghost_animation);
        findViewById5.getClass();
        this.f73589d = (LottieAnimationView) findViewById5;
    }
}
