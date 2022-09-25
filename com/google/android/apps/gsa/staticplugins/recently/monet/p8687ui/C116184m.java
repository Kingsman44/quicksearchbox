package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.m */
/* compiled from: PG */
public final /* synthetic */ class C116184m implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322154a;

    /* renamed from: b */
    public final /* synthetic */ RecentlyView f322155b;

    public /* synthetic */ C116184m(C116166ai aiVar, RecentlyView recentlyView) {
        this.f322154a = aiVar;
        this.f322155b = recentlyView;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C116166ai aiVar = this.f322154a;
        RecentlyView recentlyView = this.f322155b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int dimensionPixelOffset = aiVar.f322103e.getDimensionPixelOffset(R.dimen.screenshot_width);
        if (booleanValue) {
            dimensionPixelOffset -= 100;
        }
        recentlyView.f322219g = dimensionPixelOffset;
    }
}
