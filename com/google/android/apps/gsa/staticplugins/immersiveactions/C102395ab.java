package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ab */
/* compiled from: PG */
public final class C102395ab {

    /* renamed from: a */
    public final int f285778a;

    /* renamed from: b */
    public final int f285779b;

    /* renamed from: c */
    public final ImmersiveActionsListenableScrollView f285780c;

    /* renamed from: d */
    public final ImmersiveActionsMinHeightLayout f285781d;

    /* renamed from: e */
    public final ImmersiveActionsHeader f285782e;

    /* renamed from: f */
    public final ImmersiveActionsArgumentContainerView f285783f;

    /* renamed from: g */
    public final ImmersiveActionsDisambiguationContent f285784g;

    /* renamed from: h */
    public final Context f285785h;

    /* renamed from: i */
    public int f285786i = 0;

    /* renamed from: j */
    public int f285787j;

    public C102395ab(Context context, ImmersiveActionsHeader immersiveActionsHeader, ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView, ImmersiveActionsMinHeightLayout immersiveActionsMinHeightLayout, ImmersiveActionsArgumentContainerView immersiveActionsArgumentContainerView, ImmersiveActionsDisambiguationContent immersiveActionsDisambiguationContent) {
        this.f285785h = context;
        this.f285782e = immersiveActionsHeader;
        this.f285780c = immersiveActionsListenableScrollView;
        this.f285783f = immersiveActionsArgumentContainerView;
        this.f285784g = immersiveActionsDisambiguationContent;
        this.f285781d = immersiveActionsMinHeightLayout;
        this.f285778a = context.getResources().getDimensionPixelSize(R.dimen.immersive_actions_collapsing_header_height);
        this.f285779b = context.getResources().getDimensionPixelSize(R.dimen.gsa_immersive_actions_header_height);
    }
}
