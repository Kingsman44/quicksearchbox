package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.aj */
/* compiled from: PG */
final class C130203aj extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C130204ak f356961a;

    public C130203aj(C130204ak akVar) {
        this.f356961a = akVar;
    }

    public final void getOutline(View view, Outline outline) {
        int dimensionPixelSize = this.f356961a.f356963b.requireContext().getResources().getDimensionPixelSize(R.dimen.assistant_drl_webview_corner_radius);
        outline.setAlpha(0.0f);
        outline.setRoundRect(0, 0, view.getWidth() + dimensionPixelSize, view.getHeight(), (float) dimensionPixelSize);
    }
}
